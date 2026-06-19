/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.util.Date;

/**
 *
 * @author Mare
 */
public class PotvrdaOPrijavi {
    private Long brojPrijave;
    private Date datumPrijave;

    public PotvrdaOPrijavi() {
    }

    public PotvrdaOPrijavi(Long brojPrijave, Date datumPrijave) {
        this.brojPrijave = brojPrijave;
        this.datumPrijave = datumPrijave;
    }

    public Date getDatumPrijave() {
        return datumPrijave;
    }

    public void setDatumPrijave(Date datumPrijave) {
        this.datumPrijave = datumPrijave;
    }

    public Long getBrojPrijave() {
        return brojPrijave;
    }

    public void setBrojPrijave(Long brojPrijave) {
        this.brojPrijave = brojPrijave;
    }

    @Override
    public String toString() {
        return brojPrijave + " " + datumPrijave;
    }
}