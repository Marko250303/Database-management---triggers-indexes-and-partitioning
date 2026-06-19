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
public class UplatnicaDetalji {
    private Long sifraUplatnice;
    private Long sifraPlacanja;
    private String pozivNaBroj;
    private String mestoPrijema;
    private Date datumPrijema;

    public UplatnicaDetalji() {
    }

    public UplatnicaDetalji(Long sifraUplatnice, Long sifraPlacanja, String pozivNaBroj, String mestoPrijema, Date datumPrijema) {
        this.sifraUplatnice = sifraUplatnice;
        this.sifraPlacanja = sifraPlacanja;
        this.pozivNaBroj = pozivNaBroj;
        this.mestoPrijema = mestoPrijema;
        this.datumPrijema = datumPrijema;
    }

    public Date getDatumPrijema() {
        return datumPrijema;
    }

    public void setDatumPrijema(Date datumPrijema) {
        this.datumPrijema = datumPrijema;
    }

    public Long getSifraUplatnice() {
        return sifraUplatnice;
    }

    public void setSifraUplatnice(Long sifraUplatnice) {
        this.sifraUplatnice = sifraUplatnice;
    }

    public Long getSifraPlacanja() {
        return sifraPlacanja;
    }

    public void setSifraPlacanja(Long sifraPlacanja) {
        this.sifraPlacanja = sifraPlacanja;
    }

    public String getPozivNaBroj() {
        return pozivNaBroj;
    }

    public void setPozivNaBroj(String pozivNaBroj) {
        this.pozivNaBroj = pozivNaBroj;
    }

    public String getMestoPrijema() {
        return mestoPrijema;
    }

    public void setMestoPrijema(String mestoPrijema) {
        this.mestoPrijema = mestoPrijema;
    }

    @Override
    public String toString() {
        return sifraUplatnice + " " + pozivNaBroj + " " + datumPrijema;
    }
}