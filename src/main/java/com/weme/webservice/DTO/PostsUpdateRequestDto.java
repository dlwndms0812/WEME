package com.weme.webservice.DTO;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PostsUpdateRequestDto {
    private String title;
    private String context;

    @Builder
    public PostsUpdateRequestDto(String title, String context){
        this.title = title;
        this.context = context;
    }
}
