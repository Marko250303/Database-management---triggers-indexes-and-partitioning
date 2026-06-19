/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author Mare
 */
public class Mesto {
    private Long sifraMesta;
    private String nazivMesta;
    private Long sifraDrzave;

    public Mesto() {
    }

    public Mesto(Long sifraMesta, String nazivMesta, Long sifraDrzave) {
        this.sifraMesta = sifraMesta;
        this.nazivMesta = nazivMesta;
        this.sifraDrzave = sifraDrzave;
    }

    public Long getSifraDrzave() {
        return sifraDrzave;
    }

    public void setSifraDrzave(Long sifraDrzave) {
        this.sifraDrzave = sifraDrzave;
    }

    public Long getSifraMesta() {
        return sifraMesta;
    }

    public void setSifraMesta(Long sifraMesta) {
        this.sifraMesta = sifraMesta;
    }

    public String getNazivMesta() {
        return nazivMesta;
    }

    public void setNazivMesta(String nazivMesta) {
        this.nazivMesta = nazivMesta;
    }

    @Override
    public String toString() {
        return nazivMesta;
    }
}