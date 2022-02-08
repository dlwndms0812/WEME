package com.weme.webservice.domain;

import com.weme.webservice.domain.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//Animal 저장
@Repository
public interface AnimalRepository extends JpaRepository<Animal, String>  {
}