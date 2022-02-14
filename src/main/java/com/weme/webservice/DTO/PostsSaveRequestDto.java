package com.weme.webservice.DTO;

import com.weme.webservice.Entity.PostsEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String context;
    private String id;

    @Builder
    public PostsSaveRequestDto(String title, String context, String id){
        this.title = title;
        this.context = context;
        this.id = id;
    }

    public PostsEntity toEntity() {
        return PostsEntity.builder()
                .title(title)
                .context(context)
                .id(id)
                .build();
    }
}
