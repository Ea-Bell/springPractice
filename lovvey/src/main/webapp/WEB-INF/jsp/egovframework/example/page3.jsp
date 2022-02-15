<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script type="text/javascript">		
	
	

	function selectCountry(eng, kor){
		// document.domain="www.localhost:8989";
		console.log(document.domain);
		
		let	sendData={ "eng":eng, "kor":kor, url:"lovvey/page3", "check": "selectCountry"};
			console.log(sendData);
			console.log(sendData["kor"]);
			//window.parent.postMessage(JSON.stringify(sendData),"http://www.localhost:8989");
			
			opener.document.getElementById("country_eng").value=eng;
			opener.document.getElementById("country_kor").value=kor;
			//window.close();
		}
</script>
</head>
<body>
 		
<table border="1px" style="border-collapse: collapse;"  >
	<th>ENG</th>
	<th>KOR</th>
	
	<c:forEach var="page3" items="${page3}" varStatus="status">
	<tr>
		<td>${page3.eng }</td>
		<td>${page3.kor }</td>
		<td style="border-bottom: none; border-right: none; border-top: none" ><input id="selectCountry" name="selectCountry" type="button" onclick="selectCountry('${page3.eng}','${page3.kor }')"  value="선택"></td>
	</tr>
	</c:forEach>
	</table>	
</body>
</html>