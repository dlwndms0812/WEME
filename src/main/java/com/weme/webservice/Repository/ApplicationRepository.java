package com.weme.webservice.Repository;

import com.weme.webservice.Entity.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<ApplicationEntity, Integer> {
}
