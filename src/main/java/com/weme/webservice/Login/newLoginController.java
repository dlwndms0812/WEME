package com.weme.webservice.Login;

import com.weme.webservice.DTO.userform;
import com.weme.webservice.Entity.User;
import com.weme.webservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//회원가입 페이지
@Controller
public class newLoginController {

    //원래 자바라면 객체를 만들어서 사용해야함
    //그러나 스트링 부트의 경우 객체를 만들 필요 없음
    @Autowired
    private UserRepository userRepository;

    //html과 연결해야하는 url 주소를 넣어야 함
    @GetMapping("/newLogin")
    public String newLogin(){
        return "Login/newLogin";
    }

    //html form 에서 변수명 지정 필요
    @GetMapping("/Login/new")
    public String createregister(userform form){
        System.out.println(form.toString());

        //DTO를 Entity로 변환
        User newuser = form.toEntity();
        System.out.println(newuser.toString());

        //Repository에게 Entity를 DB 안에 저장
        User savedUser = userRepository.save(newuser);
        System.out.println(savedUser.toString());

        return " ";
    }
}
