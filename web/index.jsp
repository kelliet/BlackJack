
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Black Jack</title>
  </head>
  <body>
    <tr>
      <td>Welcome to BlackJack</td>
    </tr>
    <tr>
      <td>The dealer stands at 17 or above, hits 16 or below.</td>
    </tr>
    <form method="post" action="blackjack">
      <table>
        <!--
          2 groups; one for dealer cards & one for player cards
          cards listed as 'He', 'Cl', 'Di', 'Sp' plus the number
        -->
        <%=request.getAttribute("message")%>
      </table>
      <input type="SUBMIT" name="action" value="hit">
      <input type="SUBMIT" name="action" value="stand">
    </form>
  </body>
</html>
