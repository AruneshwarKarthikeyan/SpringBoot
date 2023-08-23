package com.spring.crudProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crudProject.Repository.crudRepository;
import com.spring.crudProject.model.crudModel;

//Overrided methods which return's the object
@Service
public class crudService implements crudServiceInterface {

    @Autowired
    private crudRepository repository;

    //insert's single employee data
    @Override
    public crudModel addEmployee(crudModel object){
        return repository.save(object);
    }

    //insert's multiple employee data
    @Override
    public List<crudModel> addEmployeeList(List<crudModel> objects){
        return (List<crudModel>) repository.saveAll(objects);
    }

    //retrieve all employee data
    @Override
    public List<crudModel> getAllData(){
        return (List<crudModel>) repository.findAll();
    }

    //retrieve particular employee data based on id
    @Override
    public crudModel getDataById(int id){
        return repository.findById(id).orElse(null);
    }

    //delete particular employee data based on id
    @Override
    public void deleteData(int id){
        repository.deleteById(id);
    }

    //update employee's data 
    @Override
    public crudModel updateData(crudModel object){
        crudModel existingObject = repository.findById(object.getId()).orElse(null);
        existingObject.setName(object.getName());
        existingObject.setAge(object.getAge());
        existingObject.setGender(object.getGender());
        existingObject.setAddress(object.getAddress());
        existingObject.setJoinDate(object.getJoinDate());
        existingObject.setRelieveDate(object.getRelieveDate());
        return repository.save(existingObject);
    }
}
