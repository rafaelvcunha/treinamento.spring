<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML>
<html lang="pt-BR">
	<head>

		<meta http-equiv="content-type" content="text/ html;charset=utf-8"/>
		<meta charset="UTF-8"/>

		<!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->
		<meta name="viewport" content="width=device-width, initial-scale=1"/>

		<link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/images/favicon.ico"/>

		<title><tiles:insertAttribute name="title" /></title>

	</head>
	<body>

		<tiles:insertAttribute name="body" />

	</body>
</html>
