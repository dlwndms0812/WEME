var main = {
    init : function(){
        var _this = this;
        $('#btn-save').on('click', function() {
            _this.save();
        });
    },
    save : function() {
        var data = {
            title: $('#title').val(),
            id: $('#id').val(),
            context: $('context').val(),
            image: $('#image').val(),
            animal_name: $('#animal_name').val(),
            animal_kinds: $('#animal_kinds').val(),
            animal_gender: $('#animal_gender').val(),
            animal_size: $('#animal_size').val(),
            animal_feature: $('#animal_feature').val(),
            animal_vaccine: $('#animal_vaccine').val(),
            animal_neuter: $('#animal_neuter').val(),
            animal_area1: $('#animal_area1').val(),
            animal_area2: $('#animal_area2').val(),
            posts_date: $('#posts_date').val(),
            board_id: $('#board_id').val(),
            posts_num: $('#posts_num').val(),
            posts_url: $('#posts_url').val()
        };

        $.ajax({
            type: "POST"
            url: '/protection/{id}/posts'
            dataType: 'json'
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function(){
            alert('글이 등록되었습니다.');
            window.location.href = '/'
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }

};

main.init();