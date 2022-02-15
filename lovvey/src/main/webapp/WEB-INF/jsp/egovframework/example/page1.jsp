<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script type="text/javascript">

	function listPage2Select(url) {
	let path=	"http://localhost/lovvey/page2/"+url;
	sendData={"check":"listPage2Select", "path":path,"url":"page2/"+url}
	
	window.parent.postMessage(JSON.stringify(sendData),'http://localhost:80');
	}

</script>
</head>
<body>

	<div style="border: 1px solid black">
	<form action="/lovvey/select" method="get">
	
			<p>사업자 번호 <input type="text" id="busiNum" name="busiNum"></p>
			<p>거래처 명  <input type="text" id="custom" name="custom"><button formaction="/lovvey/page1/searchPage1" formmethod="get">조회</button> </p>
		
	</form>
	</div>
	<br>
	
	<table border="1px" style="border-collapse: collapse;"  >
	<th>사업자 번호</th>
	<th>거래처명</th>
	<c:forEach var="page1" items="${page1}" varStatus="status">
	<tr>
		<td><a id="listPage2" href=# onclick="listPage2Select('${page1.busiNum}')">${page1.busiNum}</a></td>
		<td>${page1.custom}</td>
	</tr>
	</c:forEach>
	</table>	
	<button formaction="/lovvey/page2" formmethod="get">등록</button> <%-- 등록 화면으로 이동 --%>
</body>
</html>