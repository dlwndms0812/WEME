package com.weme.webservice.Service;

import com.weme.webservice.DTO.userDto;
import com.weme.webservice.Entity.UserEntity;
import com.weme.webservice.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class newLoginService {

    @Autowired
    private UserRepository userRepository;

    //새로운 회원 가입
    //기존의 회원이 회원가입을 하려고 시도하는 경우 -> if 문으로 걸러내기
   public UserEntity saveInfo(userDto userdto) {
        //DTP -> Entity
        UserEntity newuser = userdto.toEntity();
        System.out.println(newuser.toString());

        //Repository에게 Entity를 DB 안에 저장
        UserEntity savedUser = userRepository.save(newuser);
        //System.out.println(savedUser.toString());

        return savedUser;
    }

    /*public UserDetail loadUserByUserId(String id) throws UserIdNotFoundException {
        User userid = userRepository.findByUserID(id);
        if(userid == null) {
            throw new UserIdNotFoundException(id);
        }
        return new UserAccount(userid);
    }*/

}
