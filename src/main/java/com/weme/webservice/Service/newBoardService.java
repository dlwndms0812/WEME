package com.weme.webservice.Service;

import com.weme.webservice.DTO.postsListPesponseDto;
import com.weme.webservice.DTO.postsform;
import com.weme.webservice.Entity.Posts;
import com.weme.webservice.Repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class newBoardService {

    @Autowired
    private PostsRepository postsRepository;

    //게시글 저장 -> 컬럼 변경 필요(DTO부분)
    public Posts saveBoard(postsform postsfm){
        //게시글을 저장(업로드)
        //DTO를 Entity로 변환
        Posts newpost = postsfm.toEntity();
        System.out.println(newpost.toString());

        //Repository에게 Entity를 DB 안에 저장
        Posts savedPost = postsRepository.save(newpost);
        //System.out.println(savedPost.toString());

        return savedPost;
    }

    //게시글 목록 보기
    @Transactional //(readOnly = true)
    public List<postsListPesponseDto> findAllDesc() {
        return postsRepository.findAllDesc().stream()
                .map(postsListPesponseDto::new)
                .collect(Collectors.toList());
    }

    //게시글 삭제
    @Transactional
    public void delete(String id){
        Posts posts = postsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("해당게시글이 없습니다. id=" + id));
        postsRepository.delete(posts);
    }

}
