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
public class UverenjeODiplomiranju {
    private Long brojUverenja;
    private Date datumIzdavanja;
    private Long godinaUpisa;
    private Date datumDiplomiranja;
    private double prosek;
    private String stecenoZvanje;
    private String dekan;
    private Long jmbg;

    public UverenjeODiplomiranju() {
    }

    public UverenjeODiplomiranju(Long brojUverenja, Date datumIzdavanja, Long godinaUpisa, Date datumDiplomiranja, double prosek, String stecenoZvanje, String dekan, Long jmbg) {
        this.brojUverenja = brojUverenja;
        this.datumIzdavanja = datumIzdavanja;
        this.godinaUpisa = godinaUpisa;
        this.datumDiplomiranja = datumDiplomiranja;
        this.prosek = prosek;
        this.stecenoZvanje = stecenoZvanje;
        this.dekan = dekan;
        this.jmbg = jmbg;
    }

    public Long getJmbg() {
        return jmbg;
    }

    public void setJmbg(Long jmbg) {
        this.jmbg = jmbg;
    }

    public Long getBrojUverenja() {
        return brojUverenja;
    }

    public void setBrojUverenja(Long brojUverenja) {
        this.brojUverenja = brojUverenja;
    }

    public Date getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(Date datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    public Long getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(Long godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public Date getDatumDiplomiranja() {
        return datumDiplomiranja;
    }

    public void setDatumDiplomiranja(Date datumDiplomiranja) {
        this.datumDiplomiranja = datumDiplomiranja;
    }

    public double getProsek() {
        return prosek;
    }

    public void setProsek(double prosek) {
        this.prosek = prosek;
    }

    public String getStecenoZvanje() {
        return stecenoZvanje;
    }

    public void setStecenoZvanje(String stecenoZvanje) {
        this.stecenoZvanje = stecenoZvanje;
    }

    public String getDekan() {
        return dekan;
    }

    public void setDekan(String dekan) {
        this.dekan = dekan;
    }

    @Override
    public String toString() {
        return brojUverenja + " " + datumDiplomiranja + " " + prosek + " " + stecenoZvanje;
    }
}