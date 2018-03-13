<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<h1>Customers</h1>
<p>All the available customers in our store</p>
</div>
</div>
</section>
<section class="container">
<div class="row">
<c:forEach items="${customers}" var="customer">
<div class="col-sm-6 col-md-3">
<div class="thumbnail">
<div class="caption"  style="box-shadow: 0px 0px 40px 3px rgba(0, 0, 0, 0.15); text-align: center; padding: 10px; cursor: pointer; height: auto; ">
<h3>${customer.name}</h3>
<p>${customer.address}</p>
</div>
</div>
</div>
</c:forEach>
</div>
</section>
</body>
</html>
</body>
</html>