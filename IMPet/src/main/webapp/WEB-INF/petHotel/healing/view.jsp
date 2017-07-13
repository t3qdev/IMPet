<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div style="width:95%; border:1px solid black;  margin-top: 5px; height:800px;">
	<div align="center" style="width:100%; height:100%;">
	
		<div style="width:100%; height:80%;">
		<img alt="s2" src="/IMPet/resources/image/dog1.jpg" style="width: 100%; height: 100%;">
		</div>
		
		<div align="left" style="width:100%; height:19%;">
		&nbsp;&nbsp;방 번호 : ${view.HEALING_NO} / 방 이름 : ${view.HEALING_NAME}<br/>
		&nbsp;&nbsp;방 소개 : ${view.HEALING_DETAIL}<br/>
		</div>
	
	</div>
</div>

<div align="center" style="margin-top: 5px; margin-bottom: 5px;">
<c:if test="${sessionScope.member_Admin==1 }">
<input value="힐링 수정" type="button" onclick="ajaxHealingModifyForm(${view.HEALING_NO})"/>
<input value="힐링 삭제" type="button" onclick="ajaxHealingDelete(${view.HEALING_NO})"/>
</c:if>
<input value="힐링 리스트" type="button" onclick="ajaxHealing()"/>
</div>
</body>
</html>