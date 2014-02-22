<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<!-- banniere -->

<div id="banniere" class="navbar">
	<div class="container">

		<!-- logo -->
		<img alt="" src="resources/img/logo.png" style="">

		<!-- connexion -->
		<div class="pull-right">
			<security:authorize access="isAnonymous()">
				<div class="btn btn-default">
					<a href="connexion">Se connecter</a>
				</div>
				<div class="btn btn-default">
					<a href="inscription">S'inscrire</a>
				</div>
			</security:authorize>
			<security:authorize access="isAuthenticated()">
				<div class="btn btn-default">
					<a href="j_spring_security_logout">Déconnexion</a>
				</div>
			</security:authorize>
		</div>

	</div>
</div>
