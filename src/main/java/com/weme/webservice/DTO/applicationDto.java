package com.weme.webservice.DTO;

import com.weme.webservice.Entity.ApplicationEntity;
import lombok.Builder;

public class applicationDto {

    private Integer posts_num;
    private Integer apply_agree;
    private String apply_name;
    private String apply_birth;
    private Integer apply_gender;
    private String apply_phone;
    private String apply_email;
    private String apply_time;
    private String apply_address;
    private String apply_job;
    private String apply_one;
    private String apply_two;
    private String apply_three;
    private Integer apply_four;
    private Integer apply_five;
    private String apply_six;
    private String apply_seven;
    private String apply_eight;
    private Integer apply_nine;
    private String apply_nine_1;
    private String apply_ten;
    private String apply_eleven;
    private String apply_twelve;
    private String apply_thirteen;
    private Integer apply_fourteen;
    private Integer apply_fifteen;
    private String apply_sixteen;
    private String apply_date;
    private Integer apply_num;
    private String apply_url;

    @Builder
    public applicationDto(Integer posts_num, Integer apply_agree, String apply_name, String apply_birth, Integer apply_gender, String apply_phone, String apply_email, String apply_time, String apply_address, String apply_job, String apply_one, String apply_two, String apply_three, Integer apply_four, Integer apply_five, String apply_six, String apply_seven, String apply_eight, Integer apply_nine, String apply_nine_1, String apply_ten, String apply_eleven, String apply_twelve, String apply_thirteen, Integer apply_fourteen, Integer apply_fifteen, String apply_sixteen, String apply_date, Integer apply_num, String apply_url) {
        this.posts_num = posts_num;
        this.apply_agree = apply_agree;
        this.apply_name = apply_name;
        this.apply_birth = apply_birth;
        this.apply_gender = apply_gender;
        this.apply_phone = apply_phone;
        this.apply_email = apply_email;
        this.apply_time = apply_time;
        this.apply_address = apply_address;
        this.apply_job = apply_job;
        this.apply_one = apply_one;
        this.apply_two = apply_two;
        this.apply_three = apply_three;
        this.apply_four = apply_four;
        this.apply_five = apply_five;
        this.apply_six = apply_six;
        this.apply_seven = apply_seven;
        this.apply_eight = apply_eight;
        this.apply_nine = apply_nine;
        this.apply_nine_1 = apply_nine_1;
        this.apply_ten = apply_ten;
        this.apply_eleven = apply_eleven;
        this.apply_twelve = apply_twelve;
        this.apply_thirteen = apply_thirteen;
        this.apply_fourteen = apply_fourteen;
        this.apply_fifteen = apply_fifteen;
        this.apply_sixteen = apply_sixteen;
        this.apply_date = apply_date;
        this.apply_num = apply_num;
        this.apply_url = apply_url;
    }

    @Override
    public String toString() {
        return "applicationform{" +
                "posts_num=" + posts_num +
                ", apply_agree=" + apply_agree +
                ", apply_name='" + apply_name + '\'' +
                ", apply_birth='" + apply_birth + '\'' +
                ", apply_gender=" + apply_gender +
                ", apply_phone='" + apply_phone + '\'' +
                ", apply_email='" + apply_email + '\'' +
                ", apply_time='" + apply_time + '\'' +
                ", apply_address='" + apply_address + '\'' +
                ", apply_job='" + apply_job + '\'' +
                ", apply_one='" + apply_one + '\'' +
                ", apply_two='" + apply_two + '\'' +
                ", apply_three='" + apply_three + '\'' +
                ", apply_four=" + apply_four +
                ", apply_five=" + apply_five +
                ", apply_six='" + apply_six + '\'' +
                ", apply_seven='" + apply_seven + '\'' +
                ", apply_eight='" + apply_eight + '\'' +
                ", apply_nine=" + apply_nine +
                ", apply_nine_1='" + apply_nine_1 + '\'' +
                ", apply_ten='" + apply_ten + '\'' +
                ", apply_eleven='" + apply_eleven + '\'' +
                ", apply_twelve='" + apply_twelve + '\'' +
                ", apply_thirteen='" + apply_thirteen + '\'' +
                ", apply_fourteen=" + apply_fourteen +
                ", apply_fifteen=" + apply_fifteen +
                ", apply_sixteen='" + apply_sixteen + '\'' +
                ", apply_date='" + apply_date + '\'' +
                ", apply_num=" + apply_num +
                ", apply_url='" + apply_url + '\'' +
                '}';
    }

    public ApplicationEntity toentity(){
        return ApplicationEntity.builder()
                .posts_num(posts_num)
                .apply_agree(apply_agree)
                .apply_name(apply_name)
                .apply_birth(apply_birth)
                .apply_gender(apply_gender)
                .apply_phone(apply_phone)
                .apply_email(apply_email)
                .apply_time(apply_time)
                .apply_address(apply_address)
                .apply_job(apply_job)
                .apply_one(apply_one)
                .apply_two(apply_two)
                .apply_three(apply_three)
                .apply_four(apply_four)
                .apply_five(apply_five)
                .apply_six(apply_six)
                .apply_seven(apply_seven)
                .apply_eight(apply_eight)
                .apply_nine(apply_nine)
                .apply_nine_1(apply_nine_1)
                .apply_ten(apply_ten)
                .apply_eleven(apply_eleven)
                .apply_twelve(apply_twelve)
                .apply_thirteen(apply_thirteen)
                .apply_fourteen(apply_fourteen)
                .apply_fifteen(apply_fifteen)
                .apply_sixteen(apply_sixteen)
                .apply_date(apply_date)
                .apply_num(apply_num)
                .apply_url(apply_url)
                .build();
    }
}
