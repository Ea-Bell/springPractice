<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/lovvey/savePage2" method="post">
	<div style="border: 1px solid black;">
	<P> 사업자 번호 <input type="text" id="busiNum" name="busiNum">  약 칭 <input type="text" id="customShort" name="customShort">  </P>
	<p>	거래처명 <input type="text" id="custom" name="custom"></p>
	<p> 대표자 <input type="text" id="ceo" name="ceo"> 담당자 <input type="text"id="chargePerson" name="chargePerson"> </p>
	<p> 업태 <input type="text" id="busiCondition" name="busiCondition"> 종목 <input type="text" id="item" name="item"></p>
    <p>우편번호 <input type="text" id="postNum" name="postNum" placeholder="우편번호"> <input type="button" onclick="sample2_execDaumPostcode()"   value="검색">
         주 소1<input type="text" id="address" name="address" placeholder="주소"></p>
    <p>주소2<input type="text" id="detailAddress" name="detailAddress" placeholder="상세주소"> <input type="text" id="extraAddress" name="extraAddress" placeholder="참고항목"></p>
    <p> 전화번호<input type="text" id="tel" name="tel"> 팩스번호<input type="text" id="fax" name="fax">
    <p> 홈페이지<input type="text" id="homepage" name="homepage"></p>
	<p> 법인여부  법인<input type="radio" name="coYn" value="c">  개인<input type="radio" name="coYn" value="p">
		해외 여부 국내<input type="radio" name="foreignYn" value="d"> 해외<input type="radio" name="foreignYn" value="o"> 	
	</p>
	<p> 과세구분 <select id="taxYn" name="taxYn" size="1">
		<option value="t" >과세/면세</option>
		<option value="f">비과세</option>
	</select> 
	
	국 가 <input type="text" name="country_eng" id="country_eng"> <input type="text" name="country_kor"id="country_kor"> <button type="button" onclick="windowPopup()">검색</button>
	</p>
	<p>특수관계자<input type="checkbox" id="specialRelation" name="specialRelation" value="t"> 거래중지<input type="checkbox" id="tradeStop" name="tradeStop" value="f">
	<input type="hidden" name="specialRelation" value="f"><input type="hidden" name="tradeStop" value="f">
	<p>계약기간 <input type="date" id="contractPeriodS" name="contractPeriodS"> <input type="date" id="contractPeriodE" name="contractPeriodE"></p>
	<p>등록 정보 <input type="text" id="regiInfoMan" name="regiInfoMan" value="로그인한이름" readonly="readonly"> <input type="text" id="regiInfoDate" name="regiInfoDate" readonly="readonly">
	     변경 정보 <input type="text" id="modiInfoMan" name="modiInfoMan" readonly="readonly"> <input type="text" id="modiInfoDate" name="modiInfoDate" readonly="readonly"></p>
						<!-- ㅑregiInfoMan은 로그인한 사람의 이름이 뜨는거라 불면이다. -->
	<p>(거래처 계좌 정보)</p>
	
	<table border="1px">
		<th>사무소</th>
		<th>은행</th>
		<th>계좌번호</th>
		<tr>
			<td><input type="text" id="factory" name="factory"></td>
			<td><input type="text" id="tradeBank" name="tradeBank"></td>
			<td><input type="text" id="accountNum" name="accountNum"></td>
		</tr>
	</table>
	<br>
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