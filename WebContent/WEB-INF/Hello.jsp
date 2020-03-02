<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%-- Import d'une classe --%>
<%@ page import="fr.tsv.beans.Hero" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1st</title>
</head>
<body>
<h1>Coucou, Monde !</h1>

<p>
	<%-- Commentaire JSP --%>
	<%-- Attribute est un objet ajouté à l'objet HttpServletRequest --%>
<%
	String message = (String) request.getAttribute("message");
	out.println(message);
%>
</p>
	<%-- Parameter correspond à un paramètre de la query string du GET --%>
<p>
<%
	String hero = request.getParameter("hero");
	out.println(hero);
%>
</p>
<%
	Hero mori = (Hero) request.getAttribute("mori");
	out.println(mori.getNom());
	out.println(mori.getPrenom());
%>
</body>
</html>