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
	.board_list {
		width: 600px;
		margin: 0 auto;
	}
	table {
		border-collapse: collapse;
	}
	td {
		border: 1px solid gray;
		padding: 5px;
		text-align: center;
	}
	td:nth-of-type(1) { width: 100px; }
	td:nth-of-type(2) { width: 200px; }
	td:nth-of-type(3) { width: 100px; }
	td:nth-of-type(4) { width: 100px; }
	td:nth-of-type(5) { width: 100px; }
	</style>
<body>
	<div class="board_list">
	
	<a href="insertBoardPage.do">새글작성</a>
	
	<p>전체 : ${totalRecord}개 게시물</p>
	<table border="1">
		<thead>
			<tr>
				<td>글번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>작성일</td>
				<td>조회수</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${list}">
				<tr>
					<td>${dto.no}</td>
					<td><a href="/ServerProgram3/selectOneBoard.do?no=${dto.no}">${dto.title}</a></td>
					<td>${dto.author}</td>
					<td>${dto.postdate}</td>
					<td>${dto.hit}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>