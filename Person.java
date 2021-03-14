   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Person {
    private String name;
    private int age;
    private String address;
    
    public Person (String name,int age,String address){
        this.name = name;
        this.age =  age;
        this.address = address;
    }
    
    public void info(){
        System.out.println("Name    : "+this.name);
        System.out.println("Age     : "+this.age);
        System.out.println("Address : "+this.address);
    }    
}
