/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author Mare
 */
public class Univerzitet {
    private Long sifraUniverziteta;
    private String nazivUniverziteta;

    public Univerzitet() {
    }

    public Univerzitet(Long sifraUniverziteta, String nazivUniverziteta) {
        this.sifraUniverziteta = sifraUniverziteta;
        this.nazivUniverziteta = nazivUniverziteta;
    }

    public String getNazivUniverziteta() {
        return nazivUniverziteta;
    }

    public void setNazivUniverziteta(String nazivUniverziteta) {
        this.nazivUniverziteta = nazivUniverziteta;
    }

    public Long getSifraUniverziteta() {
        return sifraUniverziteta;
    }

    public void setSifraUniverziteta(Long sifraUniverziteta) {
        this.sifraUniverziteta = sifraUniverziteta;
    }

    @Override
    public String toString() {
        return sifraUniverziteta + "";
    }
}