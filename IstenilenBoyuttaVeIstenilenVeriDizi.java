package com.relakith;
import java.util.Scanner;

public class IstenilenBoyuttaVeIstenilenVeriDizi {

    public static void main(String[] args) {
        int elemanSay;
        int dizi[] = new int[0];
        Scanner k = new Scanner(System.in);

        System.out.println("Dizi kaç elemanlı olsun ?");
        elemanSay = k.nextInt();

        if(elemanSay > 0)
        {
            dizi = new int[elemanSay];
        }

        for (int i = 0; dizi.length > i; i++)
        {
            System.out.println("Dizinin " + (i+1) + ". elemanı");
            dizi[i] = k.nextInt();
        }

        System.out.print("Dizi Elemanları: ");

        for(int j = 0; dizi.length > j; j++)
        {
            System.out.print(dizi[j] + "\t");
        }

    }
}
