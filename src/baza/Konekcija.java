/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mare
 */
public class Konekcija {
    private static Konekcija instanca;
    private Connection konekcija;

    public Konekcija() {
        try {
            String url="jdbc:oracle:thin:@//localhost:1521/FREEPDB1";
            String username="APP_USER";
            String password="NovaLozinka123";
            
            konekcija=DriverManager.getConnection(url, username, password);
            konekcija.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(Konekcija.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Konekcija getInstanca() {
        if(instanca==null){
            instanca=new Konekcija();
        }
        
        return instanca;
    }

    public Connection getKonekcija() {
        return konekcija;
    }
}
