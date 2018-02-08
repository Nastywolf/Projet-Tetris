<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<tiles:insertDefinition name="app.layout">
<tiles:putAttribute name="title" value="Super Tetris" />
<tiles:putAttribute name="content">
<div>
<h2>Bonjour et bienvenue </h2>
<p>Vous êtes sur le site du meilleur tetris au monde.<br>
Du fun du fun et encore du fun.<br>
On s'amuse on s'amuse et on s'amuse.<br>
De l'ambiance, de l'ambiance et encore de l'ambiance.<br>
Des lignes, des lignes et encore des lignes. </p>


</div>
<div>
	<iframe width="560" height="315" src="https://www.youtube.com/embed/kmUqZ7zlVZQ?rel=0&amp;controls=0&amp;showinfo=0;autoplay=1" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
</div>
</tiles:putAttribute>
</tiles:insertDefinition>