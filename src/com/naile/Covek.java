package com.naile;

public class Covek {
    String ime;

    public Covek() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    Covek(String _Ime)
    {
      ime = _Ime;

    }

    @Override
    public String toString() {
        return "Covek{" +
                "ime='" + ime + '\'' +
                '}';
    }
}
