<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="../assets/css/layout.css">
	<style>
		.board_view {
			width: 100%;
			display: flex;
			justify-content: space-between;
		}
		.board_content {
			width: 40%;
		}
		.board_img {
			width: 55%;
		}
		.board_img > img {
			width: 100%;
		}
		.reply_form {
			width: 100%;
		}
		.reply_form textarea {
			width: 85%;
			height: 50px;
		}
		.reply_form button {
			width: 13%;
		}
		.reply_list table {
			width: 100%;
			border-collapse: collapse;
			border-top: 1px solid gray;
			border-bottom: 1px solid gray;
		}
		.reply_list table td {
			padding: 10px;
			border-bottom: 1px solid gray;
		}
		.reply_list table td:nth-of-type(1) { width: 70%; }
		.reply_list table td:nth-of-type(2) { width: 10%; }
		.reply_list table td:nth-of-type(3) { width: 15%; }
		.reply_list table td:nth-of-type(4) { width: 5%; }
	</style>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
	<script>
		$(document).ready(function(){
			const delete_btn = $('#delete_btn');
			delete_btn.click(function(){
				if (confirm('삭제할까요?')) {
					location.href='/ServerProgram3/deleteBoard.do?no=${dto.no}';
				}
			})
		})
	</script>
</head>
	<div class="board_view">
		<div class="board_content">
			<h1>${dto.no}번 게시글</h1>
			<p class="title">작성자</p>
			${dto.author}<br><br>
			<p class="title">작성자IP</p>
			${dto.ip}<br><br>
			<p class="title">조회수</p>
			${dto.hit}<br><br>
			<p class="title">제목</p>
			${dto.title}<br><br>
			<p class="title">내용</p>
			<pre>${dto.content}</pre><br><br>	
		</div>
	</div>
	<div>
		<form action="/ServerProgram3/updateBoardPage.do" method="post">
			<input type="button" value="목록보기" onclick="location.href='${referer}'">
			<input type="hidden" name="no" value="${dto.no}">
			<input type="hidden" name="title" value="${dto.title}">
			<input type="hidden" name="content" value="${dto.content}">
			<input type="button" value="삭제하기" id="delete_btn">
		</form>
	</div>
	<%-- 댓글 입력창 --%>
	<div class="reply_form">
		<form action="/ServerProgram3/insertReply.do" method="post">
			<input type="hidden" name="boardNo" value="${dto.no}"> 
			<textarea name="content"></textarea>
			<button>작성하기</button>
		</form>
	</div>

	<%-- 댓글 목록창 --%>
	<div class="reply_list">
		댓글 ${replyCount}개<br>
		<table>
			<tbody>
				<c:forEach var="replyDTO" items="${replyList}">
					<tr>
						<td>${replyDTO.content}</td>
						<td>${replyDTO.author}</td>
						<td>${replyDTO.postdate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
