<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hades Card App</title>
</head>
<body>
<%@ include file="nav.jsp" %>

	<h1>Here are all the cards that are currently in the system.</h1>


	<ul>
		<c:forEach var="card" items="${cards }">
			<li><a href="getCard.do?fid=${card.id }">${card.cardName} </a></li>
		</c:forEach>
	</ul>
</body>
</html>