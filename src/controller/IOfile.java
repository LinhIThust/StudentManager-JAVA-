/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import static java.util.Collections.list;
import model.Student;

/**
 *
 * @author linh
 */
public class IOfile {
    
    public void writeIfo(ArrayList list , String nameFile){
        try(FileOutputStream of = new FileOutputStream(new File(nameFile))) {
            ObjectOutputStream oof = new ObjectOutputStream(of);
            oof.writeObject(list);
            oof.close();
        } catch (Exception e) {
            System.out.println("Write file Error");
        }
    }
    
    public  ArrayList readIfo(String nameFile ){
        ArrayList list = new ArrayList();
        try(FileInputStream ifs = new FileInputStream(new File(nameFile))) {
            ObjectInputStream ood = new ObjectInputStream(ifs);
            list = (ArrayList) ood.readObject();
            ood.close();
        } catch (Exception e) {
               System.out.println("Read file Error");
        }
        return list;
    }
    
        
    
}


