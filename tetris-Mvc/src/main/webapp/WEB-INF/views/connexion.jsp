<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<tiles:insertDefinition name="app.layout">
	<tiles:putAttribute name="title" value="Connexion" />
	<tiles:putAttribute name="content">

		<form:form method="POST" modelAttribute="login">
			<div class="form-group">
				<label>Login :</label> <input  type="text" class="form-control"
					name="login" aria-describedby="Help"
					placeholder="Entrez votre pseudo" />
				

			</div>
			<div class="form-group">
				<label >Password :</label> <input type="password"
					class="form-control" name="mdp" aria-describedby="Help"
					placeholder="Entrez votre Mot de passe" />
				

			</div>
			<div>
			<form:errors  path="login" element="div" cssClass="alert alert-danger" />
			</div>
			<button type="submit" class="btn btn-danger">Connexion</button>



		</form:form>
	</tiles:putAttribute>
</tiles:insertDefinition>


