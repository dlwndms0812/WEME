package com.weme.webservice.api;

import com.weme.webservice.domain.Animal;
import com.weme.webservice.domain.AnimalRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
//@RequiredArgsConstructor
public class APIService {

    @Autowired
    private AnimalRepository animalRepository;

    public APIService(AnimalRepository animalRepository){

        this.animalRepository=animalRepository;
    }

    public APIService(){

    }
    //jsonData를 JSONParser를 통해 분해
    @Transactional
    public JSONObject init(String jsonData) {
        //결과값 저장
        JSONObject jObj=null;
        Animal animal=new Animal();
        try {

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonData);
            JSONObject parseResponse=(JSONObject) jsonObject.get("response");
            JSONObject parseBody=(JSONObject) parseResponse.get("body");
            JSONObject item=(JSONObject) parseBody.get("items");
            JSONArray array=(JSONArray) item.get("item");


            for(int i=0;i< array.size();i++) {
                jObj = (JSONObject) array.get(i);

                animal = Animal.builder()
                        .age(jObj.get("age").toString())
                        .careAddr(jObj.get("careAddr").toString())
                        .careNm(jObj.get("careNm").toString())
                        .careTel(jObj.get("careTel").toString())
                        .chargeNm(jObj.get("chargeNm").toString())
                        .colorCd(jObj.get("colorCd").toString())
                        .desertionNo(jObj.get("desertionNo").toString())
                        .filename(jObj.get("filename").toString())
                        .happenDt(Integer.parseInt(jObj.get("happenDt").toString()))
                        .happenPlace(jObj.get("happenPlace").toString())
                        .kindCd(jObj.get("kindCd").toString())
                        .neuterYn(jObj.get("neuterYn").toString())
                        .noticeEdt(Integer.parseInt(jObj.get("noticeEdt").toString()))
                        .noticeNo(jObj.get("noticeNo").toString())
                        .noticeSdt(Integer.parseInt(jObj.get("noticeSdt").toString()))
                        .officetel(jObj.get("officetel").toString())
                        .orgNm(jObj.get("orgNm").toString())
                        .popfile(jObj.get("popfile").toString())
                        .processState(jObj.get("processState").toString())
                        .sexCd(jObj.get("sexCd").toString())
                        .specialMark(jObj.get("specialMark").toString())
                        .weight(jObj.get("weight").toString())
                        .build();


                animalRepository.save(animal); //이부분 null 오류
            }
        } catch (JSONException e){
            System.out.println(e.getMessage());
        }catch (ParseException ee){
            System.out.println(ee.getMessage());
        } catch (NullPointerException eee){
            System.out.println((eee.getMessage()));
        }
        return jObj;
    }

}
