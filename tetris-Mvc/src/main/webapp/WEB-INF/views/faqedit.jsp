<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="app.layout">
	<tiles:putAttribute name="title" value="Edition d'une faq" />
	<tiles:putAttribute name="content">
		<form:form method="POST" modelAttribute="faq">
			<div class="form-group">
				<form:label path="question">Question :</form:label>
				<form:input path="question" type="text" class="form-control"
					name="question" aria-describedby="Help" placeholder="question"
					value="${faq.question}" />
				<form:errors path="question" element="div"
					cssClass="alert alert-danger" />

			</div>

			<div class="form-group">
				<form:label path="reponse">Réponse :</form:label>
				<form:input path="reponse" type="text" class="form-control"
					name="reponse" aria-describedby="Help" placeholder="reponse"
					value="${faq.reponse}" />
				<form:errors path="reponse" element="div"
					cssClass="alert alert-danger" />

			</div>

			<button type="submit" class="btn btn-danger">Ajouter</button>



		</form:form>
	</tiles:putAttribute>
</tiles:insertDefinition>