<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="0">
<title>address</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/address.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">


</head>
<body>
	<div class="container">
		<div class="row">
			<div class="text col-sm-12">您的配送收货地址列表如下：</div>
			<div class="blank col-sm-12"></div>


			<c:forEach items="${list }" var="address" varStatus="status">
				<div class="detail">
					<span class="left col-sm-2"> <img
						src="${pageContext.request.contextPath}/image/car.jpg" alt="car">
					</span> <span class="middle col-sm-7">
						<div class="username">用户名&nbsp;性别</div>
						<div class="phone">12345678901</div>
						<div class="addr">用户地址用户地址用户地址</div>
					</span> <span class="right col-sm-3">一般配送</span>
				</div>

			</c:forEach>


			<div class="rest"></div>
		</div>
	</div>
	<a class="btn" href="add.html">添加收货地址</a>

	<div class="bottom">
		<div class=" col-sm-12">
			<a href="##" title=""> <span class="glyphicon glyphicon-home"
				style="color: #000"><div class="detail">菜单</div></span>
			</a> <a href="##" title=""> <span
				class="glyphicon glyphicon-shopping-cart" style="color: #000"><div
						class="detail">购物车</div></span>
			</a> <a href="##" title=""> <span class="glyphicon glyphicon-time"
				style="color: #000"><div class="detail">轻松套餐</div></span>
			</a> <a href="##" title=""> <span
				class="glyphicon glyphicon-list-alt" style="color: #000"><div
						class="detail">订单</div></span>
			</a> <a href="##" title=""> <span class="glyphicon glyphicon-user"
				style="color: #000"><div class="detail">我的</div></span>
			</a>
		</div>
	</div>

</body>
</html>