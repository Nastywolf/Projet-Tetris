<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="app.layout">
	<tiles:putAttribute name="title" value="C'est pas la taille qui compte" />
	<tiles:putAttribute name="content">

		<form:form method="GET" action="/tetris-Mvc/tetrimino/ajouter">
			<div class="form-group">
				<label>Taille :</label>
				<input type="text" class="form-control" name="taille"
					aria-describedby="Help" placeholder="Veuillez entre une taille < 15" />
				<form:errors element="div" cssClass="alert alert-danger" />

			</div>
			<div>
				<button type="submit"
						class="btn btn-success">Suivant</button>
			</div>
		</form:form>
	</tiles:putAttribute>
</tiles:insertDefinition>