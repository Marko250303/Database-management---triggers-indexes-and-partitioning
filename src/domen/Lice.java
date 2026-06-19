/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author Mare
 */
public class Lice {
    private Long sifraLica;
    private String nazivLica;
    private String adresaLica;

    public Lice() {
    }

    public Lice(Long sifraLica, String nazivLica, String adresaLica) {
        this.sifraLica = sifraLica;
        this.nazivLica = nazivLica;
        this.adresaLica = adresaLica;
    }

    public String getAdresaLica() {
        return adresaLica;
    }

    public void setAdresaLica(String adresaLica) {
        this.adresaLica = adresaLica;
    }

    public Long getSifraLica() {
        return sifraLica;
    }

    public void setSifraLica(Long sifraLica) {
        this.sifraLica = sifraLica;
    }

    public String getNazivLica() {
        return nazivLica;
    }

    public void setNazivLica(String nazivLica) {
        this.nazivLica = nazivLica;
    }

    @Override
    public String toString() {
        return nazivLica + " " + adresaLica;
    }
}