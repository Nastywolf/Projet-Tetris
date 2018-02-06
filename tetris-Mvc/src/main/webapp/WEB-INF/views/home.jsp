<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="app.layout">
<tiles:putAttribute name="title" value="COURS PETIT NIPON" />
<tiles:putAttribute name="content">
<p>${username }</p>
<p>${idProduit}</p>
</tiles:putAttribute>
</tiles:insertDefinition>