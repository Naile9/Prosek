package com.naile;

public class Ocenka {

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public Integer getOcenka() {
        return ocenka;
    }

    public void setOcenka(Integer ocenka) {
        this.ocenka = ocenka;
    }

    String predmet;
    String datum;
    Integer ocenka;

    Ocenka(String _Predmet, String _Datum, Integer _Ocenka)
    {
        ocenka = _Ocenka;
        datum = _Datum;
        predmet = _Predmet;
    }


    @Override
    public String toString() {
        return "Ocenka{" +
                "predmet='" + predmet + '\'' +
                ", datum='" + datum + '\'' +
                ", ocenka=" + ocenka +
                '}';
    }
}
