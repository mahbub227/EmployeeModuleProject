<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${path}/webjars/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet"href="${path}/custom.css">
<script type="text/javascript"
	src="${path}/webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script type="text/javascript"
	src="${path}/webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${path}/jquery-boot.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.16/datatables.min.css"/>
 
<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.16/datatables.min.js"></script>
<script>
    window.menu='${title}';
    window.contextRoot='${contextRoot}/employee';
    </script>
<title>Welcome</title>
</head>
<body>
	<div class="row">
		<div class="container">
			<%@include file="./shared/navbar.jsp"%>
			
			<c:if test="${userClickHome == true}">
			<%@include file="table.jsp"%></c:if>
			<c:if test="${userClickCreate == true}">
			<%@include file="create.jsp"%></c:if>
			
			
			<%@include file="./shared/footer.jsp"%>
		</div>
	</div>


</body>
</html>