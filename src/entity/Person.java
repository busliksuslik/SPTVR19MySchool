/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author user
 */
public class Person {
    private String name;
    private String secName;
    private String phone;
    private String role; 

    public Person() {
    }

    public Person(String name, String secName, String phone, String role) {
        this.name = name;
        this.secName = secName;
        this.phone = phone;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getSecName() {
        return secName;
    }

    public String getPhone() {
        return phone;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
}
