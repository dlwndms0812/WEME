package com.weme.webservice.Controller;

import com.weme.webservice.DTO.PostsResponseDto;
import com.weme.webservice.DTO.postsDto;
import com.weme.webservice.Entity.PostsEntity;
import com.weme.webservice.Entity.UserEntity;
import com.weme.webservice.Service.newBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PostsIndexController {

    @Autowired
    private newBoardService newBoardservice;

    //글 등록을 위한 목록 화면
    @GetMapping("/")
    public String index(Model model){
        //페이지 화면 -> html 필요
        //posts -> html 에서 사용하는 변수
        model.addAttribute("posts", newBoardservice.findAllDesc());
        return "index";
    }

    //html 과 연결해야하는 url 주소를 넣어야 함
    @GetMapping("/posts/save")
    public String postsSave() {return "posts-save";}

    //게시글 수정
    @GetMapping("/posts/update/{{id}}")
    public String postsUpdate(@PathVariable String id, Model model)
    {
        PostsResponseDto dto = newBoardservice.findById(id);
        model.addAttribute("post", dto);
        return "posts-update";
    }

    //html form 에서 변수명 지정 필요
    //글 저장 & 다시 목록 화면으로 이동
    /*@GetMapping("/Login/index")
    public PostsEntity createBoard(postsDto postsfm) {
        System.out.println(postsfm.toString());

        return newBoardservice.saveBoard(postsfm);
    }*/

}
