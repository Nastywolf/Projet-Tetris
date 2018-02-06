Correction du Tetris JS !
Assez générique pour s'adapter à tous vos HTML.
Certains ont géré des coordonnées, d'autres des chaînes de caractères ou encore des matrices. Vous aurez un exemple de chaque, à activer au besoin (voir point #6).


1/ plateau.js
	C'est ici que se trouve toutes les interactions avec l'utilisateur (touches clavier) et les évènements liés au Tetris
	C'est ces fonctions JS qui gèrent tout le rendu !
	Fichier obligatoire

2/ tetris-core.js
	Le coeur de Tetris, configurable via des options (largeur, hauteur, taille d'un bloc, ...)
	Possibilité de mettre en pause avec la touche entrée
	Fichier obligatoire

3/ tetris-auto.js
	Plugin qui permet d'activer le mode descente automatique d'un tétrimino
	Durée paramétrable, varie selon le niveau si le plugin Score est activé

5/ tetris-score.js
	Plugin qui calcul les scores lorsqu'une (ou plusieurs) ligne(s) est (sont) bris�e(s)

4/ tetris-ghost.js
	Plugin qui active un fant�me sur le positionnement final du tetrimino
	Possibilité de placer le tetrimino plus rapidement en appuyant sur la barre d'espaces

5/ tetris-next.js
	Plugin qui permet de gérer les tétriminos à venir (1 à n selon la configuration)

6/ Scripts à activer selon le format souhaité (voir ci-dessous)

6.1/ tetriminos/coordinates.js
	Quelques tetriminos au format coordonnées (y:x)

6.2/ tetriminos/matrices.js
	Quelques tetriminos au format matrices

6.3/ tetriminos/strings.js
	Quelques tetriminos au format chaînes de caractères
