<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- https://podo1017.tistory.com/58 c:if참고  -->
<form action="/lovvey/page2/update" method="post">
	
	<div style="border: 1px solid black;">
	
	<c:forEach var="page2" items="${listPage2}">
	<P> 사업자 번호  <input type="text" id="busiNum" name="busiNum" value="${page2.busiNum}">  <input type="text" id="customShort" name="customShort" value="${page2.customShort}">  </P>
	<p>	거래처명 <input type="text" id="custom" name="custom" value="${page2.custom}"></p>
	<p> 대표자 <input type="text" id="ceo" name="ceo" value="${page2.ceo }"> 담당자 <input type="text"id="chargePerson" name="chargePerson" value="${page2.chargePerson }"> </p>
	<p> 업태 <input type="text" id="busiCondition" name="busiCondition" value="${page2.busiCondition }"> 종목 <input type="text" id="item" name="item" value="${page2.item }"></p>
    <p>우편번호 <input type="text" id="postNum" name="postNum" placeholder="우편번호" value="${page2.postNum }"> <input type="button" onclick="sample2_execDaumPostcode()"   value="검색">
         주 소1<input type="text" id="address" name="address" placeholder="주소" value="${page2.addr1 }"></p>
    <p>주소2<input type="text" id="detailAddress" name="detailAddress" placeholder="상세주소" value="${page2.addr2 }"></p>
    <p> 전화번호<input type="text" id="tel" name="tel" value="${page2.tel }"> 팩스번호<input type="text" id="fax" name="fax" value="${page2.fax }"></p>
    <p> 홈페이지<input type="text" id="homepage" name="homepage" value="${page2.homepage }"></p>
	
	<p>
	<c:if test="${page2.coYn eq 'c'}">
		 법인여부  법인<input type="radio" name="coYn" value="c" checked="checked"> 
		 개인<input type="radio" name="coYn" value="p">
	</c:if>	
	<c:if test="${page2.coYn eq 'p'}">
		법인여부  법인<input type="radio" name="coYn" value="c" >
		 개인<input type="radio" name="coYn" value="p" checked="checked">
	 </c:if>	
		
	<c:if test="${page2.foreignYn eq 'd' }">
		해외 여부 국내<input type="radio" name="foreignYn" value="d" checked="checked"> 
		해외<input type="radio" name="foreignYn" value="o"> 	
	</c:if>
		
	<c:if test="${page2.foreignYn eq 'o' }">
		해외 여부 국내<input type="radio" name="foreignYn" value="d"> 
		해외<input type="radio" name="foreignYn" value="o" checked="checked"> 	
	</c:if>		
	</p>
	
	<p> 과세구분 <select id="taxYn" name="taxYn" size="1">
		<c:if test="${page2.taxYn eq 't'}">
			<option value="t" >과세/면세</option>
			<option value="f">비과세</option>
		</c:if>
		<c:if test="${page2.taxYn eq 'f'}">
			<option value="f">비과세</option>
			<option value="t" >과세/면세</option>
		</c:if>
	</select> 
	
	국 가 <input type="text" name="country_eng" id="country_eng" value="${page2.country_eng }"> <input type="text" name="country_kor"id="country_kor" value="${page2.country_kor }"> <button type="button" onclick="windowPopup()">검색</button>
	</p>
	
	<p>
	<c:choose>
	<c:when test="${page2.specialRelation eq 't' }">
		특수관계자<input type="checkbox" id="specialRelation" name="specialRelation" value="t" checked="checked">
		거래중지<input type="checkbox" id="tradeStop" name="tradeStop" value="f">
	</c:when>
	<c:when test="${page2.tradeStop == 't' and page2.specialRelation == 'f'}">
		특수관계자<input type="checkbox" id="specialRelation" name="specialRelation" value="t">
		거래중지<input type="checkbox" id="tradeStop" name="tradeStop" value="f">
	</c:when>
	<c:otherwise >
		특수관계자<input type="checkbox" id="specialRelation" name="specialRelation" value="t">
		거래중지<input type="checkbox" id="tradeStop" name="tradeStop" value="f">
	</c:otherwise>
	</c:choose>
	<input type="hidden" name="specialRelation" value="f"><input type="hidden" name="tradeStop" value="f"> 
	 </p>
	
	<p>계약기간 <input type="date" id="contractPeriodS" name="contractPeriodS" value="${page2.contractPeriodS }"> <input type="date" id="contractPeriodE" name="contractPeriodE" value="${page2.contractPeriodE }"></p>
	<p>등록 정보 <input type="text" id="regiInfoMan" name="regiInfoMan" value="${page2.regiInfoMan}" readonly="readonly"> <input type="text" id="regiInfoDate" name="regiInfoDate" readonly="readonly" value="${page2.regiInfoDate }">
	     변경 정보 <input type="text" id="modiInfoMan" name="modiInfoMan" readonly="readonly" value="${page2.modiInfoMan}"> <input type="text" id="modiInfoDate" name="modiInfoDate" readonly="readonly" value="${page2.modiInfoDate }"></p>
						<!-- ㅑregiInfoMan은 로그인한 사람의 이름이 뜨는거라 불면이다. -->
	<p>(거래처 계좌 정보)</p>
	
	<table border="1px">
		<th>사무소</th>
		<th>은행</th>
		<th>계좌번호</th>
		<tr>
			<td><input type="text" id="factory" name="factory" value="${page2.factory }"></td>
			<td><input type="text" id="tradeBank" name="tradeBank" value="${page2.tradeBank }"></td>
			<td><input type="text" id="accountNum" name="accountNum" value="${page2.accountNum }"></td>
		</tr>
	</table>
	<br>
	</c:forEach>
	</div>	
	<button type="submit" onclick="sucessAlert()">전송</button>
	</form>		
</body>

<script type="text/javascript">
	function sucessAlert() {
		alert("저장되었습니다.")
	}

</script>




</html>