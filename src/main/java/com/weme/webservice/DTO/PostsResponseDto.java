package com.weme.webservice.DTO;

import com.weme.webservice.Entity.PostsEntity;
import lombok.Getter;

@Getter
public class PostsResponseDto {

    private String id;
    private String title;
    private String context;
    //private String author;

    public PostsResponseDto(PostsEntity entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.context = entity.getContext();
    }
}
