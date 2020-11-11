package com.naile;
import java.util.*;
import com.naile.Covek;
import com.naile.Ocenka;


import java.util.ArrayList;


public class Student extends Covek {
    Ocenka[] oceni;
    double prosek;
    Student( String _ime)
    {
        super(_ime);
        oceni = new Ocenka[0];
    }

    public void SetOcenka(Ocenka o)
    {
       oceni = Arrays.copyOf(oceni,oceni.length+1);
       oceni[oceni.length-1] = o;

    }

    public double GetProsek()
    {
        double suma =0;
        if (oceni.length>0)
        {
            for (Ocenka o:oceni)
            {
                suma += o.getOcenka();
            }
            this.prosek = suma/oceni.length;
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
                "oceni=" + Arrays.toString(oceni) +
                ", prosek=" + prosek +
                ", ime='" + ime + '\'' +
                '}';
    }
}
