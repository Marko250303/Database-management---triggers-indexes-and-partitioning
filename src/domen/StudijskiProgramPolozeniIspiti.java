/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author Mare
 */
public class StudijskiProgramPolozeniIspiti {
    private Long sifraStudijskogPrograma;
    private Long sifraFakulteta;
    private String nazivStudijskogPrograma;
    private int brojSemestara;
    private int ukupnoESPB;
    private String zvanje;

    public StudijskiProgramPolozeniIspiti() {
    }

    public StudijskiProgramPolozeniIspiti(Long sifraStudijskogPrograma, Long sifraFakulteta, String nazivStudijskogPrograma, int brojSemestara, int ukupnoESPB, String zvanje) {
        this.sifraStudijskogPrograma = sifraStudijskogPrograma;
        this.sifraFakulteta = sifraFakulteta;
        this.nazivStudijskogPrograma = nazivStudijskogPrograma;
        this.brojSemestara = brojSemestara;
        this.ukupnoESPB = ukupnoESPB;
        this.zvanje = zvanje;
    }

    public String getZvanje() {
        return zvanje;
    }

    public void setZvanje(String zvanje) {
        this.zvanje = zvanje;
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

    public String getNazivStudijskogPrograma() {
        return nazivStudijskogPrograma;
    }

    public void setNazivStudijskogPrograma(String nazivStudijskogPrograma) {
        this.nazivStudijskogPrograma = nazivStudijskogPrograma;
    }

    public int getBrojSemestara() {
        return brojSemestara;
    }

    public void setBrojSemestara(int brojSemestara) {
        this.brojSemestara = brojSemestara;
    }

    public int getUkupnoESPB() {
        return ukupnoESPB;
    }

    public void setUkupnoESPB(int ukupnoESPB) {
        this.ukupnoESPB = ukupnoESPB;
    }

    @Override
    public String toString() {
        return nazivStudijskogPrograma + " " + ukupnoESPB + " " + zvanje;
    }
}