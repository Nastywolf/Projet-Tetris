<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC>
<html>
<head>
<link rel="stylesheet" href="/tetris-Mvc/css/bootstrap.min.css" />
<link rel="stylesheet" href="/tetris-Mvc/css/checkbox.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Le meilleur Tetris</title>
</head>

<body>
	<div class="container">

		<div class="alert alert-light" role="alert">
			<h1>
				<tiles:insertAttribute name="title" />
			</h1>
		</div>

		<nav> <tiles:insertAttribute name="navigation" /> </nav>

		<div class="alert alert-info" role="alert">
			<tiles:insertAttribute name="content" />
		</div>

	</div>
</body>

<script src="js/bootstrap.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/jquery-3.1.1.min.js"></script>

</html>