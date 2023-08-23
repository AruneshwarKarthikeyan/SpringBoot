package com.spring.crudProject.services;

import java.util.List;

import com.spring.crudProject.model.crudModel;

//Method signature's interface
public interface crudServiceInterface {

    public crudModel addEmployee(crudModel object);

    public List<crudModel> addEmployeeList(List<crudModel> objects);

    public List<crudModel> getAllData();

    public crudModel getDataById(int id);

    public void deleteData(int id);

    public crudModel updateData(crudModel object);

}
