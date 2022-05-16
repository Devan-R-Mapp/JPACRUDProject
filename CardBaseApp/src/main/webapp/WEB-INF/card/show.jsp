<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Card</title>
<jsp:include page="../bootstrapjsp.jsp"></jsp:include>
<jsp:include page="../nav.jsp" ></jsp:include>
</head>
<body>


<div>
  <h5>${card.cardName}</h5>				
  <form action="deleteCard.do">
				<input type="submit" value="Delete Card" />
				<input style="display:none" name="id" value="${card.id }" />
			</form>
			  <form action="updateCard.do">
				<input type="submit" value="Update Card" />
				<input style="display:none" name="id" value="${card.id }" />
			</form>
			
<img src="${card.image }" alt="${card.cardName} style="width:50px;height:60px;">
</div>

</body>
</html>