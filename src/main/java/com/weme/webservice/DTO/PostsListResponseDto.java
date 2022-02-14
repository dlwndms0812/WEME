package com.weme.webservice.DTO;

import com.weme.webservice.Entity.PostsEntity;
import lombok.Getter;

@Getter
public class PostsListResponseDto {
    private String id;
    private String title;
    //private String modifiedDate;


    public PostsListResponseDto(PostsEntity entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        //this.modifiedDate = entity.getPost_date();
    }
}
