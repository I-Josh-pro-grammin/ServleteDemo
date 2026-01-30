<%--
  Created by IntelliJ IDEA.
  User: JOSH
  Date: 1/30/2026
  Time: 9:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Error Page</title>
</head>
<body>
  <h2 style="color: #ff0000;">Somothin went wrong</h2>
  <p>Error: <%=exception.getMessage() %></p>
  <p>
      <a href="index.jsp">Try again here</a>
  </p>
</body>
</html>
