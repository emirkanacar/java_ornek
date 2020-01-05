package com.relakith;

import java.util.Scanner;

public class BelirliSayidaVeriAlma {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        int kisiYas,kisiMaas,kisiGider,maasOrt = 0,istenenKisi;
        String kisiAd;

        System.out.println("Kişi sayısı girin: ");
        istenenKisi = k.nextInt();

        for(int i = 0; i < istenenKisi; i++)
        {
            System.out.println("---------------");
            System.out.println(i+1 + ".Kişi");
            System.out.println("Adınızı girin: ");
            kisiAd = k.next();

            System.out.println("Yaşınızı girin: ");
            kisiYas = k.nextInt();

            System.out.println("Maaşınızı girin: ");
            kisiMaas = k.nextInt();
            maasOrt += kisiMaas;

            System.out.println("Giderinizi girin: ");
            kisiGider = k.nextInt();
        }

        System.out.println("Maaş Ortalaması: " + (maasOrt / istenenKisi));

    }

}
