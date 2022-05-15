<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create A Card</title>
<jsp:include page="../bootstrapjsp.jsp"></jsp:include>
<jsp:include page="../nav.jsp" ></jsp:include>
</head>
<body>
<div class="createCardForm">
	<form action="addACardToTheDatabase.do" method="POST">

		<label for="setAbbr">Set Abbreviation:</label> <input type="text" name="setAbbr" value="RTR" readonly required><br>
		<label for="cardName">Card Name:</label> <input type="text" name="cardName" required><br>
		Is this card legendary? <br>
		<label for="legendary">Yes</label> <input type="radio" value="true" name="legendary"> <br> 
		<label for="legendary">No</label> <input type="radio" value="false" name="legendary"> <br> 
		<label for="cardType">Card Type:</label> <select name="cardType" required>
			<option value="Creature">Creature</option>
			<option value="Planeswalker">Planeswalker</option>
			<option value="Artifact">Artifact</option>
			<option value="Instant">Instant</option>
			<option value="Sorcery">Sorcery</option>
			<option value="Land">Land</option>
		</select><br>
		 <label for="cardSubType">Card Subtype:</label> <input type="text" name="cardSubText"><br> 
		 <label for="cardText">Card Text</label> <input type="text" name="cardText"><br>
		  <label for="image">Image link:</label> <input type="url" name="image" ><br> 
		  
		  <label for="color">Color:</label> <select name="color" required><br>
			<option value="White">White</option>
			<option value="Blue">Blue</option>
			<option value="Black">Black</option>
			<option value="Red">Red</option>
			<option value="Green">Green</option>
			<option value="Artifact">Artifact</option>
			<option value="Gold">Gold</option>
			<option value="Land">Land</option>
		</select><br>
		
		  <label for="setPosition">Set Position:</label> <input type="number" name="setPosition" required><br>
		  <label for="Rarity">Rarity:</label> <input type="text" name="Rarity" required minlength="1" maxlength="2"><br>
		  <label for="cmc">Converted Mana cost:</label> <input type="number" name="cmc" ><br>
		  <label for="mc">Mana cost:</label> <input type="text" name="mc" ><br>
		  <label for="power">Power:</label> <input type="number" name="power" ><br>
		  <label for="toughness">Toughness:</label> <input type="number" name="toughness" ><br>
		  <label for="loyalty">Loyalty:</label> <input type="number" name="loyalty" ><br>
		   
		
		
		<input type="submit" name="card" value="Submit" />

	</form>
</div>
</body>
</html>