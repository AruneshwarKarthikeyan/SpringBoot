package com.spring.crudProject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.crudProject.model.crudModel;

@Repository
public interface crudRepository extends CrudRepository<crudModel,Integer>{

   /* 
    This Repository provides the basic crud operations like 
        create
        read
        update
        delete 
    */


}