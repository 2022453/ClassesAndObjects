/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesandobjects;

/**
 *
 * @author paulooliveira
 */
public class Person {
    
    private String fname;
    private String lname;
    private int age; 
    private double height;
    private double weight;
    

    public Person(String fname, String lname, int age, double height, double weight) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" + "fname=" + fname + ", lname=" + lname + ", age=" + age + ", height=" + height + ", weight=" + weight + '}';
    }
    
    
    
}
