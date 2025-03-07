package org.example;

import java.util.List;

public class Raum {
    private int raumId;
    private int zieltemperatur;
    private List<Fenster> fensterliste;
    private List<Heizung> heizungliste;
    private Thermometer thermometer;

    public Raum(int raumId, int zieltemperatur) {
        this.raumId = raumId;
        this.zieltemperatur = zieltemperatur;
    }

    public boolean hatOffeneFenster() {
        for (Fenster f : fensterliste) {
            if (f.isOffen()) {
                return true;
            }
        }
        return false;
    }

    public void regeleTemperatur() {
        if (hatOffeneFenster())
        {
            for (Heizung h : heizungliste)
            {
                h.schalteAus();
            }
        }
        else
        {
            if (thermometer.getTemperatur() < zieltemperatur)
            {
                for (Heizung h : heizungliste) {
                    h.schalteEin();
                }
            }
            else if (thermometer.getTemperatur() > zieltemperatur)
            {
                h.schalteAus();
            }
        }
    }

    public List<Fenster> getFensterliste() {
        return fensterliste;
    }

    public List<Heizung> getHeizungliste() {
        return heizungliste;
    }

    public int getZieltemperatur() {
        return zieltemperatur;
    }

    public void setZieltemperatur(int zieltemperatur) {
        this.zieltemperatur = zieltemperatur;
    }


    public String toString() {
        return "Raum" + raumId + ":" + zieltemperatur + "°C, Fenster" + fensterliste.size() + "Heizung: " + heizungliste.size();

    }
}
