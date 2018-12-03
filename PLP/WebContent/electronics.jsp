<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.navbar {
    overflow: hidden;
    background-color: #777;
    font-family: Arial, Helvetica, sans-serif;
}

.navbar a {
    float: left;
    font-size: 16px;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

.dropdown {
    float: left;
    overflow: hidden;
}

.dropdown .dropbtn {
    font-size: 16px;    
    border: none;
    outline: none;
    color: white;
    padding: 14px 16px;
    background-color: inherit;
    font-family: inherit;
    margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
    background-color: red;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    float: none;
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {
    background-color: #ddd;
}

.dropdown:hover .dropdown-content {
    display: block;
}
</style>
</head>
<body>

<div class="navbar">
  <a href="ho">Home</a>
  <div class="dropdown">
    <button class="dropbtn">Category
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="products?id=10">Electronics</a>
      <a href="products?id=11">Home and Furniture</a>
      <a href="products?id=12">Sports and Books</a>
    </div>
  </div> 
  <a href="cart.html">Cart</a>
  <a href="wishlist.html">Wishlist</a>
  <a href="logout.html">Logout</a>
</div>
<table border="1">
<tr>
<th>
Product Name</th>
<th>Price</th>
<th>Quantity</th>
</tr>
<a:forEach var="a" items="${data}">
<tr><td>
<a href="${a.productName}?sName=${a.productName}" >${a.productName}</a></td>
<td>${a.productPrice}</td>
<td>${a.productQuantity}</td>
</tr>

</a:forEach>
</br>
<a href="sort?id=${data.get(0).categoryId}&aqqq=1">Sort(A-Z)</a> &nbsp <a href="sort?id=${data.get(0).categoryId}&aqqq=2">Sort(Z-A)</a> &nbsp<a href="sort?id=${data.get(0).categoryId}&aqqq=3">Sort(Price:Low to High)</a>  &nbsp   <a href="sort?id=${data.get(0).categoryId}&aqqq=4">Sort(Price:High to Low)</a>
</table>
</body>
</html>