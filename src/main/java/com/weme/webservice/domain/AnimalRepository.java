package com.weme.webservice.domain;

import com.weme.webservice.domain.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Animal 저장
@Repository
@Transactional(readOnly = true)
public interface AnimalRepository extends JpaRepository<Animal, String>  {
}