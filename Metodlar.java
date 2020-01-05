package com.relakith;

import java.util.Scanner;

public class Metodlar {

    public static void main(String[] args) {
        int menu, s1, s2;

        Scanner k = new Scanner(System.in);

        System.out.println("1.Sayıyı girin: ");
        s1 = k.nextInt();

        System.out.println("2.Sayıyı girin: ");
        s2 = k.nextInt();

        System.out.println("Menü: (1 Toplama - 2 Çıkarma - 3 Bölme - 4 Çarpma)");
        menu = k.nextInt();

        switch (menu){
            case 1:
                System.out.println("Toplam: " + toplama(s1,s2));
                break;
            case 2:
                System.out.println("Çıkarma: " + cikarma(s1,s2));
                break;
            case 3:
                System.out.println("Bölme: " + bolme(s1,s2));
                break;
            case 4:
                System.out.println("Çarpma: " + carpma(s1,s2));
                break;
            default:
                System.out.println("Geçerli bir işlem kodu giriniz!");
                break;
        }
    }

    public static int toplama(int s1, int s2)
    {
        return (s1+s2);
    }

    public static int cikarma(int s1, int s2)
    {
        return (s1-s2);
    }

    public static int carpma(int s1, int s2)
    {
        return (s1*s2);
    }

    public static int bolme(int s1, int s2)
    {
        return (s1/s2);
    }

}
