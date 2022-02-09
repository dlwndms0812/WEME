package com.weme.webservice.Board1;

import com.weme.webservice.DTO.postsform;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//게시물이 보이는 페이지(조회)
//데이터 베이스에 사용자가 선택하는 게시글이 있는지 확인
//-> 있다면 게시글 가져오기(load), 없다면 없는 페이지임을 알리기
@Controller
public class viewBoardController {

    /*@GetMapping()
    public String viewBoard() {return "/";}

    @GetMapping()
    public String BoardContent(postsform form){
        System.out.println(form.toString());

        //데이터 베이스에 저장되어있는 내용 불러오기

        return " ";
    }*/

}
