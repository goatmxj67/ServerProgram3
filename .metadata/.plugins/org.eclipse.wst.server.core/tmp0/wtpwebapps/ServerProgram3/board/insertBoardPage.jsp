<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>

<link rel="stylesheet" href="../assets/css/layout.css">
<style>
	.insert_form {
		width: 600px;
		margin: 0 auto;
	}
	input[type=text] {
		padding: 5px;
		width: 100%;
		height: 50px;
	}
	textarea {
		padding: 5px;
		width: 100%;
		height: 200px;
	}
	.btns {
		margin: 0 auto;
		width: 500px;
		text-align: center;
	}
	.btn {
		width: 150px;
		height: 40px;
		line-height: 40px;
		background: orange;
		border: none;
		outline: none;
	}
	.btn:hover {
		background: crimson;
		color: white;
		cursor: pointer;
	}
</style>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script>
	$(document).ready(function(){
		
		const f = $('#f');
		const title = $('#title');
		const insert_btn = $('#insert_btn');
		insert_btn.click(function(){
			if (title.val() == '') {
				alert('제목은 필수입니다.');
				title.focus();
				return;
			}
			alert('게시글이 등록되었습니다.');
			f.attr('action', '/ServerProgram3/insertBoard.do');
			f.submit();
		})
		
		const list_btn = $('#list_btn');
		list_btn.click(function(){
			location.href = '/ServerProgram3/selectListBoardPage.do';
		})
		
	})
</script>
<div class="insert_form">
	<h1>게시글 작성하기</h1>
	<form id="f" method="post" >
		<p class="title">작성자</p>
		<input type="text" id="author" name="author"><br><br>
		<p class="title">제목</p>
		<input type="text" id="title"  name="title" autofocus><br><br>
		<p class="content">내용</p>
		<textarea id="content" name="content"></textarea><br><br>
		<input type="hidden" name="ip" value="<%=request.getRemoteAddr()%>">
		<div class="btns">
			<input type="button" value="저장하기" class="btn" id="insert_btn">
			<input type="reset" value="작성초기화" class="btn" id="reset_btn">
			<input type="button" value="목록보기" class="btn" id="list_btn">
		</div>
	</form>
	
</div>