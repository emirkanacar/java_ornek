package com.relakith;

import java.util.Scanner;

public class SinirsizDonguVeriAlma {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        int kisiYas,kisiMaas,kisiGider,maasOrt = 0,kisiSay = 0;
        String kisiAd;

        for(;;)
        {
            System.out.println("---------------");
            System.out.println("Adınızı girin: ");
            kisiAd = k.next();

            System.out.println("Yaşınızı girin: ");
            kisiYas = k.nextInt();

            System.out.println("Maaşınızı girin: ");
            kisiMaas = k.nextInt();
            maasOrt += kisiMaas;

            System.out.println("Giderinizi girin: ");
            kisiGider = k.nextInt();

            kisiSay += 1;
            System.out.println(kisiAd + " maaşın: " + kisiMaas + " giderin: " + kisiGider + " elinde kalan para: " + (kisiMaas - kisiGider));
            if(kisiSay > 1) System.out.println("Maaş Ortalaması: " + (maasOrt / kisiSay));
        }

    }

}
