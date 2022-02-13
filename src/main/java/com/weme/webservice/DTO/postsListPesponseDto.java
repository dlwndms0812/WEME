package com.weme.webservice.DTO;

import com.weme.webservice.Entity.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class postsListPesponseDto {
    private String id;
    private String title;
    //private String modifiedDate;


    public postsListPesponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        //this.modifiedDate = entity.getPost_date();
    }
}
