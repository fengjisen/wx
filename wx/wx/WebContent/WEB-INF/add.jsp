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
    <title>add</title>
    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/add.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <script type="text/javascript"  src="js/jquery-3.2.1.min.js"></script>

</head>
<body>
    <div class="wrapper">
        <div class="row">
            <div class="title col-sm-12">完善配送联系信息</div>
            <div class="blank col-sm-12"></div>
            <form class="sex col-sm-12">
                <input type="radio" name="sexO" />女士
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="radio" name="sexT" />先生
            </form>
            <div class="blank col-sm-12"></div>
            <form class="info col-sm-12">
                姓名&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input class="name" placeholder="请输入联系人的姓名"></input><br/>
                手机&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input class="phone" placeholder="请输入联系人的手机"></input>
            </form>
            <div class="blank col-sm-12" ></div>
            <form class="addr col-sm-12">
                地区&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input class="area" placeholder="请输入所在地区"></input><br/>
                地址&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input class="address" placeholder="请输入具体地址/街道/门牌号"></input><br/>
                设为默认
            </form>
            <div class="blank col-sm-12"></div>
                <div class="save col-sm-12">
                    <button class="btn">保存</button>
                </div>
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

<script type="text/javascript">
    $(".btn").click(function(){
        alert("已保存！");
    });
</script>
</body>
</html>