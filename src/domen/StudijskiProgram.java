/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author Mare
 */
public class StudijskiProgram {
    private Long sifraStudijskogPrograma;
    private Long sifraFakulteta;
    private String nazivStudijskogPrograma;
    private String zvanje;
    private String nazivFakulteta;

    public StudijskiProgram() {
    }

    public StudijskiProgram(Long sifraStudijskogPrograma, Long sifraFakulteta, String nazivStudijskogPrograma, String zvanje, String nazivFakulteta) {
        this.sifraStudijskogPrograma = sifraStudijskogPrograma;
        this.sifraFakulteta = sifraFakulteta;
        this.nazivStudijskogPrograma = nazivStudijskogPrograma;
        this.zvanje = zvanje;
        this.nazivFakulteta = nazivFakulteta;
    }

    public String getNazivFakulteta() {
        return nazivFakulteta;
    }

    public void setNazivFakulteta(String nazivFakulteta) {
        this.nazivFakulteta = nazivFakulteta;
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

    public String getZvanje() {
        return zvanje;
    }

    public void setZvanje(String zvanje) {
        this.zvanje = zvanje;
    }

    @Override
    public String toString() {
        return nazivStudijskogPrograma + " " + nazivFakulteta;
    }
}
