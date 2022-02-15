<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
              
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('postNum').value = data.zonecode;
                document.getElementById("addr1").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("addr2").focus();
            }
        }).open();
       
    }
    
    
    
</script>

<script type="text/javascript">

	window.addEventListener("message", handleDocHeightMsg, false);
	
	function sucessAlert() {
		alert("저장되었습니다.")
		window.parent.location.reload();
	}
	function countrykorAndEngWindow() {
		
		   window.open('http://localhost/lovvey/page3','window_name','width=75,height=200,resizable=no,location=no,status=no,scrollbars=yes')
		}
	
	function handleDocHeightMsg(eventObj){
		if(JSON.parse(eventObj.data).check=="selectCountry"){
			console.log(JSON.parse(eventObj.data));	
			console.log(eventObj.origin)	
		}
		
	}

</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 
<form  id="listPage2" action="/lovvey/page2/update" method="post">
 -->
 
 		
<form  id="listPage2">
	
	<div style="border: 1px solid black;">
	<P> 사업자 번호  <input type="text" id="busiNum" name="busiNum" value="${page2.busiNum}"> 약칭 <input type="text" id="customShort" name="customShort" value="${page2.customShort}">  </P>
	<p>	거래처명 <input type="text" id="custom" name="custom" value="${page2.custom}"></p>
	<p> 대표자 <input type="text" id="ceo" name="ceo" value="${page2.ceo }"> 담당자 <input type="text"id="chargePerson" name="chargePerson" value="${page2.chargePerson }"> </p>
	<p> 업태 <input type="text" id="busiCondition" name="busiCondition" value="${page2.busiCondition }"> 종목 <input type="text" id="item" name="item" value="${page2.item }"></p>
    <p>우편번호 <input type="text" id="postNum" name="postNum" placeholder="우편번호" value="${page2.postNum }"><input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기">
            주 소1<input type="text" id="addr1" name="addr1" placeholder="주소" value="${page2.addr1 }"></p>
    <p>주소2<input type="text" id="addr2" name="addr2" placeholder="상세주소" value="${page2.addr2 }"></p>
    <p> 전화번호<input type="text" id="tel" name="tel" value="${page2.tel }"> 팩스번호<input type="text" id="fax" name="fax" value="${page2.fax }"></p>
    <p> 홈페이지<input type="text" id="homepage" name="homepage" value="${page2.homepage }"></p>
	 
	<p>
	
	
	<c:choose>
		<c:when test="${page2.coYn eq 'c'}">
			 법인여부  법인<input type="radio" name="coYn" value="c" checked="checked"> 
			 개인<input type="radio" name="coYn" value="p">
		</c:when>
		<c:when test="${page2.coYn eq 'p'}">
			법인여부  법인<input type="radio" name="coYn" value="c" >
			 개인<input type="radio" name="coYn" value="p" checked="checked">
		</c:when>		
		<c:otherwise>
			 법인여부  법인<input type="radio" name="coYn" value="c" checked="checked"> 
			 개인<input type="radio" name="coYn" value="p">
		</c:otherwise>
	</c:choose>	
	
	
	
	<c:choose>
		<c:when test="${page2.foreignYn eq 'd' }">
			해외 여부 국내<input type="radio" name="foreignYn" value="d" checked="checked"> 
			해외<input type="radio" name="foreignYn" value="o"> 		
		</c:when>
		
		<c:when test="${page2.foreignYn eq 'o' }">
			해외 여부 국내<input type="radio" name="foreignYn" value="d"> 
			해외<input type="radio" name="foreignYn" value="o" checked="checked"> 
		</c:when>
		<c:otherwise>
			해외 여부 국내<input type="radio" name="foreignYn" value="d" checked="checked"> 
			해외<input type="radio" name="foreignYn" value="o"> 		
		</c:otherwise>
	</c:choose>			
	</p>
	<p> 과세구분 <select id="taxYn" name="taxYn" size="1">
	
	<c:choose>
	<c:when test="${page2.taxYn eq 't'}">
		<option value="t" >과세/면세</option>
		<option value="f">비과세</option>
	</c:when>
	<c:when test="${page2.taxYn eq 'f'}">
		<option value="f">비과세</option>
		<option value="t" >과세/면세</option>
	</c:when>
	<c:otherwise>
		<option value="t" >과세/면세</option>
		<option value="f">비과세</option>
	</c:otherwise>
	</c:choose>
	</select> 
	<%--  
	<c:if test="${page2.taxYn eq 't'}">
		<option value="t" >과세/면세</option>
		<option value="f">비과세</option>
	</c:if>
	<c:if test="${page2.taxYn eq 'f'}">
		<option value="f">비과세</option>
		<option value="t" >과세/면세</option>
	</c:if>
	<c:if test="${page2.taxYn}">
		<option value="t" >과세/면세</option>
		<option value="f">비과세</option>
	</c:if>
	--%>
	
	
	국 가 <input type="text" name="country_eng" id="country_eng" value="${page2.country_eng }"> 
	<input type="text" name="country_kor"id="country_kor" value="${page2.country_kor }">
	 <button type="button" onclick="countrykorAndEngWindow()" >검색</button>
	</p>
	
	<p>
	<c:choose>
	<c:when test="${page2.specialRelation eq 't' }">
		특수관계자<input type="checkbox" id="specialRelation" name="specialRelation" value="t" checked="checked">
		거래중지<input type="checkbox" id="tradeStop" name="tradeStop" value="f">
	</c:when>
	<c:when test="${page2.tradeStop == 't' and page2.specialRelation == 't'}">
		특수관계자<input type="checkbox" id="specialRelation" name="specialRelation" value="t" checked="checked">
		거래중지<input type="checkbox" id="tradeStop" name="tradeStop" value="t" checked="checked">
	</c:when>
	<c:when test="${page2.tradeStop eq 't' }">
		특수관계자<input type="checkbox" id="specialRelation" name="specialRelation" value="f">
		거래중지<input type="checkbox" id="tradeStop" name="tradeStop" value="t" checked="checked">
	</c:when> 
	<c:when test="${page2.specialRelation eq 'f' and page2.tradeStop eq 'f' }">
		특수관계자<input type="checkbox" id="specialRelation" name="specialRelation" value="t">
		거래중지<input type="checkbox" id="tradeStop" name="tradeStop" value="t">
		
	</c:when>
	<c:otherwise>
		특수관계자<input type="checkbox" id="specialRelation" name="specialRelation" value="f">
		거래중지<input type="checkbox" id="tradeStop" name="tradeStop" value="f">
	</c:otherwise>
	</c:choose>
	<input type="hidden" name="specialRelation" value="f"><input type="hidden" name="tradeStop" value="f"> 
	 </p>
	
	<p>계약기간 <input type="date" id="contractPeriodS" name="contractPeriodS" value="${page2.contractPeriodS }"> <input type="date" id="contractPeriodE" name="contractPeriodE" value="${page2.contractPeriodE }"></p>
	<p>등록 정보 <input type="text" id="regiInfoMan" name="regiInfoMan" value="${page2.regiInfoMan}" > <input type="text" id="regiInfoDate" name="regiInfoDate" readonly="readonly" value="${page2.regiInfoDate }">
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
	</div>	
	<button type="submit" formaction="/lovvey/page2/save" formmethod="post" onclick="sucessAlert()" >저장</button>
	<button type="submit" formaction="/lovvey/page2/update" formmethod="post" onclick="sucessAlert()" >수정</button>
	<button type="submit" formaction="/lovvey/page2/delete/${page2.busiNum}" formmethod="post" onclick="sucessAlert()">삭제 </button>
	
	
	

	</form>		
</body>




</html>