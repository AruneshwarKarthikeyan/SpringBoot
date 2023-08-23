package com.spring.crudProject.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Database Model Entity
@Entity
@Table(name = "emp_data")
public class crudModel {

    @Id
    @Column(name="emp_id")
    int col1_emp_id;

    @Column(name="emp_name")
    String col2_emp_name;

    @Column(name="emp_age")
    int col3_emp_age;

    @Column(name="emp_gender")
    String col4_emp_gender;

    @Column (name="emp_address")
    String col5_emp_address;

    @Column(name="emp_joindate")
    String col6_emp_joinDate;

    @Column(name="emp_relievedate")
    Date col7_emp_relieveDate;

    @Override
    public String toString(){
        return col1_emp_id+" , "+col2_emp_name+" , "+col3_emp_age+" , "+col4_emp_gender+" , "+col5_emp_address+
                " , "+col6_emp_joinDate+" , "+col7_emp_relieveDate;
    }

    public int getId(){
        return col1_emp_id;
    }
    public void setId(int id){
        this.col1_emp_id=id;
    }

    public String getName(){
        return col2_emp_name;
    }
    public void setName(String name){
        this.col2_emp_name=name;
    }

    public int getAge(){
        return col3_emp_age;
    }
    public void setAge(int age){
        this.col3_emp_age=age;
    }

    public String getGender(){
        return col4_emp_gender;
    }
    public void setGender(String gender){
        this.col4_emp_gender=gender;
    }

    public String getAddress(){
        return col5_emp_address;
    }
    public void setAddress(String address){
        this.col5_emp_address=address;
    }

  
    public String getJoinDate() {
        return col6_emp_joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.col6_emp_joinDate = joinDate;
    }

    public Date getRelieveDate(){
        return col7_emp_relieveDate;
    }
    public void setRelieveDate(Date relieveDate){
        this.col7_emp_relieveDate = relieveDate;
    }

}


