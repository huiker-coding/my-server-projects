// logout
$("#logoutBtn").click(function(){
    ComConfirm.show("确认注销登录?", function(){
        $.ajax({
            type: "GET",
            url: "/wa/bgmanager/interface/loginOut",
            dataType: "html",
            success: function(msg) {
                // $("#state").text(msg);
                // ComAlert.show(1, msg);
                window.location.href = "/wa/bgmanager/page/login";
            }
        });
    });
});