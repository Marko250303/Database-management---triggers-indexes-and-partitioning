/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import domen.Fakultet;
import domen.StudijskiProgram;
import domen.Univerzitet;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mare
 */
public class DBBroker {

    public ArrayList<Fakultet> vratiFakultete() {
        ArrayList<Fakultet> lista=new ArrayList<>();
        
        String upit="SELECT * FROM FAKULTET";
        
        System.out.println(upit);
        
        try {
            Statement s=Konekcija.getInstanca().getKonekcija().createStatement();
            ResultSet rs=s.executeQuery(upit);
            
            while(rs.next()){
                Long sifraFakulteta=rs.getLong("SIFRA_FAKULTETA");
                String nazivFakulteta=rs.getString("NAZIV_FAKULTETA");
                String adresaFakulteta=rs.getString("ADRESA_FAKULTETA");
                Long sifraUniverziteta=rs.getLong("SIFRA_UNIVERZITETA");
                
                Fakultet f=new Fakultet(sifraFakulteta, nazivFakulteta, adresaFakulteta, sifraUniverziteta);
                
                lista.add(f);
            }
            
            rs.close();
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }

    public ArrayList<StudijskiProgram> vratiStudijskePrograme() {
        ArrayList<StudijskiProgram> lista=new ArrayList<>();
        
        String upit="SELECT * FROM STUDIJSKI_PROGRAM";
        
        System.out.println(upit);
        
        try {
            Statement s=Konekcija.getInstanca().getKonekcija().createStatement();
            ResultSet rs=s.executeQuery(upit);
            
            while(rs.next()){
                Long sifraStudijskogPrograma=rs.getLong("SIFRA_SP");
                Long sifraFakulteta=rs.getLong("SIFRA_FAKULTETA");
                String nazivStudijskogPrograma=rs.getString("NAZIV_SP");
                String zvanje=rs.getString("ZVANJE");
                String nazivFakulteta=rs.getString("NAZIV_FAKULTETA");
                
                StudijskiProgram sp=new StudijskiProgram(sifraStudijskogPrograma, sifraFakulteta, nazivStudijskogPrograma, zvanje, nazivFakulteta);
                
                lista.add(sp);
            }
            
            rs.close();
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }

    public ArrayList<Univerzitet> vratiUniverzitete() {
        ArrayList<Univerzitet> lista=new ArrayList<>();
        
        String upit="SELECT * FROM UNIVERZITET";
        
        System.out.println(upit);
        
        try {
            Statement s=Konekcija.getInstanca().getKonekcija().createStatement();
            ResultSet rs=s.executeQuery(upit);
            
            while(rs.next()){
                Long sifraUniverziteta=rs.getLong("SIFRA_UNIVERZITETA");
                String nazivUniverziteta=rs.getString("NAZIV_UNIVERZITETA");
                
                Univerzitet u=new Univerzitet(sifraUniverziteta, nazivUniverziteta);
                
                lista.add(u);
            }
            
            rs.close();
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }

    
    
}
