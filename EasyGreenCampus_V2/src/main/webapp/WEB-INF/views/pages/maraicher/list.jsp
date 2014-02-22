<% 
  for(int i = 0; i < 5; i++){
%>
	<div class="container">
		<table>
			<tr>
				<td>Nom:  </td>
				<td> <label name="nom" /></td> 
				<td>Adresse:  </td>
				<td><label name="adress"></td> 
			</tr>
			<tr>
				<td>Téléphone:  </td>
				<td><label name="tel"></td> 
				<td>Mail:  </td>
				<td><label name="mail"></td> 
			</tr>
			<tr>
				<td>Lien hypertexte:  </td>
				<td> <a href="#" target="_blank">Site internet</a></td> 
			</tr>
			<tr>
				<td>Plan:  </td>
				<td> <img src="img/plan.png"></td> 
			</tr>
			<tr>
				<td>Tarifs:  </td>
				<td> <label name="tarif"></td> 
			</tr>
		</table>
	<hr/>
</div>
<%
}
%>