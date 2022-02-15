package com.weme.webservice.Service;

import com.weme.webservice.DTO.*;
import com.weme.webservice.Entity.PostsEntity;
import com.weme.webservice.Repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class newBoardService {

    private final PostsRepository postsRepository;

    //게시글 저장 -> 컬럼 변경 필요(DTO부분)
    /*public PostsEntity saveBoard(postsDto postsfm){
        //게시글을 저장(업로드)
        //DTO를 Entity로 변환
        PostsEntity newpost = postsfm.toEntity();
        System.out.println(newpost.toString());

        //Repository에게 Entity를 DB 안에 저장
        PostsEntity savedPost = postsRepository.save(newpost);
        //System.out.println(savedPost.toString());

        return savedPost;
    }*/

    @Transactional
    public String save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public String update(String id, PostsUpdateRequestDto requestDto){

        PostsEntity posts = postsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("해당게시글이 없습니다. id="+id));
        posts.update(requestDto.getTitle(), requestDto.getContext());

        return id;
    }

    @Transactional
    public PostsResponseDto findById(String id){
        PostsEntity entity = postsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("해당 게시글이 없습니다. id="+id));

        return new PostsResponseDto(entity);
    }

    //게시글 목록 보기
    @Transactional //(readOnly = true)
    public List<PostsListResponseDto> findAllDesc() {
        return postsRepository.findAllDesc().stream()
                .map(PostsListResponseDto::new)
                .collect(Collectors.toList());
    }

    //게시글 삭제
    /*@Transactional
    public void delete(String id){
        PostsEntity posts = postsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("해당게시글이 없습니다. id=" + id));
        postsRepository.delete(posts);
    }*/

}
