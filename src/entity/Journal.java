/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class Journal {
    private Person student;
    private Subject subject;
    private Integer mark;
    private Date date;

    public Journal() {
    }

    public Journal(Person student, Subject sublect, Integer mark, Date date) {
        this.student = student;
        this.subject = sublect;
        this.mark = mark;
        this.date = date;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    public void setSublect(Subject sublect) {
        this.subject = sublect;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person getStudent() {
        return student;
    }

    public Subject getSublect() {
        return subject;
    }

    public Integer getMark() {
        return mark;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String dateStr = sdf.format(date);
        return "Journal{" + "student=" + student.toString()
                + ", sublect=" + subject.toString()
                + ", mark=" + mark
                + ", date=" + dateStr
                + '}';
    }

    
}
