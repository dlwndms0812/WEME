package com.weme.webservice.DTO;

import com.weme.webservice.Entity.Posts;
import lombok.Builder;
import lombok.Getter;

@Getter
public class postsform {

    private String id;
    private String title;
    private String image;
    private String animal_name;
    private String animal_kinds;
    private String animal_gender;
    private String animal_size;
    private String animal_feature;
    private String animal_age;
    private Integer animal_vaccine;
    private Integer animal_neuter;
    private String animal_area1;
    private String animal_area2;
    private String context;
    private String posts_date;
    private String board_id;
    private String posts_num;
    private String posts_url;

    @Builder
    public postsform(String id, String title, String image, String animal_name, String animal_kinds, String animal_gender, String animal_size, String animal_feature, String animal_age, Integer animal_vaccine, Integer animal_neuter, String animal_area1, String animal_area2, String context, String posts_date, String board_id, String posts_num, String posts_url) {
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
        return "postsform{" +
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

    public Posts toEntity() {
        return Posts.builder()
                .id(id)
                .title(title)
                .image(image)
                .animal_name(animal_name)
                .animal_kinds(animal_kinds)
                .animal_gender(animal_gender)
                .animal_size(animal_size)
                .animal_feature(animal_feature)
                .animal_age(animal_age)
                .animal_vaccine(animal_vaccine)
                .animal_neuter(animal_neuter)
                .animal_area1(animal_area1)
                .animal_area2(animal_area2)
                .context(context)
                .posts_date(posts_date)
                .board_id(board_id)
                .posts_num(posts_num)
                .posts_url(posts_url)
                .build();
    }
}
