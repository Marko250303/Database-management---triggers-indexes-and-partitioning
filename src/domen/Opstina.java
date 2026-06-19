/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author Mare
 */
public class Opstina {
    private Long sifraOpstine;
    private String nazivOpstine;

    public Opstina() {
    }

    public Opstina(Long sifraOpstine, String nazivOpstine) {
        this.sifraOpstine = sifraOpstine;
        this.nazivOpstine = nazivOpstine;
    }

    public String getNazivOpstine() {
        return nazivOpstine;
    }

    public void setNazivOpstine(String nazivOpstine) {
        this.nazivOpstine = nazivOpstine;
    }

    public Long getSifraOpstine() {
        return sifraOpstine;
    }

    public void setSifraOpstine(Long sifraOpstine) {
        this.sifraOpstine = sifraOpstine;
    }

    @Override
    public String toString() {
        return nazivOpstine;
    }
}