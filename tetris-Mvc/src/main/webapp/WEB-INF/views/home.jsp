<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<tiles:insertDefinition name="app.layout">
<tiles:putAttribute name="title" value="Super Tetris" />
<tiles:putAttribute name="content">
<div>
Bonjour et bienvenue <br>
Vous êtes sur le site du meilleur tetris au monde.<br>
Du fun du fun et encore du fun.<br>
On s'amuse on s'amuse et on s'amuse.<br>
De l'ambiance, de l'ambiance et encore de l'ambiance.<br>
Des lignes, des lignes et encore des lignes. <br>


</div>
<div>
	<object type="application/x-shockwave-flash" width="425" height="355" data="https://www.youtube.com/watch?v=kmUqZ7zlVZQ">
		<param name="movie" value="https://www.youtube.com/watch?v=kmUqZ7zlVZQ" />
		<param name="wmode" value="transparent" />
	</object>
</div>
</tiles:putAttribute>
</tiles:insertDefinition>