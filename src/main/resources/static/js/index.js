window.onload = function(){
    //请求学生列表
    $.ajax({
        type: "GET",
        url: "/user",
        dataType:"json"
    }).done(function( msg ) {

        makeuserList(msg);
    });

    function makeuserList(jsonstr){
        $.each(jsonstr.data, function (n, value) {
            alert(n + ' ' + value.name);
            var newElement=$('<div class="col-md-12">'+value.name+'</div>');
            $("#user_list").append(newElement);
        });

    }
}

