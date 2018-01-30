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
<div class="container">
<h1>Products</h1>
<p>All the available products in our store</p>
</div>
</div>
</section>
<section class="container">
<div class="row">
<div class="col-sm-6 col-md-3">
<h2>Brands</h2>
<c:forEach items="${products}" var="product">
<ul>
    <a href="<c:url value = "/products/filter/params;brands=${product.manufacturer};"/>"><li>${product.manufacturer}</li></a>
</ul>
</c:forEach>
</div>
<c:forEach items="${products}" var="product">
<div class="col-sm-6 col-md-3">
<div class="thumbnail">
<div class="caption"  style="box-shadow: 0px 0px 40px 3px rgba(0, 0, 0, 0.15); text-align: center; padding: 10px; cursor: pointer; height: 300px; ">
<h3>${product.name}</h3>
<p>${product.description}</p>
<p>${product.unitPrice}</p>
<p>Available ${product.unitsInStock} units in stock</p>
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