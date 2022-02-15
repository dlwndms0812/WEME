package com.weme.webservice.Repository;

import com.weme.webservice.Entity.PostsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostsRepository extends JpaRepository<PostsEntity, String> {

    @Query("SELECT p FROM PostsEntity p ORDER BY p.id DESC")
    List<PostsEntity> findAllDesc();
}
