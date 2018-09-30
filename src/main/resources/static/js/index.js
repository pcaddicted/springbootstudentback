window.onload = function(){
    //请求学生列表
    $.ajax({
        type: "GET",
        url: "/user",
        dataType:"json"
    }).done(function( msg ) {
        makeuserList(msg);
    });

    //生成用户列表
    function makeuserList(jsonstr){
        $("#table_body").empty();
        $.each(jsonstr.data,function(index,value){
            var newElement = $('<tr></tr>');
            var nameNode = $('<td>'+value.name+'</td>');
            var ageNode = $('<td>'+value.age+'</td>');
            var sexNode ;
            if(value.sex==1) {
                sexNode = $('<td>男</td>');
            }else{
                sexNode = $('<td>女</td>');
            }
            var hrefNode = $('<td><a class="text-primary" ' +
                'id="user_detail" href="detail.html?id='+value.id+'">查看详情</a><a class="text-primary" id="user_class" href="course.html?id='+value.id+'">选课查看</a></td>');
            newElement.append(nameNode);
            newElement.append(ageNode);
            newElement.append(sexNode);
            newElement.append(hrefNode);
            $("#table_body").append(newElement);
        });
    }

}

