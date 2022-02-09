package com.weme.webservice.domain;


import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Entity
@NoArgsConstructor
public class Animal {

    //나이
    private String age;

    //보호장소
    @Column(columnDefinition = "TEXT", nullable = false)
    private String careAddr;

    //보호소명
    private String careNm;

    //보호소 전화번호
    private String careTel;

    //보호 담당자
    private String chargeNm;

    //색
    private String colorCd;

    //유기번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String desertionNo;

    //썸네일 이미지
    @Column(columnDefinition = "TEXT", nullable = false)
    private String filename;

    //접수일
    private Integer happenDt;

    //발견장소
    @Column(columnDefinition = "TEXT", nullable = false)
    private String happenPlace;

    //품종
    private String kindCd;

    //중성화 여부
    private String neuterYn;

    //공고 마감일
    private Integer noticeEdt;

    //공고 번호
    @Column(columnDefinition = "TEXT", nullable = false)
    private String noticeNo;

    //공고시작일
    private Integer noticeSdt;

    //전화번호
    private String officetel;

    //시도
    private String orgNm;

    //이미지
    @Column(columnDefinition = "TEXT", nullable = false)
    private String popfile;

    //상태
    private String processState;

    //성별
    private String sexCd;

    //특징
    @Column(columnDefinition = "TEXT", nullable = false)
    private String specialMark;

    //체중
    private String weight;

    @Builder
    public Animal(String age, String careAddr, String careNm, String careTel, String chargeNm, String colorCd,
                  String desertionNo, String filename, Integer happenDt, String happenPlace,
                  String kindCd, String neuterYn, Integer noticeEdt, String noticeNo, Integer noticeSdt,
                  String officetel, String orgNm, String popfile, String processState, String sexCd,
                  String specialMark, String weight) {
        this.age = age;
        this.careAddr=careAddr;
        this.careNm=careNm;
        this.careTel=careTel;
        this.chargeNm=chargeNm;
        this.colorCd=colorCd;
        this.desertionNo=desertionNo;
        this.filename=filename;
        this.happenDt=happenDt;
        this.happenPlace=happenPlace;
        this.kindCd=kindCd;
        this.neuterYn=neuterYn;
        this.noticeEdt=noticeEdt;
        this.noticeNo=noticeNo;
        this.noticeSdt=noticeSdt;
        this.officetel=officetel;
        this.orgNm=orgNm;
        this.popfile=popfile;
        this.processState=processState;
        this.sexCd=sexCd;
        this.specialMark=specialMark;
        this.weight=weight;
    }

}