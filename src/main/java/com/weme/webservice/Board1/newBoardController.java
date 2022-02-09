package com.weme.webservice.Board1;

import com.weme.webservice.DTO.postsform;
import com.weme.webservice.Entity.Posts;
import com.weme.webservice.Repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//게시글 작성하는 페이지(저장)
@Controller
public class newBoardController {

    @Autowired
    private PostsRepository postsRepository;

    //html 과 연결해야하는 url 주소를 넣어야 함
    @GetMapping("/newBoard")
    public String uploadBoard() {return "Login/newBoard";}

    //html form 에서 변수명 지정 필요
    @GetMapping("/Login/upload")
    public String createBoard(postsform form) {
        System.out.println(form.toString());

        //게시글을 저장(업로드)
        //DTO를 Entity로 변환
        Posts newpost = form.toEntity();
        System.out.println(newpost.toString());

        //Repository에게 Entity를 DB 안에 저장
        Posts savedPost = postsRepository.save(newpost);
        System.out.println(savedPost.toString());

        return " ";
    }
}
