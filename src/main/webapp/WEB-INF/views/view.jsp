<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>VIEW PAGE</h2>
<div>
<p>
<input type='text' id='reText' value="테스트 댓글">
</p>
<p>
<input type='text' id='replyer' value="user00">
</p>
<p>
<button id="saveBtn">SAVE</button>
</p>
</div>	

<button id = "delBtn">DELETE</button>
<button id="modBtn">MODIFY</button>


	
<script
  src="https://code.jquery.com/jquery-3.2.1.min.js"
  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
  crossorigin="anonymous"></script>

<script>

$(document).ready(function(e) {
	
	$("#modBtn").click(function(e){
		var obj = {reText:$("#reText").val(),replyer:$("#replyer").val()};
		
		$.ajax({
			type:'put',
			url:'replies/321/21',
			headers: { 
				     "Content-Type": "application/json",
				      "X-HTTP-Method-Override": "post" },
			data:JSON.stringify(obj),
			success:function(msg){
				console.log(msg)
				
			}
			
			
		});
		
		
		
	});
	
	
	
	$("#delBtn").click(function(e){
		$.ajax({
			type:'delete',
			url:'replies/321/21',
			success:function(msg){
				console.log(msg)
			}
			
		});
		
	})
	
	$("#saveBtn").click(function(e) {
		
		var obj = {reText:$("#reText").val(),replyer:$("#replyer").val()};
	
		$.ajax({
			
			type:'post',
			url:'/replies/321',
			headers:{"Content-Type":"application/json" }, /*내가 보내는 자료는 json이다라고 명시해줘야함  */
			data:JSON.stringify(obj),
			success:function(result){
				console.log(result);
				console.log(result.reText);
			}
		
		});
		
	});
	
});



</script>	
</body>
</html>