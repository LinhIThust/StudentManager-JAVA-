/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.giaotiep;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author linh
 */
public class Acctions implements giaotiep,Serializable{
    private String nameAcctions;
    private int pointAcctios;
    private String idAcctions;
    private String Request;
    private String timeA;
    private String Addres;

    public Acctions(String nameAcctions, String idAcctions, int pointAcctios, String Request, String timeA, String Addres) {
        this.nameAcctions = nameAcctions;
        this.pointAcctios = pointAcctios;
        this.idAcctions = idAcctions;
        this.Request = Request;
        this.timeA = timeA;
        this.Addres = Addres;
    }

    public String getRequest() {
        return Request;
    }

    public void setRequest(String Request) {
        this.Request = Request;
    }

    public String getTimeA() {
        return timeA;
    }

    public void setTimeA(String timeA) {
        this.timeA = timeA;
    }

    public String getAddres() {
        return Addres;
    }

    public void setAddres(String Addres) {
        this.Addres = Addres;
    }
    private ArrayList<Student> sv;

    public ArrayList<Student> getSv() {
        return sv;
    }

    public void setSv(ArrayList<Student> sv) {
        this.sv = sv;
    }

    public Acctions() {
    }

    public Acctions(String nameAcctions, int pointAcctios, String idAcctions) {
        this.nameAcctions = nameAcctions;
        this.pointAcctios = pointAcctios;
        this.idAcctions = idAcctions;
    }

    public String getNameAcctions() {
        return nameAcctions;
    }

    public void setNameAcctions(String nameAcctions) {
        this.nameAcctions = nameAcctions;
    }

    public int getPointAcctios() {
        return pointAcctios;
    }

    public void setPointAcctios(int pointAcctios) {
        this.pointAcctios = pointAcctios;
    }

    public String getIdAcctions() {
        return idAcctions;
    }

    public void setIdAcctions(String idAcctions) {
        this.idAcctions = idAcctions;
    }

    @Override
    public Object[] toObjects() {
    return new Object[]{
            this.getIdAcctions(), this.getNameAcctions(), this.getPointAcctios()
        };
    }
    
}
