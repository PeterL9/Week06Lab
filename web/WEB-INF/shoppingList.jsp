<%-- 
    Document   : shoppingList
    Created on : Mar 7, 2021, 4:32:21 PM
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
        Hello, ${username} <a href="?logout">Logout</a><br>
        
        <h3>List</h3>
        Add item: <input type="text" name="item">
        <input type="submit" value="Add">
        
        <list>
            <c:forEach var="item" items="${items}">
            <li><input type="radio" value="delete">${item}</li>
            </c:forEach>
        </list>
    </body>
</html>
