
$(function(){



//动态记录页面滚动
    function scrollPostion(){
        $(document).scroll(function(){
            var hotSaleTop =  $("#hotSale").offset().top;
            var discountTop =  $("#discount").offset().top;
            var mealTop =  $("#meal").offset().top;
            var signTop =  $("#sign").offset().top;
            var goodsTop =  $("#goods").offset().top;
            if($(document).scrollTop()>introduceTop){$("#leftMenu li").eq(1).addClass("sec").siblings().removeClass("sec")}
            if($(document).scrollTop()>skillTop ){ $("#leftMenu li").eq(2).addClass("sec").siblings().removeClass("sec");}
            if($(document).scrollTop()>eductionTop ){$("#lefttMenu li").eq(3).addClass("sec").siblings().removeClass("sec")}
            if($(document).scrollTop()>productionTop){$("#leftMenu li").eq(4).addClass("sec").siblings().removeClass("sec")}
            if($(document).scrollTop()>contactTop ){$("#leftMenu li").eq(5).addClass("sec").siblings().removeClass("sec")}
        });
    }
    scrollPostion();

//点击左边导航
    function clickLink() {
        $("#rightMenu li a").click(function () {
            var atr = $(this).attr('href');
            var t = $(atr).offset().top;
            $("html,body").animate({"scrollTop": t}, 500);
            return false;
        });
    }
    clickLink();



    new WOW().init();

});