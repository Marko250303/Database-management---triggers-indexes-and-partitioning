/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author Mare
 */
public class Valuta {
    private Long sifraValute;
    private String nazivValute;

    public Valuta() {
    }

    public Valuta(Long sifraValute, String nazivValute) {
        this.sifraValute = sifraValute;
        this.nazivValute = nazivValute;
    }

    public String getNazivValute() {
        return nazivValute;
    }

    public void setNazivValute(String nazivValute) {
        this.nazivValute = nazivValute;
    }

    public Long getSifraValute() {
        return sifraValute;
    }

    public void setSifraValute(Long sifraValute) {
        this.sifraValute = sifraValute;
    }

    @Override
    public String toString() {
        return nazivValute;
    }
}
