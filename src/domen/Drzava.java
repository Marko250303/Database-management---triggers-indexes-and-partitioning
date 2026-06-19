/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author Mare
 */
public class Drzava {
    private Long sifraDrzave;
    private String nazivDrzave;

    public Drzava() {
    }

    public Drzava(Long sifraDrzave, String nazivDrzave) {
        this.sifraDrzave = sifraDrzave;
        this.nazivDrzave = nazivDrzave;
    }

    public String getNazivDrzave() {
        return nazivDrzave;
    }

    public void setNazivDrzave(String nazivDrzave) {
        this.nazivDrzave = nazivDrzave;
    }

    public Long getSifraDrzave() {
        return sifraDrzave;
    }

    public void setSifraDrzave(Long sifraDrzave) {
        this.sifraDrzave = sifraDrzave;
    }

    @Override
    public String toString() {
        return nazivDrzave;
    }
}