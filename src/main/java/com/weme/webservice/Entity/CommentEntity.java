package com.weme.webservice.Entity;

import lombok.*;
import javax.persistence.*;

@Entity //DB가 해당 객체를 인식 가능
@NoArgsConstructor
public class CommentEntity {

    @Id
    private Integer posts_num;
    @Column
    private String comment_id;
    @Column
    private String comment_date;
    @Column
    private String comment_context;
    @Column
    private Integer comment_num;

    public CommentEntity(Integer posts_num, String comment_id, String comment_date, String comment_context, Integer comment_num) {
        this.posts_num = posts_num;
        this.comment_id = comment_id;
        this.comment_date = comment_date;
        this.comment_context = comment_context;
        this.comment_num = comment_num;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "posts_num=" + posts_num +
                ", comment_id='" + comment_id + '\'' +
                ", comment_date='" + comment_date + '\'' +
                ", comment_context='" + comment_context + '\'' +
                ", comment_num=" + comment_num +
                '}';
    }
}
