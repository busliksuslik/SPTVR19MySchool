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
public class Subject {
    private String name;
    private Integer duration;
    private Person teacher;

    public Subject() {
    }

    public Subject(String name, Integer duration, Person person) {
        this.name = name;
        this.duration = duration;
        this.teacher = person;
    }

    public String getName() {
        return name;
    }

    public Integer getDuration() {
        return duration;
    }

    public Person getPerson() {
        return teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setPerson(Person person) {
        this.teacher = person;
    }

    @Override
    public String toString() {
        return "Subject{" + "name=" + name + ", duration=" + duration + ", person=" + teacher.toString() + '}';
    }
    
}
