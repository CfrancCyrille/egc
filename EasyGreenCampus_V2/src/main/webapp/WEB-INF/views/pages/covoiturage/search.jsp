<div id="content">
		<div class="container">
			<div class ="row">
			
				<div class="col-md-1"></div>
					<div class="col-md-3">
					<h2>Recherche</h2>				
				</div>
			</div>

			<!-- Formulaire de consultation des trajets -->
			
				<div class="row">
					<form class="form-horizontal" role="form">
							<div class="form-group">
								<label for="depart" class="col-sm-2 control-label">Départ : </label>
								<div class="col-sm-3">
									<input type="depart" class="form-control" id="inputdepart" placeholder="IGS">
								</div>
								<label for="modele" class="col-sm-2 control-label"> A partir de : </label>
								<div class="col-sm-1">
									<select class="form-control">
										<option>7h
										<option>8h
										<option>9h
										<option>10h
										<option>11h
										<option>12h
										<option>13h
										<option>14h
										<option>15h
										<option>16h
										<option>17h
										<option>18h
									</select>
								</div>
								<div class="col-sm-2">
									<select class="form-control" style="width:55%">
										<option>00 min
										<option>15 min
										<option>30 min
										<option>45 min
									</select>
								</div>
							</div>	
							<div class="form-group">
								<label for="Arrivée" class="col-sm-2 control-label">Arrivée : </label>
								<div class="col-sm-3">
									<input type="Arrivée" class="form-control" id="Arrivée" placeholder="Arrivée">
								</div>
								
								<label for="modele" class="col-sm-2 control-label"> A partir de : </label>
								<div class="col-sm-1">
									<select class="form-control">
										<option>7h
										<option>8h
										<option>9h
										<option>10h
										<option>11h
										<option>12h
										<option>13h
										<option>14h
										<option>15h
										<option>16h
										<option>17h
										<option>18h
									</select>
								</div>
								
								<div class="col-sm-2">
									<select class="form-control" style="width:55%">
										<option>00 min
										<option>15 min
										<option>30 min
										<option>45 min
									</select>
								</div>
								<div class="col-sm-2">
									<button type="button" class="btn btn-primary">Chercher</button>
								</div>
							</div>
							<!-------------------------------gestion du calendrier------------------------------>
							<div class="form-group">
								<label for="date" class="col-sm-2 control-label">Date :</label>
									<div class="col-sm-2">
										<div id="datetimepicker4" class="input-append">
											<input  data-format="dd-MM-yyyy" type="text" class="add-on form-control"></input>
										<!--<span class="add-on glyphicon glyphicon-calendar"></span>
											<span  class="glyphicon glyphicon-calendar"></span></span>-->
										</div>
									</div>
							</div>
					</form>
				</div>
					
		<form class="form-inline" role="form">
			<div class ="row">
				<div class="col-md-1"></div>
				<div class="col-md-4">
					<h4>Résultats de votre recherche</h4>				
				</div>
				<div class="col-md-1" align>
				+/-
				</div>
				<div class="col-sm-2">
					<select class="form-control" style="width:55%">
							<option>1 km
							<option>2 kms
							<option>3 kms
							<option>4 kms
					</select>
				</div>
				<div class="col-md-1">
				</div>
				<div class="col-md-1">
					<button type="button" class="btn btn-primary">retour</button>
				</div>
			</div>
			</form>
				<!--<h2>RÃ©sultats de votre recherche</h2>-->
					<p class="trajet">
						<div class="row">
							<div class="col-md-1">
								
							</div>
							
							<div class="col-md-2" text-align: "center">
								<span class="info1">Lundi 17 janvier</span><br> 
								<span class="info2">Aller :&nbsp;</span>7h<br>
								<span class="info2">Retour :&nbsp;</span>17h<br>
							</div>
							
							<div class="col-md-4">
								<span class="info1">IGS â†” Toulouse</span><br> 
								<span class="info2">Départ :&nbsp;</span> 186 Route de Grenade, 31700 Blagnac<br>
								<span class="info2">Arrivée :&nbsp;</span> &nbsp;5 rue Ambroise Thomas, 31400 Toulouse<br>
							</div>
							
							<div class="col-md-2">
								3 places proposées
								
								<br> 
								<button type="button" class="btn btn-primary btn-trajet">Voir détails</button>

							</div>
							
							<div class="col-md-2 pull-right">
								
							</div>
							
						</div>
						
					</p>
						
					
					<p class="trajet">
						<div class="row">
							<div class="col-md-1">
								
							</div>
							<div class="col-md-2">
								<span class="info1">Lundi 18 janvier</span><br> 
								<span class="info2">Aller :&nbsp;</span>7h<br>
							</div>
							
							<div class="col-md-4">
								<span class="info1">IGS â†’ Toulouse</span><br> 
								<span class="info2">Départ :&nbsp;</span> 186 Route de Grenade, 31700 Blagnac<br>
								<span class="info2">Arrivée :&nbsp;</span> &nbsp;5 rue Ambroise Thomas, 31400 Toulouse<br>
							</div>
							
							<div class="col-md-2">
								3 places proposées
								
								<br> 
								<button type="button" class="btn btn-primary btn-trajet">Voir dÃ©tails</button>

							</div>
							
							<div class="col-md-2 pull-right">	
							</div>
							
						</div>
						
					</p>		
					
					<p class="trajet">
						<div class="row">
							<div class="col-md-1">
								
							</div>
							<div class="col-md-2">
								<span class="info1">Régulier</span><br> 
								
								<table class="table table-condensed">
									<thead>
										<tr>
											<th class="tablehead">Lun</th>
											<th class="tablehead">Mar</th>
											<th class="tablehead">Mer</th>
											<th class="tablehead">Jeu</th>
											<th class="tablehead">Ven</th>
											
										</tr>
									</thead>
									
									<tbody>
										<tr>
											<td>7h</td>
											<td>7h</td>
											<td>7h</td>
											<td>9h</td>
											<td>7h</td>
										
										</tr>
										<tr>
											<td>17h</td>
											<td>-</td>
											<td>-</td>
											<td>14h</td>
											<td>17h</td>
										
										</tr>
									</tbody>
								</table>

								
							</div>
							
							<div class="col-md-4">
								<span class="info1">IGS â†” Toulouse</span><br> 
								<span class="info2">Départ :&nbsp;</span> 186 Route de Grenade, 31700 Blagnac<br>
								<span class="info2">Arrivée :&nbsp;</span> &nbsp;5 rue Ambroise Thomas, 31400 Toulouse<br>
							</div>
							
							<div class="col-md-2">
								3 places proposées
								
								<br> 
								<button type="button" class="btn btn-primary btn-trajet">Voir détails</button>

							</div>
							
							<div class="col-md-2 pull-right">
								
							</div>
							
						</div>
						
					</p>
					<div class="row">
					<div class="col-md-1">
								
							</div>
					<div class="col-md-2">		
					<ul class="pagination">
						<li><a href="#">&laquo;</a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">&raquo;</a></li>
						
					</ul>
					</div>	
					</div>
					
		</div>