package com.weme.webservice.Repository;

import com.weme.webservice.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

//jpa 에서 제공하는 Repository 인터페이스를 활용
// <> 안에 관리 대상 Entity, 대표값의 타입
public interface UserRepository extends JpaRepository<User, String> {
    /*boolean existsByUserID(String id);
    User findByUserID(String id);*/

    //@Query("SELECT * FROM User")

}
