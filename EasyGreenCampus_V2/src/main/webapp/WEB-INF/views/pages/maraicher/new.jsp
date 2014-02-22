<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<div class="container">



<%-- 	<c:if test="${! empty SEARCH_LIST_MARAICHERS}"> --%>
<%-- 	<c:forEach var="maraicher" items="${SEARCH_LIST_MARAICHERS}">	 --%>
<!-- 		<tr> -->
<%-- 			<td><c:out value=""></c:out></td> --%>
<%-- 			<td><c:out value="${maraicher.}"></c:out></td> --%>
<!-- 		</tr> -->
<%-- 	</c:forEach> --%>
<%-- 	</c:if> --%>


	<!-- Formulaire de saisie d'un Maraicher--> 
	<form method="post" action="new" >
		<table>
			<tr>
				<td>Liste des titres :</td>
				<td colspan="3">
					<select name="listeTitre">${listeMaraicher}</select>
				</td> 
			</tr>
			<tr>
				<td>Titre :</td>
				<td colspan="3"><input type="text" class="form-control" placeholder="Titre"></td> 
			</tr>
			<tr>
				<td>Description :</td>
				<td colspan="3"><textarea class="form-control" placeholder="Description" rows="5" style="margin-left: 0px; margin-right: 0px; width: 463px;"></textarea></td> 
			</tr>
			<tr>
				<td>Lien hypertexte :</td>
				<td> <input type="text" class="form-control" placeholder="http://"></td> 
				<td>Téléphone :</td>
				<td> <input type="text" class="form-control" placeholder="" width="20"></td> 
			</tr>
			<tr>
				<td>Fax :</td>
				<td> <input type="text" class="form-control" placeholder="" width="20"></td> 
				<td>Mail :</td>
				<td> <input type="text" class="form-control" placeholder="@"></td> 
			</tr>
			<tr>
				<td>Ville :</td>
				<td> <input type="text" class="form-control" placeholder=""></td> 
				<td>Code postal :</td>
				<td> <input type="text" class="form-control" placeholder="" width="5"></td> 
			</tr>
			<tr><td colspan="4"><hr/></td></tr>
			<tr>
				<td></td>
				<td></td>
				<td><button type="submit" class="btn btn-default">Valider</button></td>
				<td><button type="reset" class="btn btn-default">Réinitialiser</button></td>
			</tr>
		</table>
	</form>
</div>
