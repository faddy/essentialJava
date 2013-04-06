package randomTests;

import java.io.*;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    int bitVariable;
    static int staticVariable;
    
    // constructor
    public Employee(String name){
        this.name = name;
    }

    // assign the age
    public void setAge(int age){
        this.age = age;
    }

    // assign the designation
    public void setDesignation(String designation){
    	System.out.println("This is the super class method");
        this.designation = designation;
    }

    // assign salary
    public void setSalary(double salary){
        this.salary = salary;
    }

    // print employee details
    public void printDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + this.salary);
    }

    protected void finalize(){
        System.out.println("The garbage collector was called");
    }

}
