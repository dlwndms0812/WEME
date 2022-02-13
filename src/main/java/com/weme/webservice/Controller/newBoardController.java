package com.weme.webservice.Controller;

import com.weme.webservice.DTO.postsform;
import com.weme.webservice.Entity.Posts;
import com.weme.webservice.Repository.PostsRepository;
import com.weme.webservice.Service.newBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//게시글 작성하는 페이지(저장)
@Controller
public class newBoardController {

    @Autowired
    private newBoardService newBoardservice;

    @GetMapping("/BoardList")
    public String index(Model model){
        //페이지 화면 -> html 필요
        //posts -> html 에서 사용하는 변수
        model.addAttribute("posts", newBoardservice.findAllDesc());
        return "Login/index";
    }

    //html 과 연결해야하는 url 주소를 넣어야 함
    @GetMapping("/newBoard")
    public String uploadBoard() {return "Login/newBoard";}

    //html form 에서 변수명 지정 필요
    @GetMapping("/Login/index")
    public Posts createBoard(postsform postsfm) {
        System.out.println(postsfm.toString());

        return newBoardservice.saveBoard(postsfm);
    }

    //게시글 수정, 삭제
    @GetMapping("/Login/deleteBoard/{id}")
    public String postsUpdate(){
        return "Login/deleteBoard/{id}";
    }

    //게시글 삭제 -> Api 만들어야함
    /*@DeleteMapping("/Login/deleteBoard/{id}")
    public String delete(@PathVariable String id){
        newBoardservice.delete(id);
        return id;
    }*/
}
