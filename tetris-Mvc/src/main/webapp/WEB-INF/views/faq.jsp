<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="app.layout">
	<tiles:putAttribute name="title" value="La FAQ" />
	<tiles:putAttribute name="content">
		<div>
			<a href="/tetris-mvc/faq/ajouter"><button type="button"
					class="btn btn-success">Ajouter</button></a>
		</div>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Question</th>
					<th>Réponse</th>
				</tr>
			</thead>
			<c:forEach items="${faq}" var="faq">
				<tr>
					<td>${faq.id}</td>
					<td>${faq.question}</td>
					<td>${faq.reponse}</td>
					<td><a href="/tetris-mvc/faq/editer?id=${faq.id }"><button
								type="button" class="btn btn-outline-primary">modifier</button></a>
						<a href="/tetris-mvc/faq/supprimer?id=${faq.id }"><button
								type="button" class="btn btn-danger">X</button></a></td>
				</tr>
			</c:forEach>
		</table>

	</tiles:putAttribute>
</tiles:insertDefinition>