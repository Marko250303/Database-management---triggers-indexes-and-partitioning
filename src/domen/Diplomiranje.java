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
public class Diplomiranje {
    private Long jmbg;
    private Long sifraStudijskogPrograma;
    private Long sifraFakulteta;
    private String brojIndeksa;
    private double prosek;
    private int godinaUpisa;
    private Date datumDiplomiranja;

    public Diplomiranje() {
    }

    public Diplomiranje(Long jmbg, Long sifraStudijskogPrograma, Long sifraFakulteta, String brojIndeksa, double prosek, int godinaUpisa, Date datumDiplomiranja) {
        this.jmbg = jmbg;
        this.sifraStudijskogPrograma = sifraStudijskogPrograma;
        this.sifraFakulteta = sifraFakulteta;
        this.brojIndeksa = brojIndeksa;
        this.prosek = prosek;
        this.godinaUpisa = godinaUpisa;
        this.datumDiplomiranja = datumDiplomiranja;
    }

    public Date getDatumDiplomiranja() {
        return datumDiplomiranja;
    }

    public void setDatumDiplomiranja(Date datumDiplomiranja) {
        this.datumDiplomiranja = datumDiplomiranja;
    }

    public Long getJmbg() {
        return jmbg;
    }

    public void setJmbg(Long jmbg) {
        this.jmbg = jmbg;
    }

    public Long getSifraStudijskogPrograma() {
        return sifraStudijskogPrograma;
    }

    public void setSifraStudijskogPrograma(Long sifraStudijskogPrograma) {
        this.sifraStudijskogPrograma = sifraStudijskogPrograma;
    }

    public Long getSifraFakulteta() {
        return sifraFakulteta;
    }

    public void setSifraFakulteta(Long sifraFakulteta) {
        this.sifraFakulteta = sifraFakulteta;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public double getProsek() {
        return prosek;
    }

    public void setProsek(double prosek) {
        this.prosek = prosek;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    @Override
    public String toString() {
        return brojIndeksa + " " + sifraFakulteta + " " + datumDiplomiranja;
    }
}