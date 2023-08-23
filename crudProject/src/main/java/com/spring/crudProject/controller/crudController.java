package com.spring.crudProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crudProject.model.crudModel;
import com.spring.crudProject.services.crudServiceInterface;

@RestController
public class crudController {

    @Autowired
    crudServiceInterface service;

    // API to add single employee data
    @PostMapping("/postData")
    public String postData(@RequestBody crudModel object){
        service.addEmployee(object);
        return "Employee Data Added";
    }

    // API to add Multiple employee data at once
    @PostMapping("/postDataList")
    public String postDataList(@RequestBody List<crudModel> objects){
        service.addEmployeeList(objects);
        return "Multiple Employee's Data Added";    
    }

    // API to retrive all employee data
    @GetMapping("/getData")
    public List<crudModel> getData(){
        return service.getAllData();
    }

    // API to retrive particular employee data
    @GetMapping("/getDataById/{id}")
    public crudModel getDataById(@PathVariable int id){
        return service.getDataById(id);
    }

    // API to delete particular employee data by id
    @DeleteMapping("/deleteData/{id}")
    public String deleteData(@PathVariable int id){
        service.deleteData(id);
        return "Data of id : "+id+" removed successfully";
    }

    // API to update employee data based on id
    @PutMapping("/updateData")
    public String updateData(@RequestBody crudModel object){
        service.updateData(object);
        return "Data of "+object.getName()+" Updated";
    }

    
}
