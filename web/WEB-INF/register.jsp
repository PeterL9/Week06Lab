<%-- 
    Document   : register
    Created on : Mar 7, 2021, 4:32:11 PM
    Author     : 799768
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <form method="post" action="shoppingList">
            Username: <input type="text" name="username" autofocus>
            <input type="hidden" name="action" value="register">
            <br>
            <input type="submit" value="Register"><br>
        </form>
    </body>
</html>
