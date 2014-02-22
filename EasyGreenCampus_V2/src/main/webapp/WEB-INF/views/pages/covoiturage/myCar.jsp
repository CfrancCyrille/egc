<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="container">
	<h2>Covoiturage - Ma voiture</h2>
	<form:form modelAttribute="vehicule" method="POST"
		action="/igs/covoiturage/myCar">

		<div class="row">
			<div class="col-md-2"></div>

			<div class="col-md-3">

				<div class="form-group">
					<form:label path="marque">Marque</form:label>
					<form:input class="form-control" path="marque" />
				</div>

				<div class="form-group">
					<form:label path="modele">Modele</form:label>
					<form:input class="form-control" path="modele" />
				</div>

				<div class="form-group">
					<form:label path="couleur">Couleur</form:label>
					<form:input class="form-control" path="couleur" />
				</div>

				<div class="form-group">
					<form:label path="nbPlace">Nombre de places disponibles</form:label>
					<div style="width: 65px">
						<form:select path="nbPlace" class="form-control">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
							<option>6</option>
							<option>7</option>
							<option>8</option>
							<option>9</option>
						</form:select>
					</div>
				</div>
			</div>
			<div class="col-md-1"></div>
			<div
				class="col-md-4                                                                                                                                                           ">
				<div class="form-group">
					<label for="commentaire">Commentaire</label>
					<textarea class="form-control" rows="8"></textarea>
				</div>
				<br>
				<button type="submit" class="btn btn-primary pull-right">Valider</button>
			</div>
			
		</div>
	</form:form>

</div>
