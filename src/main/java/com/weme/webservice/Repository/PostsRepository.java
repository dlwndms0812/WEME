package com.weme.webservice.Repository;

import com.weme.webservice.Entity.Posts;
import org.springframework.data.repository.CrudRepository;

public interface PostsRepository extends CrudRepository<Posts, String> {
}
