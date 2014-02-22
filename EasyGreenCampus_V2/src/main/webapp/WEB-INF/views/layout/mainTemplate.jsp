<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/notreStyle.css" rel="stylesheet">

<script type="text/javascript" src="resources/js/jquery.js"></script>
<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/scripts.js"></script>
<title><tiles:insertAttribute name="title" ignore="true"></tiles:insertAttribute>
</title>
</head>
<body>
	<table border="0" cellpadding="2" cellspacing="2" align="left">
		<tr>
			<td align="left"><tiles:insertAttribute
					name="header"></tiles:insertAttribute></td>
		</tr>
		<tr>
			<td><tiles:insertAttribute name="menu"></tiles:insertAttribute>
			</td>
		</tr>
			<tr>
			<td><tiles:insertAttribute name="body"></tiles:insertAttribute>
			
			</td>
		</tr>
		<tr>
			<td align="center"><tiles:insertAttribute
					name="footer"></tiles:insertAttribute></td>
		</tr>
	</table>
</body>
</html>