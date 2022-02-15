package com.weme.webservice.DTO;

import com.weme.webservice.Entity.UserEntity;
import lombok.*;

@Data
@NoArgsConstructor
@ToString
@Builder
public class userDto {

    private String id;
    private String name;
    private String phone_num;
    private String email_1;
    private String email_2;
    private String nickname;
    private String password;

    public userDto(String id, String name, String phone_num, String email_1, String email_2, String nickname, String password) {
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
        return "userform{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone_num='" + phone_num + '\'' +
                ", email_1='" + email_1 + '\'' +
                ", email_2='" + email_2 + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public UserEntity toEntity() {
        return new UserEntity(id, name, phone_num, email_1, email_2, nickname, password);
    }
}
