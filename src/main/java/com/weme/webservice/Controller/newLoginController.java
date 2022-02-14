package com.weme.webservice.Controller;

import com.weme.webservice.DTO.userDto;
import com.weme.webservice.Entity.UserEntity;
import com.weme.webservice.Service.newLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//회원가입 페이지
@Controller
public class newLoginController {

    //원래 자바라면 객체를 만들어서 사용해야함
    //그러나 스트링 부트의 경우 객체를 만들 필요 없음
    @Autowired
    private newLoginService newloginservice;

    //html과 연결해야하는 url 주소를 넣어야 함
    @GetMapping("/newLogin")
    public String newLogin(){
        return "newLogin";
    }

    //html form 에서 변수명 지정 필요
    //메인화면으로 가도록 설정 필요
    @GetMapping("/Login")
    public UserEntity saveLogin(userDto userdto){
        System.out.println(userdto.toString());

        return newloginservice.saveInfo(userdto);
    }
}
