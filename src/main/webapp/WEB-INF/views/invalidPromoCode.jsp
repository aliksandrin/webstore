<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css">
<title>Invalid Promo Code</title>
</head>
<body>
<section>
<div class="jumbotron">
<div class="container">
<h1 class="alert alert-danger"> Invalid promo code</h1>
</div>
</div>
</section>
<section>
<div class="container">
<p>
<a href="<spring:url value="/products"/>" class="btn btn-primary">
<span class="glyphicon-hand-left glyphicon">
</span> products </a>
</p>
</div>
</section>
</body>
</html>