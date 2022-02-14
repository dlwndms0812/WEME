package com.weme.webservice.Repository;

import com.weme.webservice.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//jpa 에서 제공하는 Repository 인터페이스를 활용
// <> 안에 관리 대상 Entity, 대표값의 타입
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    /*boolean existsByUserID(String id);
    User findByUserID(String id);*/

    //@Query("SELECT * FROM User")

}
