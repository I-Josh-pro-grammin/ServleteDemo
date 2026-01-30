<%--
  Created by IntelliJ IDEA.
  User: JOSH
  Date: 1/30/2026
  Time: 9:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<%!
  int divide(int a, int b) {
      return a/b;
  }
%>
<html>
<head>
    <title>JSP</title>
</head>
<body>
  <%
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));
    int sum = divide(num1, num2);
//    out.println();
  %>
  Sum is: <%=sum %>
</body>
</html>
