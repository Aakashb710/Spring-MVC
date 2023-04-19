<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: aakashb
  Date: 19-04-2023
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Model</title>
</head>
<body>
    <h1>This is model page</h1>
    <%
      String name = (String) request.getAttribute("name");
      Integer id = (Integer) request.getAttribute("id");
      List<String> ll = (List<String>) request.getAttribute("list");
    %>

    <h2>My name is <%=name%></h2>
    <h2>My id is <%=id%></h2>

    <%
        for (String s:ll) { %>

    <h1>My friends are <%=s%></h1>

       <% }%>
</body>
</html>
