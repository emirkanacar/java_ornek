package com.relakith;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {

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
                System.out.println("Toplam: " + (s1+s2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (s1-s2));
                break;
            case 3:
                System.out.println("Bölme: " + (s1/s2));
                break;
            case 4:
                System.out.println("Çarpma: " + (s1*s2));
                break;
            default:
                System.out.println("Geçerli bir işlem kodu giriniz!");
                break;
        }

    }
}
