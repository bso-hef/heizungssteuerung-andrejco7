package org.example;

public class Thermometer {
    private int temperatur;
    private int akkustand;
    private int id;

    public Thermometer(int temperatur, int akkustand, int id){
        this.id = id;
        this.akkustand = akkustand;
        this.temperatur = temperatur;
    }

    public int getTemperatur() {
        return temperatur;
    }

    public int getAkkustand() {
        return akkustand;
    }

    public int getId() {
        return id;
    }
}
