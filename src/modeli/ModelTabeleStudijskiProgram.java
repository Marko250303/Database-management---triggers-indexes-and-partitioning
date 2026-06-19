/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeli;

import domen.Fakultet;
import domen.StudijskiProgram;
import forme.Frm2NF;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import logika.Kontroler;

/**
 *
 * @author Mare
 */
public class ModelTabeleStudijskiProgram extends AbstractTableModel{
    
    private Frm2NF frm2nf;
    private ArrayList<StudijskiProgram> studijskiProgrami;
    private String[] kolone={"SIFRA SP","SIFRA FAKULTETA","NAZIV SP","ZVANJE","NAZIV FAKULTETA"};

    public ModelTabeleStudijskiProgram(Frm2NF frm2nf) {
        this.frm2nf = frm2nf;
        studijskiProgrami=Kontroler.getInstanca().vratiStudijskePrograme();
    }

    @Override
    public int getRowCount() {
        return studijskiProgrami.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StudijskiProgram studijskiProgram=studijskiProgrami.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return studijskiProgram.getSifraStudijskogPrograma();
            
            case 1:
               return studijskiProgram.getSifraFakulteta();
               
            case 2:
                return studijskiProgram.getNazivStudijskogPrograma();
            
            case 3:
                return studijskiProgram.getZvanje();
            
            case 4:
                return studijskiProgram.getNazivFakulteta();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
    public StudijskiProgram vratiStudijskePrograme(int red){
        return studijskiProgrami.get(red);
    }
    
    public void obrisi(StudijskiProgram zaBrisanje){
        studijskiProgrami.remove(zaBrisanje);
    }
}