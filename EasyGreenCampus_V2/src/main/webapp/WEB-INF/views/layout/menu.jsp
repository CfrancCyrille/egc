<!-- menu -->
<%
	String containerFile = request.getParameter("page");
	if((containerFile == "") || (containerFile == null)){
		containerFile = "news";
	}
	
	String news = "";
	String maraicher = "";
	String annonces = "";
	String covoiturage = "";
	
	if(containerFile.equals("news")) news = "active";
	if(containerFile.equals("maraicher")) maraicher = "active";
	if(containerFile.equals("annonces")) annonces = "active";
	if(containerFile.equals("covoiturage")) covoiturage = "active";
	
	
%>
<div id="menu" class="navbar navbar-default">
	<div class="container">  

		<ul class="nav navbar-nav">
			<!-- news -->
			<li class="<%=news %>">
				<a href="news/news">News</a>
			</li>
			
			<!-- annonces -->
			<li class="dropdown <%=annonces %>">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">Annonces<strong class="caret"></strong></a>
				<ul class="dropdown-menu">
					<li>
						<a href="annonces/search">Rechercher</a>
					</li>
					<li>
						<a href="annonces/new">Créer</a>
					</li>
					<li class="divider">
					</li>
					<li>
						<a href="annonces/list">Mes annonces</a>
					</li>
				</ul>
			</li>
			
			<!-- covoiturage -->
			<li class="dropdown <%=covoiturage %>">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">Covoiturage<strong class="caret"></strong></a>
				<ul class="dropdown-menu">
					<li>
						<a href="covoiturage/search">Rechercher</a>
					</li>
					<li>
						<a href="covoiturage/new">Créer un trajet</a>
					</li>
					<li class="divider">
					</li>
					<li>
						<a href="covoiturage/myCar">Ma voiture</a>
					</li>
					<li>
						<a href="covoiturage/list">Mes trajets</a>
					</li>
				</ul>
			</li>
			
			<!-- fruits & légumes -->
			<li class="<%=maraicher %>">
				<a href="maraicher/list">Fruits & Légumes</a>
			</li>
			
			<!-- qui sommes-nous> -->
			<li>
				<a href="#">Qui sommes-nous?</a>
			</li>
		</ul>
	</div>
</div>