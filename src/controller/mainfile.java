/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Student;

/**
 *
 * 
 * @author linh
 */
public class mainfile {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student sv1 = new Student();
        sv1.setID(1);
        sv1.setName("dong linh");
        sv1.setCla("12a1");
        sv1.setBrithday("7/2");
        sv1.setNumberPhone("099767");
        Student sv2 = new Student();
        sv2.setID(4);
        sv2.setName("aquan dong linh");
        sv2.setCla("12a12");
        sv2.setBrithday("23/1");
        sv2.setNumberPhone("0123679402");
        list.add(sv1);
        list.add(sv2);
        IOfile f1 = new IOfile();
        f1.writeIfo(list, "sinhvien.txt");
    }
    
}
