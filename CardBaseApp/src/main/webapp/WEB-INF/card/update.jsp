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
<div class="updateCardForm">
	<form action="updateACardToTheDatabase.do" method="POST">

		<label for="setAbbr">Set Abbreviation:</label> <input type="text" name="setAbbr" value="RTR" readonly required><br>
		<label for="cardName">Card Name:</label> <input type="text" name="cardName" value = "${card.cardName}" required><br>
		Is this card legendary? <br>
		<label for="legendary">Yes</label> <input type="radio" value="true" name="legendary"> <br> 
		<label for="legendary">No</label> <input type="radio" value="false" name="legendary"> <br> 
		
		<label for="cardType">Card Type:</label> <select name="cardType" value = "${card.cardType }" required>
		
			<option value="none" selected disabled hidden>Select an Option</option>
			<option value="Creature">Creature</option>
			<option value="Planeswalker">Planeswalker</option>
			<option value="Artifact">Artifact</option>
			<option value="Instant">Instant</option>
			<option value="Sorcery">Sorcery</option>
			<option value="Land">Land</option>
		</select><br>
		 <label for="cardSubType">Card Subtype:</label> <input type="text" name="cardSubText"  value = "${card.cardSubType }"><br> 
		 <label for="cardText">Card Text</label> <input type="text" name="cardText"  value = "${card.cardText }"><br>
		  <label for="image">Image link:</label> <input type="url" name="image"  value = "${card.image }" ><br> 
		  
		  <label for="color">Color:</label> <select name="color" required><br>
		  <option value="none" selected disabled hidden>Select an Option</option>
			<option value="White">White</option>
			<option value="Blue">Blue</option>
			<option value="Black">Black</option>
			<option value="Red">Red</option>
			<option value="Green">Green</option>
			<option value="Artifact">Artifact</option>
			<option value="Gold">Gold</option>
			<option value="Land">Land</option>
		</select><br>
		
		  <label for="setPosition">Set Position:</label> <input type="number" name="setPosition" ${card.setPosition } required><br>
		  <label for="Rarity">Rarity:</label> <input type="text" name="Rarity" required minlength="1" maxlength="2" value = "${card.rarity }"><br>
		  <label for="cmc">Converted Mana cost:</label> <input type="number" name="cmc" value = ${card.cmc }><br>
		  <label for="mc">Mana cost:</label> <input type="text" name="mc" value = ${card.mc }><br>
		  <label for="power">Power:</label> <input type="number" name="power" value = ${card.power }><br>
		  <label for="toughness">Toughness:</label> <input type="number" name="toughness" value = ${card.toughness }><br>
		  <label for="loyalty">Loyalty:</label> <input type="number" name="loyalty" value = ${card.loyalty }><br>
		  <input type="number" hidden="hidden" readonly name="id" value = ${card.id }><br>
		   
		
		
		<input type="submit" name="card" value="Submit" />

	</form>
</div>
</body>
</html>