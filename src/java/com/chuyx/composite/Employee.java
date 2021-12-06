package com.chuyx.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuxiang.chu
 * @date 2021/12/6 16:05
 **/
public class Employee {

    private String name;

    private String dept;

    private int salary;

    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    /**
     * 下属员工集合
     */
    private List<Employee> subordinates;

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
