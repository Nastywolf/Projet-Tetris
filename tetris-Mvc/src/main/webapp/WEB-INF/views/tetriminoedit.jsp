<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="app.layout">
	<tiles:putAttribute name="title" value="Edition d'un tetrimino" />
	<tiles:putAttribute name="content">
		<form:form method="POST" modelAttribute="tetrimino">
			<div class="form-group">
				<form:label path="nom">Nom :</form:label>
				<form:input path="nom" type="text" class="form-control" name="nom"
					aria-describedby="Help" placeholder="nom" value="${tetrimino.nom}" />
				<form:errors path="nom" element="div" cssClass="alert alert-danger" />

			</div>

			<div class="form-group">
				<form:label path="couleur">Couleur :</form:label>
				<form:input path="couleur" type="text" class="form-control"
					name="couleur" aria-describedby="Help" placeholder="couleur"
					value="${tetrimino.couleur}" />
				<form:errors path="couleur" element="div"
					cssClass="alert alert-danger" />

			</div>

<%-- 			<div class="form-group">
				<form:label path="forme">Forme :</form:label>
				<form:input path="forme" type="text" class="form-control"
					name="forme" aria-describedby="Help" placeholder="forme"
					value="${tetrimino.forme}" />
				<form:errors path="forme" element="div"
					cssClass="alert alert-danger" />
			</div>
 --%>
			<div>
				<table>
					<c:forEach var="i" begin="1" end="${ taille }">
						<tr>
							<c:forEach var="j" begin="1" end="${taille}">
								<td><input type="checkbox" id="${i}.${j}" name="${i}.${j}"></td>
							</c:forEach>
						</tr>
					</c:forEach>
				</table>
			</div>

			<button type="submit" class="btn btn-danger">Ajouter</button>
		</form:form>
	</tiles:putAttribute>
</tiles:insertDefinition>