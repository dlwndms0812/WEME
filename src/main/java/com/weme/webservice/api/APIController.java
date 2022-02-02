package com.weme.webservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//참고:https://vmpo.tistory.com/33

@RestController
public class APIController {

    //보호소 동물 정보
    @GetMapping("/animalapi")
    public String callanimalapi(){
        StringBuffer result=new StringBuffer();
        try{
            String urlstr="http://openapi.animal.go.kr/openapi/service/rest/abandonmentPublicSrvc/abandonmentPublic?bgnde=20140301&endde=20140430&pageNo=1&numOfRows=10&ServiceKey="
            +"ia5tvugbDgT2IDf9oME4OPwXUuN252wpqS8vJi+k922X37kOZ25EXBAbW6ayJKT2z0teNaVglVRbDoHXLQk1kw==";

            URL url=new URL(urlstr);
            HttpURLConnection urlConnection=(HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");

            BufferedReader br;
            br=new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF-8"));

            String returnLine;
            result.append("<xmp>");

            while((returnLine= br.readLine())!=null){
                result.append(returnLine+"\n\r");
            }
            urlConnection.disconnect();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result+"</xmp>";
    }

}
