/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author Mare
 */
public class NacionalnaPripadnost {
    private Long sifraNacionalnePripadnosti;
    private String nazivNacionalnePripadnosti;

    public NacionalnaPripadnost() {
    }

    public NacionalnaPripadnost(Long sifraNacionalnePripadnosti, String nazivNacionalnePripadnosti) {
        this.sifraNacionalnePripadnosti = sifraNacionalnePripadnosti;
        this.nazivNacionalnePripadnosti = nazivNacionalnePripadnosti;
    }

    public String getNazivNacionalnePripadnosti() {
        return nazivNacionalnePripadnosti;
    }

    public void setNazivNacionalnePripadnosti(String nazivNacionalnePripadnosti) {
        this.nazivNacionalnePripadnosti = nazivNacionalnePripadnosti;
    }

    public Long getSifraNacionalnePripadnosti() {
        return sifraNacionalnePripadnosti;
    }

    public void setSifraNacionalnePripadnosti(Long sifraNacionalnePripadnosti) {
        this.sifraNacionalnePripadnosti = sifraNacionalnePripadnosti;
    }

    @Override
    public String toString() {
        return nazivNacionalnePripadnosti;
    }
}