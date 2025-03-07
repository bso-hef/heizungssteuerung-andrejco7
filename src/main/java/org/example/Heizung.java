package org.example;

public class Heizung {
    private boolean eingeschaltet;
    private Raum raum;
    public Heizung(Raum raum) {
        this.raum = raum;
        this.eingeschaltet = false;
    }
    public void schalteEin() {
        this.eingeschaltet = true;
    }
    public void schalteAus() {
        this.eingeschaltet = false;
    }
    public boolean isEingeschaltet() {
        return eingeschaltet;
    }
    public Raum getRaum() {
        return raum;
    }
}
