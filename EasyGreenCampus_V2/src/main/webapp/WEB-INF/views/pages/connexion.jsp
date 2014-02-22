<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="postLoginUrl" value="j_spring_security_check" />
<div class="container">
	<div class="col-md-12 column">
		<div class="row clearfix">
			<div class="col-md-3 column"></div>
			<div class="col-md-6 column">
				
					<form class="form-horizontal" action="${postLoginUrl}" method="post">
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">Email</label>
							<div class="col-sm-10">
								<input class="form-control" id="inputEmail3" placeholder="Email"
									type="email" name="j_username">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">Mot
								de passe</label>
							<div class="col-sm-10">
								<input class="form-control" id="inputPassword3"
									placeholder="Password" type="password" name="j_password">
							</div>
						</div>
						<div class="form-group">
							<label for="inputRemember" class="col-sm-2 control-label">Se souvenir de moi</label>
							<div class="col-sm-10">
								<input  id="inputRemember"
									type="checkbox" name="_spring_security_remember_me">
							</div>
						</div>
						<!-- 					  <div class="form-group"> -->
						<!-- 					    <div class="col-sm-offset-2 col-sm-10"> -->
						<!-- 					      <div class="checkbox"> -->
						<!-- 					        <label> -->
						<!-- 					          <input type="checkbox"> Remember me -->
						<!-- 					        </label> -->
						<!-- 					      </div> -->
						<!-- 					    </div> -->
						<!-- 					  </div> -->
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-default">Me
									connecter</button>
							</div>
						</div>
					</form>
			</div>
			<div class="col-md-3 column"></div>
		</div>
	</div>
</div>


