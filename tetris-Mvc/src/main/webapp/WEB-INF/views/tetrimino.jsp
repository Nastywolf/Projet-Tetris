<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<tiles:insertDefinition name="app.layout">
	<tiles:putAttribute name="title" value="Les Tetriminos" />
	<tiles:putAttribute name="content">

		<div>
			<a href="/tetris-Mvc/tetrimino/tailleadd"><button type="button"
					class="btn btn-success">Ajouter</button></a>
		</div>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Nom</th>
					<th>Couleur</th>
					<th>Forme</th>
				</tr>
			</thead>
			<c:forEach items="${tetrimino}" var="tetrimino">
				<tr>
					<td>${tetrimino.id}</td>
					<td>${tetrimino.nom}</td>
					<td>${tetrimino.couleur}</td>
					<td>
						<table bordercolor="black" border="2px">
							<c:forTokens items="${tetrimino.forme}" delims="/" var="ligne">
								<tr>
									<c:forTokens items="${ligne}" delims="," var="valeur">
										<c:if test="${valeur == 1}">
											<td bgcolor="${tetrimino.couleur}" style="border:1px solid grey;"></td>
										</c:if>
										<c:if test="${valeur == 0}">
											<td bgcolor="white" style="border:1px solid grey;"></td>
										</c:if>
									</c:forTokens>
								</tr>
							</c:forTokens>
						</table>
					</td>
					<td><a
						href="/tetris-Mvc/tetrimino/tailleed?id=${tetrimino.id }"><button
								type="button" class="btn btn-outline-primary">modifier</button></a>
						<a href="/tetris-Mvc/tetrimino/supprimer?id=${tetrimino.id }"><button
								type="button" class="btn btn-danger">X</button></a></td>
				</tr>
			</c:forEach>
		</table>

	</tiles:putAttribute>
</tiles:insertDefinition>
