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
public class Accouts implements giaotiep, Serializable {

    private String name;
    private String user;
    private String pasW;
    private String gmail;
    private String Bri;

    public Accouts(String name, String gmail, String user, String pasW, String Bri) {
        this.name = name;
        this.user = user;
        this.pasW = pasW;
        this.gmail = gmail;
        this.Bri = Bri;
    }

    public Accouts() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasW() {
        return pasW;
    }

    public void setPasW(String pasW) {
        this.pasW = pasW;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getBri() {
        return Bri;
    }

    public void setBri(String Bri) {
        this.Bri = Bri;
    }

    @Override
    public Object[] toObjects() {
        return new Object[]{
            this.getName(), this.getGmail(), this.getUser(), this.getPasW(), this.getBri() //To change body of generated methods, choose Tools | Templates.
        };
    }
}
