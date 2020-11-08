package com.naile;
import com.naile.Ocenka;
import com.naile.Student;

public class Main {

    public static void main(String[] args)
    {
	 Student ile = new Student("Ile");
	 ile.SetOcenka(new Ocenka("Hemija","20.10.2020",6));
	 ile.SetOcenka(new Ocenka("Fizika","19.10.2020",10));
	 ile.SetOcenka(new Ocenka("Biologija","21.10.2020",8));
	 ile.SetOcenka(new Ocenka("Fizicko","22.10.2020",6));

	 System.out.println(ile.GetProsek());
	 System.out.println(ile.toString());




    }
}

