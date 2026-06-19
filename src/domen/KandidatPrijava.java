/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author Mare
 */
public class KandidatPrijava {
    private Long jmbg;
    private String ime;
    private String prezime;
    private String imeRoditelja;
    private String pol;
    private String adresa;
    private String mobilniTelefon;
    private String fiksniTelefon;
    private Long sifraMesta;
    private Long brojLicneKarte;
    private Long brojPrijave;
    private String nacionalnaPripadnost;
    private int trosakPrijave;

    public KandidatPrijava() {
    }

    public KandidatPrijava(Long jmbg, String ime, String prezime, String imeRoditelja, String pol, String adresa, String mobilniTelefon, String fiksniTelefon, Long sifraMesta, Long brojLicneKarte, Long brojPrijave, String nacionalnaPripadnost, int trosakPrijave) {
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.imeRoditelja = imeRoditelja;
        this.pol = pol;
        this.adresa = adresa;
        this.mobilniTelefon = mobilniTelefon;
        this.fiksniTelefon = fiksniTelefon;
        this.sifraMesta = sifraMesta;
        this.brojLicneKarte = brojLicneKarte;
        this.brojPrijave = brojPrijave;
        this.nacionalnaPripadnost = nacionalnaPripadnost;
        this.trosakPrijave = trosakPrijave;
    }

    public int getTrosakPrijave() {
        return trosakPrijave;
    }

    public void setTrosakPrijave(int trosakPrijave) {
        this.trosakPrijave = trosakPrijave;
    }

    public Long getJmbg() {
        return jmbg;
    }

    public void setJmbg(Long jmbg) {
        this.jmbg = jmbg;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getImeRoditelja() {
        return imeRoditelja;
    }

    public void setImeRoditelja(String imeRoditelja) {
        this.imeRoditelja = imeRoditelja;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getMobilniTelefon() {
        return mobilniTelefon;
    }

    public void setMobilniTelefon(String mobilniTelefon) {
        this.mobilniTelefon = mobilniTelefon;
    }

    public String getFiksniTelefon() {
        return fiksniTelefon;
    }

    public void setFiksniTelefon(String fiksniTelefon) {
        this.fiksniTelefon = fiksniTelefon;
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

    public Long getBrojPrijave() {
        return brojPrijave;
    }

    public void setBrojPrijave(Long brojPrijave) {
        this.brojPrijave = brojPrijave;
    }

    public String getNacionalnaPripadnost() {
        return nacionalnaPripadnost;
    }

    public void setNacionalnaPripadnost(String nacionalnaPripadnost) {
        this.nacionalnaPripadnost = nacionalnaPripadnost;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " " + adresa + " " + trosakPrijave;
    }
}
