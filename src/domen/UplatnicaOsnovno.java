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
public class UplatnicaOsnovno {
    private Long sifraUplatnice;
    private int iznosUplate;
    private Date datumIzvrsenja;
    private Long sifraLicaPlatilac;
    private Long sifraLicaPrimalac;
    private Long sifraValute;

    public UplatnicaOsnovno() {
    }

    public UplatnicaOsnovno(Long sifraUplatnice, int iznosUplate, Date datumIzvrsenja, Long sifraLicaPlatilac, Long sifraLicaPrimalac, Long sifraValute) {
        this.sifraUplatnice = sifraUplatnice;
        this.iznosUplate = iznosUplate;
        this.datumIzvrsenja = datumIzvrsenja;
        this.sifraLicaPlatilac = sifraLicaPlatilac;
        this.sifraLicaPrimalac = sifraLicaPrimalac;
        this.sifraValute = sifraValute;
    }

    public Long getSifraValute() {
        return sifraValute;
    }

    public void setSifraValute(Long sifraValute) {
        this.sifraValute = sifraValute;
    }

    public Long getSifraUplatnice() {
        return sifraUplatnice;
    }

    public void setSifraUplatnice(Long sifraUplatnice) {
        this.sifraUplatnice = sifraUplatnice;
    }

    public int getIznosUplate() {
        return iznosUplate;
    }

    public void setIznosUplate(int iznosUplate) {
        this.iznosUplate = iznosUplate;
    }

    public Date getDatumIzvrsenja() {
        return datumIzvrsenja;
    }

    public void setDatumIzvrsenja(Date datumIzvrsenja) {
        this.datumIzvrsenja = datumIzvrsenja;
    }

    public Long getSifraLicaPlatilac() {
        return sifraLicaPlatilac;
    }

    public void setSifraLicaPlatilac(Long sifraLicaPlatilac) {
        this.sifraLicaPlatilac = sifraLicaPlatilac;
    }

    public Long getSifraLicaPrimalac() {
        return sifraLicaPrimalac;
    }

    public void setSifraLicaPrimalac(Long sifraLicaPrimalac) {
        this.sifraLicaPrimalac = sifraLicaPrimalac;
    }

    @Override
    public String toString() {
        return sifraUplatnice + " " + iznosUplate + " " + sifraLicaPlatilac + " " + sifraLicaPrimalac;
    }
}