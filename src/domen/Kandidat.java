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
public class Kandidat {
    private Long jmbg;
    private String brojIndeksa;
    private String ime;
    private String prezime;
    private String imeRoditelja;
    private Date datumRodjenja;
    private Date datumDiplomiranja;
    private String skolskaGodinaUpisa;
    private Long opstiUspeh;
    private Long sifraStudijskogPrograma;
    private Long sifraFakulteta;
    private Long sifraOpstine;
    private String nazivOpstine;

    public Kandidat() {
    }

    public Kandidat(Long jmbg, String brojIndeksa, String ime, String prezime, String imeRoditelja, Date datumRodjenja, Date datumDiplomiranja, String skolskaGodinaUpisa, Long opstiUspeh, Long sifraStudijskogPrograma, Long sifraFakulteta, Long sifraOpstine, String nazivOpstine) {
        this.jmbg = jmbg;
        this.brojIndeksa = brojIndeksa;
        this.ime = ime;
        this.prezime = prezime;
        this.imeRoditelja = imeRoditelja;
        this.datumRodjenja = datumRodjenja;
        this.datumDiplomiranja = datumDiplomiranja;
        this.skolskaGodinaUpisa = skolskaGodinaUpisa;
        this.opstiUspeh = opstiUspeh;
        this.sifraStudijskogPrograma = sifraStudijskogPrograma;
        this.sifraFakulteta = sifraFakulteta;
        this.sifraOpstine = sifraOpstine;
        this.nazivOpstine = nazivOpstine;
    }

    public String getNazivOpstine() {
        return nazivOpstine;
    }

    public void setNazivOpstine(String nazivOpstine) {
        this.nazivOpstine = nazivOpstine;
    }

    public Long getJmbg() {
        return jmbg;
    }

    public void setJmbg(Long jmbg) {
        this.jmbg = jmbg;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getImeRoditelja() {
        return imeRoditelja;
    }

    public void setImeRoditelja(String imeRoditelja) {
        this.imeRoditelja = imeRoditelja;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public Date getDatumDiplomiranja() {
        return datumDiplomiranja;
    }

    public void setDatumDiplomiranja(Date datumDiplomiranja) {
        this.datumDiplomiranja = datumDiplomiranja;
    }

    public String getSkolskaGodinaUpisa() {
        return skolskaGodinaUpisa;
    }

    public void setSkolskaGodinaUpisa(String skolskaGodinaUpisa) {
        this.skolskaGodinaUpisa = skolskaGodinaUpisa;
    }

    public Long getOpstiUspeh() {
        return opstiUspeh;
    }

    public void setOpstiUspeh(Long opstiUspeh) {
        this.opstiUspeh = opstiUspeh;
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

    public Long getSifraOpstine() {
        return sifraOpstine;
    }

    public void setSifraOpstine(Long sifraOpstine) {
        this.sifraOpstine = sifraOpstine;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " " + nazivOpstine;
    }    
}