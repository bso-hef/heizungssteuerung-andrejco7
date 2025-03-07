package org.example;

public class Fenster {
    private boolean offen;
    private Raum raum;
    public Fenster(Raum raum) {
        this.raum = raum;
        this.offen = false;
    }
    public void oeffneFenster() {
        this.offen = true;
        for (Heizung h : raum.getHeizungsliste()) {
            h.schalteAus();
        }
    }
    public void schliesseFenster() {
        this.offen = false;
    }
    public boolean isOffen() {
        return offen;
    }
    public Raum getRaum() {
        return raum;
    }
}
