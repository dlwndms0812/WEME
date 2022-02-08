package com.weme.webservice.api;

import com.weme.webservice.domain.AnimalRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.json.XML;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


@RequiredArgsConstructor
@RestController
@Data
public class APIController {
    //private APIService apiService;


    //보호소 동물 정보
    @GetMapping("/animalapi")
    public String callanimalapi(){
        StringBuffer result=new StringBuffer();
        String jsonPrintString=null;
        try{
            String start="20220201";
            String end="20220208";
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

            //?
            //apiService.init(jsonPrintString);

            urlConnection.disconnect();
        }catch (Exception e){
            e.printStackTrace();
        }
        return jsonPrintString;
    }

}
