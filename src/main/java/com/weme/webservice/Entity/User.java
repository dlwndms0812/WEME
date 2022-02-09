package com.weme.webservice.Entity;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //DB가 해당 객체를 인식 가능
@NoArgsConstructor
public class User {

    @Id //대표값을 지정
    //@GeneratedValue //-> 1,2,3... 자동 생성 어노테이션
    private String id;

    @Column
    private String name;
    @Column
    private String phone_num;
    @Column
    private String email_1;
    @Column
    private String email_2;
    @Column
    private String nickname;
    @Column
    private String password;

    public User(String id, String name, String phone_num, String email_1, String email_2, String nickname, String password) {
        this.id = id;
        this.name = name;
        this.phone_num = phone_num;
        this.email_1 = email_1;
        this.email_2 = email_2;
        this.nickname = nickname;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone_num='" + phone_num + '\'' +
                ", email_1='" + email_1 + '\'' +
                ", email_2='" + email_2 + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
