/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author Mare
 */
public class LicnaKarta {
    private Long brojLicneKarte;
    private String nazivIDDokumenta;
    private Long sifraMesta;

    public LicnaKarta() {
    }

    public LicnaKarta(Long brojLicneKarte, String nazivIDDokumenta, Long sifraMesta) {
        this.brojLicneKarte = brojLicneKarte;
        this.nazivIDDokumenta = nazivIDDokumenta;
        this.sifraMesta = sifraMesta;
    }

    public Long getSifraMesta() {
        return sifraMesta;
    }

    public void setSifraMesta(Long sifraMesta) {
        this.sifraMesta = sifraMesta;
    }

    public Long getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(Long brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public String getNazivIDDokumenta() {
        return nazivIDDokumenta;
    }

    public void setNazivIDDokumenta(String nazivIDDokumenta) {
        this.nazivIDDokumenta = nazivIDDokumenta;
    }

    @Override
    public String toString() {
        return brojLicneKarte + " " + nazivIDDokumenta;
    }
}