package com.uzduotis3;

import java.util.Scanner;

/**
 * Created by User on 2017-03-03.
 */
public class Uzduotis3 {
    public Uzduotis3(){
        System.out.println("Ivesk pirma skaiciu");
        Scanner sc=new Scanner(System.in);
        int skaicius1=sc.nextInt();
        System.out.println("Ivesk antra skaiciu");
        int skaicius2=sc.nextInt();
        int suma = skaicius1+skaicius2;
        int skirtumas=skaicius1-skaicius2;
        System.out.print("Siu skaiciu suma = "+suma+", o skirtumas = "+skirtumas);
    }
}
