/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author Mare
 */
public class Fakultet {
    private Long sifraFakulteta;
    private String nazivFakulteta;
    private String adresaFakulteta;
    private Long sifraUniverziteta;

    public Fakultet() {
    }

    public Fakultet(Long sifraFakulteta, String nazivFakulteta, String adresaFakulteta, Long sifraUniverziteta) {
        this.sifraFakulteta = sifraFakulteta;
        this.nazivFakulteta = nazivFakulteta;
        this.adresaFakulteta = adresaFakulteta;
        this.sifraUniverziteta = sifraUniverziteta;
    }

    public Long getSifraUniverziteta() {
        return sifraUniverziteta;
    }

    public void setSifraUniverziteta(Long sifraUniverziteta) {
        this.sifraUniverziteta = sifraUniverziteta;
    }

    public Long getSifraFakulteta() {
        return sifraFakulteta;
    }

    public void setSifraFakulteta(Long sifraFakulteta) {
        this.sifraFakulteta = sifraFakulteta;
    }

    public String getNazivFakulteta() {
        return nazivFakulteta;
    }

    public void setNazivFakulteta(String nazivFakulteta) {
        this.nazivFakulteta = nazivFakulteta;
    }

    public String getAdresaFakulteta() {
        return adresaFakulteta;
    }

    public void setAdresaFakulteta(String adresaFakulteta) {
        this.adresaFakulteta = adresaFakulteta;
    }

    @Override
    public String toString() {
        return nazivFakulteta;
    }
}
