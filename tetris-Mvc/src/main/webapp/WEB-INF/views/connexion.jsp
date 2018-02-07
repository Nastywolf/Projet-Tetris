<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="app.layout">
	<tiles:putAttribute name="title" value="Connexion" />
	<tiles:putAttribute name="content">

		<div>
			<p>${pageContext.request.requestURI}</p>
		</div>
		<form:form method="POST" modelAttribute="faq">
			<div class="form-group">
				<form:label path="login">Login :</form:label>
				<form:input path="login" type="text" class="form-control"
					name="question" aria-describedby="Help" placeholder="Entrez votre pseudo"
					 />
				<form:errors path="question" element="div"
					cssClass="alert alert-danger" />

			</div>

			<div class="form-group">
				<form:label path="mdp">Password :</form:label>
				<form:input path="mdp" type="password" class="form-control"
					name="reponse" aria-describedby="Help" placeholder="Entrez votre Mot de passe" />
				<form:errors path="reponse" element="div"
					cssClass="alert alert-danger" />

			</div>

			<button type="submit" class="btn btn-danger">Connexion</button>



		</form:form>
	</tiles:putAttribute>
</tiles:insertDefinition>

