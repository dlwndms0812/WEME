package com.weme.webservice.api;

import com.weme.webservice.domain.Animal;
import com.weme.webservice.domain.AnimalRepository;
import lombok.RequiredArgsConstructor;
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



@Service
public class APIService {

    private final AnimalRepository animalRepository;

    @Autowired
    public APIService(AnimalRepository animalRepository){
        this.animalRepository=animalRepository;
    }

    //jsonData를 JSONParser를 통해 분해
   public void init(String jsonData) {

        try {
            JSONObject jObj;
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonData);
            JSONObject parseResponse=(JSONObject) jsonObject.get("response");
            JSONObject parseBody=(JSONObject) parseResponse.get("body");
            JSONArray array=(JSONArray) parseBody.get("items");

            for(int i=0;i< array.size();i++){
                jObj=(JSONObject) array.get(i);


                Animal animal= Animal.builder()
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

                animalRepository.save(animal);
            }

        } catch (JSONException e){
            System.out.println(e.getMessage());
        }catch (ParseException ee){
            System.out.println(ee.getMessage());
        }


    }

}
