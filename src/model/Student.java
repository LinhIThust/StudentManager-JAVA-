/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.giaotiep;
import java.io.Serializable;

/**
 *
 * @author linh
 */
public class Student implements Serializable, giaotiep {

    private int ID;
    private String name;
    private String cla;
    private String brithday;
    private String numberPhone;

    public Student() {
    }

    public Student(int ID, String name, String cla, String brithday, String numberPhone) {
        this.ID = ID;
        this.name = name;
        this.cla = cla;
        this.brithday = brithday;
        this.numberPhone = numberPhone;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    @Override
    public Object[] toObjects() {
        return new Object[]{
            this.getID(), this.getName(), this.getCla(), this.getBrithday(),this.numberPhone
        };
    }
    
}
