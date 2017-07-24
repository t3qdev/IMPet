<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<script type="text/javascript">


	function ImageIndex(index){
		
		
		//alert(index); 
		
		
		var Txt = "데이터가 없습니다.";
		
		if(index==1){
			Txt = "${TxT01}";
			
		}else if(index==2){

			Txt = "${TxT02}";
			
		}else if(index==3){
			
			Txt = "${TxT03}";
			
		}else if(index==4){
			
			Txt = "${TxT04}";
			
		}else if(index==5){
			
			Txt = "${TxT05}";
			
		}
		
		$("#dd").html(Txt);
		

 		
	}



</script>


<style>

#comments ul {
    list-style: none;
    padding-left: 0;
}

.under_content .box {
    clear: both;
    margin-bottom: 2.5em;
}

.accent_header, h2.under_content {
    color: #000000;
    border-top: 2px solid #000000;
    border-bottom: 2px solid #000000;
}
under_content h2 {
    font-size: 1.2em;
    padding: 9px 0 8px;
    margin-bottom: 20px;
}

.accent_header {
    clear: both;
    font-weight: bold;
    text-align: center;
    line-height: 1.4;
}

#comments ul li {
    max-width: 668px;
    margin: 10px auto 30px;
}

#comments .combody {
    background-color: #ececfa;
    padding: 20px 15px 5px;
    margin-bottom: 5px;
}


#comments p.cominfo {
    text-align: right;
    font-size: .8em;
    padding-right: 5px;
}

.box {
    overflow: hidden;
}

.under_content li, .side li {
    line-height: 1.4;
    margin-bottom: 13px;
}


</style>



<br/><br/>




<div class="slide_wrap">
	<button type="button" class="btn_prev">이전</button>
	<button type="button" class="btn_next">다음</button>

	<div class="slide_area" style="width: 80%; height: 35%; " >
	
	<ul class="slide_box" style="width: 100%; height: 100%;" >	
		<li>
			<img src="/IMPet/resources/image/gallery/${Image01}"   />
		</li>		
		<li>
			<img src="/IMPet/resources/image/gallery/${Image02}"   />
	  	</li>	  
	  	<li>
	    	<img src="/IMPet/resources/image/gallery/${Image03}"   />
	  	</li>	  
	  	<li>
	    	<img src="/IMPet/resources/image/gallery/${Image04}"   />
	    </li>
	    <li>
	    	<img src="/IMPet/resources/image/gallery/${Image05}"   />
	    </li>
	 </ul>
	</div>
<!--   <ul class="indigator">
	  <li class="active"><a href="#">1</a></li>
	  <li><a href="#">2</a></li>
	  <li><a href="#">3</a></li>
	  <li><a href="#">4</a></li>
	  <li><a href="#">5</a></li>
  </ul>
   -->
 	<ul class="indigator2">	
		<li><a href="#"><img src="/IMPet/resources/image/gallery/${Image01}" /></a></li>
		<li><a href="#"><img src="/IMPet/resources/image/gallery/${Image02}" /></a></li>
		<li><a href="#"><img src="/IMPet/resources/image/gallery/${Image03}" /></a></li>
		<li><a href="#"><img src="/IMPet/resources/image/gallery/${Image04}" /></a></li>
		<li><a href="#"><img src="/IMPet/resources/image/gallery/${Image05}" /></a></li>
	</ul>

</div>
<br/>
<br/>
	<label  id="dd">${TxT01}</label>	

<br/><br/><br/>	




<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js'></script>
<script src="/IMPet/resources/JQuery/gallery/slider.js"></script> 




<div id="comments" class="box">

	<h2 class="under_content accent_header">
	
	
		<label>댓글 쓰기</label> <br/>

<form name="jform1" method="post">	
		<textarea id="comment" name="comment" cols="45" rows="8" maxlength="65525" aria-required="true" required="required"></textarea> 
		
		<input type="hidden" id ="GALLERY_NO"  value="${GALLERY_NO}"> 
</form>	
		<button type="button"  onclick="ajaxComment();">댓글 달기</button>
	
	
	</h2>

	
	<h2 class="under_content accent_header">댓글 리스트</h2>

	<ul>
	
	
	<div id="ContextGallery" align="center" style="width:100%;  float: left;">	
	
		<c:forEach var="comment" items="${commentList}">
				
	
		
		<li class="compost">
		
			<div class="combody">
				<p>${comment.GALLERYCOMMENT_CONTENT }</p>
			</div>
			
			<p class="cominfo">
				by&nbsp; ${comment.MEMBER_ID}　&nbsp;&nbsp;  	${comment.GALLERYCOMMENT_DATE} &nbsp;&nbsp;&nbsp;<a>[삭제]</a>
				
				</p>
		</li>
		
		</c:forEach>
		</div>
	
	</ul>

</div>



