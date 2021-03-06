<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="0">
    <title>我的设置</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/mine.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script type="text/javascript"  src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>

</head>

<body>
<div class="wrapper">
    <div class="topInfo col-md-12 col-sm-12">
        <div class="user_pic">
            <img src="${userInfo.headimgurl}" alt="userPic">   
        </div>
        <div class="info_text">${userInfo.nickname}</div>
    </div>
    <div class="rest col-md-12 col-sm-12"></div>
    <div class="per">
        <div class="account">
            <div class="per_left col-md-6 col-sm-6">
                   <img src="${pageContext.request.contextPath}/image/account.jpg" alt="account">
                   <span class="text">账户</span>
            </div>
            <div class="per_right col-md-6 col-sm-6">
                <i class="glyphicon glyphicon-chevron-right"></i>
            </div>
        </div>
        <div class="ticket">
            <div class="ticket_left col-md-6 col-sm-6">
               <a href="" title="">
                   <img src="${pageContext.request.contextPath}/image/ticket.jpg" alt="ticket">
                   <span class="left_text">优惠券</span>
               </a>
            </div>
            <div class="ticket_right col-md-6 col-sm-6">
                <i class="glyphicon glyphicon-chevron-right"></i>
            </div>
        </div>        
    </div>
    <div class="rest col-sm-12"></div>
    <div class="other">
        <div class="address">
            <div class="address_left col-md-6 col-sm-6">
               <a href="${pageContext.request.contextPath}/addressServlet?method=getAddressListByUid" title="">
                   <img src="${pageContext.request.contextPath}/image/address.jpg" alt="address">
                   <span class="left_text">地址管理</span>
               </a>
            </div>
            <div class="address_right col-md-6 col-sm-6">
                <i class="glyphicon glyphicon-chevron-right"></i>
            </div>
        </div>
        <div class="contact">
            <div class="contact_left col-md-6 col-sm-6">
               <a href="" title="">
                   <img src="${pageContext.request.contextPath}/image/earphone.jpg" alt="contact">
                   <span class="left_text">联系客服</span>
               </a>
            </div>
            <div class="contact_right col-md-6 col-sm-6">
                <span class="num">0000-0000000</span>
                <i class="glyphicon glyphicon-chevron-right"></i>
            </div>
        </div>
    </div>
    <div class="blank col-sm-12">
    	
    </div>
</div>


<div class="bottom">
    <div class="col-sm-12">
        <a href="##" title="">
            <span class="glyphicon glyphicon-home" style="color:#000"><div class="detail">菜单</div></span>
        </a>
        <a href="##" title="">
            <span class="glyphicon glyphicon-shopping-cart" style="color:#000"><div class="detail">购物车</div></span>
        </a>
        <a href="##" title="">
            <span class="glyphicon glyphicon-time" style="color:#000"><div class="detail">轻松套餐</div></span>
        </a>
        <a href="##" title="">
            <span class="glyphicon glyphicon-list-alt" style="color:#000"><div class="detail">订单</div></span>
        </a>
        <a href="##" title="">
            <span class="glyphicon glyphicon-user" style="color:#000"><div class="detail">我的</div></span>
        </a>
    </div>
</div>

</body>
</html>