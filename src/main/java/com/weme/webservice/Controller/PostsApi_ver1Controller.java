package com.weme.webservice.Controller;

import com.weme.webservice.DTO.PostsListResponseDto;
import com.weme.webservice.DTO.PostsResponseDto;
import com.weme.webservice.DTO.PostsSaveRequestDto;
import com.weme.webservice.DTO.PostsUpdateRequestDto;
import com.weme.webservice.Service.newBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//임시보호(임보자 구하는 카테고리) - 게시글 작성하는 페이지(저장)
@RequiredArgsConstructor
@RestController
public class PostsApi_ver1Controller {

    private final newBoardService newBoardservice;

    //rest Api -> 등록 기능
    @PostMapping("/protection/{id}/posts")
    public String save(@RequestBody PostsSaveRequestDto requestDto){
        return newBoardservice.save(requestDto);
    }

    //rest Api -> 수정 기능
    @PutMapping("/protection/{id}/posts/{posts_num}")
    public String update(@PathVariable String id, @RequestBody PostsUpdateRequestDto requestDto) {
        return newBoardservice.update(id, requestDto);
    }

    //rest Api -> 조회
    @GetMapping("/protection")
    public PostsResponseDto findById(@PathVariable String id){return newBoardservice.findById(id);}

    //rest Api -> 목록 기능
    @GetMapping("/protection/{posts_num}")
    public List<PostsListResponseDto> findAll() {
        return newBoardservice.findAllDesc();
    }

    //게시글 삭제 -> Api 만들어야함
    /*@DeleteMapping("/api/v1/posts/{id}")
    public String delete(@PathVariable String id){
        newBoardservice.delete(id);
        return id;
    }*/
}
