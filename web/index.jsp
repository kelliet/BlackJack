
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Black Jack</title>
  </head>
  <body>
    <h1>Welcome to BlackJack</h1>
    <p class="status">The dealer stands at 17 or above, hits 16 or below.</p>
    <p class="status winner">Player Busted, Dealer Wins</p>
    <div class="dealer hand">
      <span class="card spade">9</span>
      <span class="card heart">1</span>
    </div>
    <div class="player hand">
      <span class="card heart">14</span>
    </div>
    <form method="post" action="blackjack">
      <input type="SUBMIT" name="action" value="Play">
        <%=request.getAttribute("message")%>
    </form>
  </body>
</html>
