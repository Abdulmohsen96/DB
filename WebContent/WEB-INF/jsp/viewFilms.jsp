<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movies Page</title>
<style type="text/css">
body, html {
	height: 100%;
	font-family: Consolas;
}
</style>
</head>
<body>
	<h1 align="center" class="h1">My Best Films</h1>

	<h3>
		<a href="viewFilms">Original List Order</a>
	</h3>
	<h3>
		<a href="viewFilmsTitleASC">Order List By Title (ASC)</a>
	</h3>
	<h3>
		<a href="viewFilmsTitleDESC">Order List By Title (DESC)</a>
	</h3>

	<table border="2" width="70%" cellpadding="2" align="center">
		<tr>
			<th>List Position</th>
			<th>Title</th>
			<th>Year</th>
			<th>Genre</th>
			<th>Director</th>
		</tr>

		<c:forEach var="movie" items="${list}">
			<tr>
				<td align="center">${movie.position}</td>
				<td align="center">${movie.title}</td>
				<td align="center">${movie.year}</td>
				<td align="center">${movie.genres}</td>
				<td align="center">${movie.directors}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>