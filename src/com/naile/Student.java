package com.naile;
import com.naile.Covek;
import com.naile.Ocenka;


import java.util.ArrayList;


public class Student extends Covek {
    ArrayList<Ocenka> oceni;
    double prosek;
    Student( String _ime)
    {
        super(_ime);
        oceni = new ArrayList<Ocenka>();
    }

    public void SetOcenka(Ocenka o)
    {
        oceni.add(o);
    }

    public double GetProsek()
    {
        double suma =0;
        if (oceni.size()>0)
        {
            for (Ocenka o:oceni)
            {
                suma += o.getOcenka();
            }
            this.prosek = suma/oceni.size();
            return this.prosek;
        }
        else
        {
            return 0.0f;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "oceni=" + oceni +
                ", prosek=" + prosek +
                ", ime='" + ime + '\'' +
                '}';
    }
}
