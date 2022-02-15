<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div {
	
		width: 100%;
		height: 750px;	
	}
	div.page1View{
		width: 20%;
		float:left;
		border: none;
	}
	div.listPage2View{
		width: 50%;
		float: right;
		border: none;
	}
	iframe{

		border: none;
	}	
</style>
 <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script type="text/javascript">

window.addEventListener("message", handleDocHeightMsg, false);

	function handleDocHeightMsg(eventObj){
		console.log(eventObj);
		if(JSON.parse(eventObj.data).check =="listPage2Select"){
<%-- 참고용 코드
			console.log(eventObj.data);
			console.log(JSON.parse(eventObj.data).path)
			console.log(JSON.parse(eventObj.data).url)
			console.log(eventObj.origin)
--%>

			$("#iframPage2").attr("src",JSON.parse(eventObj.data).path);	
		}
		if(JSON.parse(eventObj.data).check=="selectCountry")
			console.log("page4이벤트 실행중입니다.")
		$("#country_eng").attr("value",JSON.parse(eventObj.data).kor);
	}
</script>
</head>
<body>


<div>
	<div class="page1View" >
		<iframe class="iframPage1" id="iframPage1" src="http://localhost/lovvey/page1" width="100%" height="750px" >
		
		
		
		
		</iframe>
	</div>
	
	<div class="listPage2View" id="listPage2View">
		<iframe class="iframPage2" id="iframPage2" src="http://localhost/lovvey/page2" width="100%" height="900px">
		
		
		
		
		</iframe>
	</div>
</div>
</body>
</html>