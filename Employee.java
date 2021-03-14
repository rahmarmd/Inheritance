/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Employee extends Person{
    private String EmployeeNumber;
            
    public Employee(String EmployeeNumber, String name, int age, String address){
        super(name,age,address);
        this.EmployeeNumber = EmployeeNumber;
    }   
    
    public void info(){
        System.out.println("Employee Number : "+this.EmployeeNumber);
        super.info();
    
}
}
