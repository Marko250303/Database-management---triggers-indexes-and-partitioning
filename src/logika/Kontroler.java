/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logika;

import baza.DBBroker;
import domen.Fakultet;
import domen.StudijskiProgram;
import domen.Univerzitet;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Mare
 */
public class Kontroler {
    private static Kontroler instanca;
    private DBBroker dbb;

    private Kontroler() {
        dbb=new DBBroker();
    }

    public static Kontroler getInstanca() {
        if(instanca==null){
            instanca=new Kontroler();
        }
        
        return instanca;
    }

    public ArrayList<Fakultet> vratiFakultete() {
        return dbb.vratiFakultete();
    }

    public ArrayList<StudijskiProgram> vratiStudijskePrograme() {
        return dbb.vratiStudijskePrograme();
    }
    
    public ArrayList<Univerzitet> vratiUniverzitete(){
        return dbb.vratiUniverzitete();
    }
}
