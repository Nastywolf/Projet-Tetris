<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<c:if test="${page == 'acceuil'}">
<ul class="nav nav-tabs">
	<li class="nav-item"><a class="nav-link active" href="/tetris-Mvc/home">Accueil</a>
	</li>
	<li class="nav-item"><a class="nav-link"
		href="/tetris-Mvc/tetrimino">Tetrimino</a></li>
	<li class="nav-item"><a class="nav-link"
		href="/tetris-Mvc/faq">FAQ</a></li>
	<li class="nav-item"><a class="nav-link" href="/tetris-Mvc/connexion">Connexion</a></li>
	<li class="nav-item"><a class="nav-link" href="/tetris-Mvc/connexion/deconnection">Déconnexion</a></li>
</ul>
</c:if>

<c:if test="${page == 'connexion'}">
<ul class="nav nav-tabs">
	<li class="nav-item"><a class="nav-link" href="/tetris-Mvc/home">Accueil</a>
	</li>
	<li class="nav-item"><a class="nav-link"
		href="/tetris-Mvc/tetrimino">Tetrimino</a></li>
	<li class="nav-item"><a class="nav-link"
		href="/tetris-Mvc/faq">FAQ</a></li>
	<li class="nav-item"><a class="nav-link active" href="/tetris-Mvc/connexion">Connexion</a></li>
	<li class="nav-item"><a class="nav-link" href="/tetris-Mvc/connexion/deconnection">Déconnexion</a></li>
</ul>

</c:if>

<c:if test="${page == 'tetrimino'}">
<ul class="nav nav-tabs">
	<li class="nav-item"><a class="nav-link " href="/tetris-Mvc/home">Accueil</a>
	</li>
	<li class="nav-item"><a class="nav-link active"
		href="/tetris-Mvc/tetrimino">Tetrimino</a></li>
	<li class="nav-item"><a class="nav-link"
		href="/tetris-Mvc/faq">FAQ</a></li>
	<li class="nav-item"><a class="nav-link" href="/tetris-Mvc/connexion">Connexion</a></li>
	<li class="nav-item"><a class="nav-link" href="/tetris-Mvc/connexion/deconnection">Déconnexion</a></li>
</ul>

</c:if>

<c:if test="${page == 'faq'}">
<ul class="nav nav-tabs">
	<li class="nav-item"><a class="nav-link" href="/tetris-Mvc/home">Accueil</a>
	</li>
	<li class="nav-item"><a class="nav-link"
		href="/tetris-Mvc/tetrimino">Tetrimino</a></li>
	<li class="nav-item"><a class="nav-link active"
		href="/tetris-Mvc/faq">FAQ</a></li>
	<li class="nav-item"><a class="nav-link" href="/tetris-Mvc/connexion">Connexion</a></li>
	<li class="nav-item"><a class="nav-link" href="/tetris-Mvc/connexion/deconnection">Déconnexion</a></li>
</ul>

</c:if>