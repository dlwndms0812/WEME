package com.weme.webservice.api;

import com.weme.webservice.api.APIService;
import com.weme.webservice.domain.AnimalRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.json.XML;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@RestController
public class APIController {

    @Autowired
    APIService apiService=new APIService();

    @Autowired
    private AnimalRepository animalRepository;

    //보호소 동물 정보
    @GetMapping("/animalapi")
    public String callanimalapi(){
        StringBuffer result=new StringBuffer();
        String jsonPrintString=null;

        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyyMMdd");
        String formatedNow=now.format(formatter);
        String formatedEnd=Integer.toString(Integer.parseInt(formatedNow)+7);

        try{
            String start= formatedNow; //검색 시작날짜
            String end=formatedEnd; //검색 마지막 날짜
            String urlstr="http://openapi.animal.go.kr/openapi/service/rest/abandonmentPublicSrvc/abandonmentPublic?bgnde="+
                    start+"&endde="+end+"&pageNo=1&numOfRows=10&ServiceKey="
            +"ia5tvugbDgT2IDf9oME4OPwXUuN252wpqS8vJi%2Bk922X37kOZ25EXBAbW6ayJKT2z0teNaVglVRbDoHXLQk1kw%3D%3D";

            URL url=new URL(urlstr);
            HttpURLConnection urlConnection=(HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");

            BufferedReader br;
            br=new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF-8"));

            String returnLine;

            while((returnLine= br.readLine())!=null){
                result.append(returnLine+"\n\r");
            }


            //xml-> json 변환
            JSONObject jsonObject=XML.toJSONObject(result.toString());
            jsonPrintString=jsonObject.toString();

            apiService.init(jsonPrintString);

            urlConnection.disconnect();
        }catch (Exception e){
            e.printStackTrace();
        }
        return jsonPrintString;
    }

}
