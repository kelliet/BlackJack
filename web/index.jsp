
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Black Jack</title>
  </head>
  <body>
  <tr><td>Welcome to BlackJack</td></tr>
  <br>
  <tr><td>The dealer stands at 17 or above, hits 16 or below.</td></tr>


  <form method="post" action="blackjack">

    <input type="SUBMIT" name="action" value="hit">
    <input type="SUBMIT" name="action" value="stand">

    <br>
    <table>
    <%=request.getAttribute("message")%>
  </table>
    <br>
  </form>
  </body>
</html>
