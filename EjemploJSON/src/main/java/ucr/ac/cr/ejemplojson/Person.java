/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.ejemplojson;

/**
 *
 * @author Usuario
 */
public class Person {
    private String id;
    private String name;
    private double weight;
    private int age;

    public Person(String id, String name, double weight, int age) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    
    public Person() {
        this.id = "";
        this.name = "";
        this.weight = 0.0;
        this.age = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: \n" + " id= " + id + ", \nname= " + name + ", \nweight= " + weight + ", \nage=" + age;
    }
    
    
    
    
}
