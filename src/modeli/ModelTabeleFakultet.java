/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeli;

import domen.Fakultet;
import forme.Frm2NF;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import logika.Kontroler;

/**
 *
 * @author Mare
 */
public class ModelTabeleFakultet extends AbstractTableModel{
    
    private Frm2NF frm2nf;
    private ArrayList<Fakultet> fakulteti;
    private String[] kolone={"SIFRA FAKULTETA","NAZIV","ADRESA","SIFRA UNIVERZITETA"};

    public ModelTabeleFakultet(Frm2NF frm2nf) {
        this.frm2nf = frm2nf;
        fakulteti=Kontroler.getInstanca().vratiFakultete();
    }

    @Override
    public int getRowCount() {
        return fakulteti.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Fakultet fakultet=fakulteti.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return fakultet.getSifraFakulteta();
            
            case 1:
               return fakultet.getNazivFakulteta();
               
            case 2:
                return fakultet.getAdresaFakulteta();
            
            case 3:
                return fakultet.getSifraUniverziteta();
           
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
    public Fakultet vratiFakultet(int red){
        return fakulteti.get(red);
    }
    
    public void obrisi(Fakultet zaBrisanje){
        fakulteti.remove(zaBrisanje);
    }
}