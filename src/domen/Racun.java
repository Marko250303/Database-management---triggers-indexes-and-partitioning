/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author Mare
 */
public class Racun {
    private Long sifraRacuna;
    private Long brojRacuna;
    private Long sifraLica;

    public Racun() {
    }

    public Racun(Long sifraRacuna, Long brojRacuna, Long sifraLica) {
        this.sifraRacuna = sifraRacuna;
        this.brojRacuna = brojRacuna;
        this.sifraLica = sifraLica;
    }

    public Long getSifraLica() {
        return sifraLica;
    }

    public void setSifraLica(Long sifraLica) {
        this.sifraLica = sifraLica;
    }

    public Long getSifraRacuna() {
        return sifraRacuna;
    }

    public void setSifraRacuna(Long sifraRacuna) {
        this.sifraRacuna = sifraRacuna;
    }

    public Long getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(Long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    @Override
    public String toString() {
        return brojRacuna + " " + sifraLica;
    }
}