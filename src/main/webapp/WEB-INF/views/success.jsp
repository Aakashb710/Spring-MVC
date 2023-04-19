<%--
  Created by IntelliJ IDEA.
  User: aakashb
  Date: 19-04-2023
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Model & View</title>
</head>
<body>

<h1>This is model & view page</h1>

  <%
    String name = (String) request.getAttribute("name");
  %>

<h1>Viewer's name is <%=name%></h1>
</body>
</html>
