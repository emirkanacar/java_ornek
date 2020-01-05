package com.relakith;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // scanner tanımlanması
        Scanner k = new Scanner(System.in);

        // veri tipi tanımlaması
        int kisiYas;
        String kisiAd;

        System.out.println("Adınızı girin: ");
        kisiAd = k.nextLine();

        System.out.println("Yaşınızı girin: ");
        kisiYas = k.nextInt();

        System.out.println("İsminiz: " + kisiAd + " - Yaşınız: " + kisiYas);
    }
}
