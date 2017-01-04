package com.company;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import static com.company.Main.getHandTotal;


public class MainController extends HttpServlet{


    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException{

        String action = request.getParameter("action");

        StringBuffer output = new StringBuffer();
        ArrayList<Card> deck = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = Card.TWO; j <= Card.ACE; j++) {
                deck.add(new Card(i, j));
            }
        }

        Collections.shuffle(deck);
        ArrayList<Card> dealer = new ArrayList<>();
        ArrayList<Card> player = new ArrayList<>();

        dealer.add(deck.remove(0));
        player.add(deck.remove(0));

        dealer.add(deck.remove(0));
        player.add(deck.remove(0));
        //Display hands
        Main.printDealerHand(dealer, true, output);
        //Ask what player wants to do
        System.out.println("action: " + action);
                player.add(deck.remove(0));
                Main.printDealerHand(dealer, true, output);
                Main.printPlayerHand(player, output);

                if (getHandTotal(player, false) > 21) { //BUST
                    System.out.println();

                    Main.printDealerHand(dealer, false, output);
                    Main.printPlayerHand(player, output);
                    output.append("Player Busted, Dealer Wins <br>");
                    System.out.println("Player Busted, Dealer Wins");
                } else {
                    System.out.println("Press H to hit, S to stand");
                    if (getHandTotal(player, false) > 21) {
                        System.out.println();

                        Main.printDealerHand(dealer, false, output);
                        Main.printPlayerHand(player, output);
                        System.out.println("Player Busted, Dealer Wins");
                    } else {
                        Main.printDealerHand(dealer, false, output);
                        Main.printPlayerHand(player, output);

                        int dealerTotal = getHandTotal(dealer, true);
                        int playerTotal = getHandTotal(player, true);
                        if (playerTotal > 21) {
                            playerTotal = getHandTotal(player, false);
                        }

                        //Determine Dealer Actions
                        if (dealerTotal > 16) { //Dealer stands
                            System.out.println("Dealer Stands");
                            Main.printResults(dealerTotal, playerTotal, output);
                        } else { //Dealer hits
                            boolean stand = false;
                            boolean bust = false;
                            while (!stand && !bust) {
                                System.out.println("Dealer Hits");
                                dealer.add(deck.remove(0));

                                Main.printDealerHand(dealer, false, output);
                                Main.printPlayerHand(player, output);

                                dealerTotal = getHandTotal(dealer, true);

                                if (dealerTotal > 16 && dealerTotal <= 21) { //If valid hand, stand
                                    stand = true;
                                } else { //If higher then 21, check with ace low, if still higher then 21, bust, else continue and hit
                                    if (dealerTotal > 21) {
                                        dealerTotal = getHandTotal(dealer, false);

                                        if (dealerTotal > 21) {
                                            bust = true;
                                        } else if (dealerTotal > 16) {
                                            stand = true;
                                        }
                                    }
                                    if (bust) {
                                        System.out.println("Dealer Busted, Player Wins");
                                    } else if (stand) {
                                        dealerTotal = getHandTotal(dealer, true);
                                        if (dealerTotal > 21) {
                                            dealerTotal = getHandTotal(dealer, false);
                                        }
                                        playerTotal = getHandTotal(player, true);
                                        if (playerTotal > 21) {
                                            playerTotal = getHandTotal(player, false);
                                        }
                                        System.out.println("Dealer Stands");
                                        Main.printResults(dealerTotal, playerTotal, output);
                                    }

                                }
                            }

                        }
                   }

            }

        request.setAttribute("message",output.toString());
        RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
        view.forward(request, response);

    }


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException{
        System.out.println();
        doPost(request,response);

    }

}
