<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
<section>
<div class="jumbotron">
<a class="dropdown-item" href="<c:url value="/logout" />">Logout</a>
<div class="container">
<h1>Customer</h1>
<p>register</p>
</div>
</div>
</section>
<section class="container">
<form:form method="POST" modelAttribute="newCustomer" class="form-horizontal">
<fieldset>
<legend>Registration form</legend>
<div class="form-group">
<label class="control-label col-lg-2 col-lg-2" for="customerId">ID</label>
<div class="col-lg-10">
<form:input id="customerId" path="customerId" type="text" class="form:input-large"/>
</div>
</div>
<div class="form-group">
<label class="control-label col-lg-2 col-lg-2" for="name">Name</label>
<div class="col-lg-10">
<form:input id="name" path="name" type="text" class="form:input-large"/>
</div>
</div>
<div class="form-group">
<label class="control-label col-lg-2 col-lg-2" for="address">Address</label>
<div class="col-lg-10">
<form:input id="address" path="address" type="text" class="form:input-large"/>
</div>
</div>
<div class="form-group">
<div class="col-lg-offset-2 col-lg-10">
<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
</div>
</div>
</fieldset>
</form:form>
</section>
</body>
</html>