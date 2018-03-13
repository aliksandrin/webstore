<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<title>Products</title>
</head>
<body>

<section>
<div class="jumbotron">
<div class="dropdown col-md-5">
  <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
    Language
  </button>
  <div class="dropdown-menu">
      <a class="dropdown-item" href="?language=en" >English</a>
      <a class="dropdown-item" href="?language=nl" >Dutch </a>
      <div class="dropdown-divider"></div>
      <a class="dropdown-item" href="<c:url value="/logout" />">Logout</a>
    </div>
</div>
<div class="container">
<h1>Products</h1>
</div>
</div>
</section>
<section class="container">
<div class="row">
<div class="col-md-5">
<img src="<c:url value="/img/${product.productId}.png"></c:url>" alt="image" style = "width:100%"/>
<a href="<c:url value="/pdf/${product.productId}.pdf"></c:url>" class="btn btn-default">
<span class="glyphicon-hand-left glyphicon"></span> Manual</a>
</div>
<div class="col-md-5">
<h3>${product.name}</h3>
<p>${product.description}</p>
<p>
<strong>Item Code : </strong><span
class="label label warning">${product.productId}
</span>
</p>
<p>
<strong>manufacturer</strong> :
${product.manufacturer}
</p>
<p>
<strong>category</strong> :
${product.category}
</p>
<p>
<strong>Availble units in stock </strong> :
${product.unitsInStock}
</p>
<h4>${product.unitPrice} USD</h4>
<p>

<a href="#" class="btn btn-warning btn-large">
<span class="glyphicon-shopping-cart glyphicon">
</span> Order Now
</a>
<a href="<spring:url value="/products" />" class="btn btn-default">
        <span class="glyphicon-hand-left glyphicon"></span> back
        </a>
</p>
</div>
</div>
</section>
</body>
</html>