package com.weme.webservice.DTO;

import com.weme.webservice.Entity.CommentEntity;
import lombok.*;

@Data
@NoArgsConstructor
@ToString
@Builder
public class commentDto {

    private Integer posts_num;
    private String comment_id;
    private String comment_date;
    private String comment_context;
    private Integer comment_num;

    public commentDto(Integer posts_num, String comment_id, String comment_date, String comment_context, Integer comment_num) {
        this.posts_num = posts_num;
        this.comment_id = comment_id;
        this.comment_date = comment_date;
        this.comment_context = comment_context;
        this.comment_num = comment_num;
    }

    @Override
    public String toString() {
        return "commentform{" +
                "posts_num=" + posts_num +
                ", comment_id='" + comment_id + '\'' +
                ", comment_date='" + comment_date + '\'' +
                ", comment_context='" + comment_context + '\'' +
                ", comment_num=" + comment_num +
                '}';
    }

    public CommentEntity toEntity() {
        return new CommentEntity(posts_num, comment_id, comment_date, comment_context, comment_num);
    }
}
