<%-- 
    Document   : login
    Created on : 16-mag-2017, 11.23.55
    Author     : sanna
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>NerdBook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Federico Sanna">
        <meta name="keywords" content="social network friends login">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    
    <body>
        
        <jsp:include page="header.jsp"/>
        
        <nav>
            <c:set var="page" value="login" scope="request"/>
            <jsp:include page="nav.jsp"/>
        </nav>
        
        <c:if test="${invalidData == true}">
            <div id="invalidDataWarning">I dati inseriti non sono corretti</div>
        </c:if>
        
        <div id="textLogin">
            <p>Inserisci i dati per entrare nel tuo profilo!</p>
        </div>
        
        <div id="formLogin">
            <form action="Login" method="post">
                <label for="username">Username</label>
                <input type="text" name="username" id="username">
                
                <label for="password">Password</label>
                <input type="password" name="password" id="password">
                
                <button type="submit">Entra!</button>
            </form>
        </div>
        
    </body>
</html>
