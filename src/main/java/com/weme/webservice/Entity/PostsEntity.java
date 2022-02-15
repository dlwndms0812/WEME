package com.weme.webservice.Entity;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class PostsEntity {

    @Id
    private String id;

    @Column
    private String title;
    @Column
    private String image;
    @Column
    private String animal_name;
    @Column
    private String animal_kinds;
    @Column
    private String animal_gender;
    @Column
    private String animal_size;
    @Column
    private String animal_feature;
    @Column
    private String animal_age;
    @Column
    private Integer animal_vaccine;
    @Column
    private Integer animal_neuter;
    @Column
    private String animal_area1;
    @Column
    private String animal_area2;
    @Column
    private String context;
    @Column
    private String posts_date;
    @Column
    private String board_id;
    @Column
    private String posts_num;
    @Column
    private String posts_url;

    @Builder
    public PostsEntity(String id, String title, String image, String animal_name, String animal_kinds, String animal_gender, String animal_size, String animal_feature, String animal_age, Integer animal_vaccine, Integer animal_neuter, String animal_area1, String animal_area2, String context, String posts_date, String board_id, String posts_num, String posts_url) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.animal_name = animal_name;
        this.animal_kinds = animal_kinds;
        this.animal_gender = animal_gender;
        this.animal_size = animal_size;
        this.animal_feature = animal_feature;
        this.animal_age = animal_age;
        this.animal_vaccine = animal_vaccine;
        this.animal_neuter = animal_neuter;
        this.animal_area1 = animal_area1;
        this.animal_area2 = animal_area2;
        this.context = context;
        this.posts_date = posts_date;
        this.board_id = board_id;
        this.posts_num = posts_num;
        this.posts_url = posts_url;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", animal_name='" + animal_name + '\'' +
                ", animal_kinds='" + animal_kinds + '\'' +
                ", animal_gender='" + animal_gender + '\'' +
                ", animal_size='" + animal_size + '\'' +
                ", animal_feature='" + animal_feature + '\'' +
                ", animal_age='" + animal_age + '\'' +
                ", animal_vaccine=" + animal_vaccine +
                ", animal_neuter=" + animal_neuter +
                ", animal_area1='" + animal_area1 + '\'' +
                ", animal_area2='" + animal_area2 + '\'' +
                ", context='" + context + '\'' +
                ", posts_date='" + posts_date + '\'' +
                ", board_id='" + board_id + '\'' +
                ", posts_num='" + posts_num + '\'' +
                ", posts_url='" + posts_url + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    //public String getPost_date() {return posts_date;}

    public String getContext() {
        return context;
    }

    public void update(String title, String context){
        this.title = title;
        this.context = context;
    }


}
