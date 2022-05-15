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

	<h1>Welcome to the card app.</h1>

	<form action="getCard.do" method="GET">
		Do you know the card ID: <input type="number" name="fid" /> <input type="submit"
			value="Show Card" />
	</form>
	
	<form action="createCard.do">
	<input type="submit" value="Create a new card">
	</form>
	
	<ul>
		<c:forEach var="card" items="${cards }">
			<li><a href="getCard.do?fid=${card.id }">${card.cardName} </a></li>
		</c:forEach>
	</ul>
</body>
</html>