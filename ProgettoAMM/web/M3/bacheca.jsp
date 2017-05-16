<%-- 
    Document   : bacheca
    Created on : 16-mag-2017, 11.32.58
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
        <meta name="keywords" content="social network bacheca post notizie">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    
    <body>
        
        
        <jsp:include page="header.jsp"/>
        
        <nav>
            <c:set var="page" value="bacheca" scope="request"/>
            <jsp:include page="nav.jsp"/>
            <!--
            Includo solo il tag ol nel nav.jsp in modo tale che in bacheca
            potrò poi avere anche il div per il logout.
            -->
            <div id="content">
                <div id="logout">
                    <h4>${user.nome}</h4>               
                    <p><a href="#">Logout</a></p>
                </div>
            </div>
        </nav>
        
        <jsp:include page="sideBar.jsp"/>
        
        <div id="bacheca">
            
            <div class="post">
                <div class="profilePic">
                    <img title="profilo1" alt='Foto' src='${user.profilePic}'>
                </div>
                <div class="nome">
                    <h4>Paolo Bitta</h4>
                </div>
                <div class="text">
                    <p>
                        Stasera vado al cinema a dormire, buonanotte.
                    </p>
                </div>
            </div>
            
            <div class="post">
                <div class="profilePic">
                    <img title="profilo2" alt='Foto' src='img/zero.jpg'>
                </div>
                <div class="nome">
                    <h4>Renato Uno</h4>
                </div>
                <div class="text">
                    <p>
                        Ho mangiato un tramezzino da Ghiani. Era quadrato.
                    </p>
                </div>
                <img class="attach" title="attach1" alt='Foto' src='img/tramezzino.jpg'>
            </div>
            
            <div class="post">
                <div class="profilePic">
                    <img title="profilo3" alt='Foto' src='img/gianna.jpg'>
                </div>
                <div class="nome">
                    <h4>Gianna Filata</h4>
                </div>
                <div class="text">
                    <p>
                        Se ascoltate le canzoni di Gigi D'Alessio siete brutti.
                        <a href='https://www.youtube.com'>https://www.youtube.com/</a>
                    </p>
                </div>
            </div>
            
        </div>
    
    </body>
</html>
