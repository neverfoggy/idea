<%--
  Created by IntelliJ IDEA.
  User: never
  Date: 02.01.2019
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="controller.Controller"%>
<html><head><title>Login</title>





</head>
<body>

<form name="orderForm" method="POST" action="controller">
    <input type="hidden" name="command" value="gotoform" />
    <br/>
    <div class="container">
    <button id="button" type="submit" value="make order!" class="required"/> make order </button>
    </div>
</form><hr/>
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>

<script type="text/javascript">
    <%@include file="../js/script.js"%>
</script>
</body></html>
