package com.relakith;

import java.util.Scanner;

public class Ornek4 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int kisiSay, vizeOrt = 0, finalOrt = 0, menu;

        String isimler[] = new String[0];
        String dersler[] = new String[0];
        int vize[] = new int[0];
        int finaller[] = new int[0];

        System.out.println("Kaç kişi girelecek ?");
        kisiSay = k.nextInt();

        if (kisiSay > 0)
        {
            isimler = new String[kisiSay];
            dersler = new String[kisiSay];
            vize = new int[kisiSay];
            finaller = new int[kisiSay];
        }else {
            System.exit(0);
        }

        for (int i = 0; kisiSay > i; i++)
        {
            System.out.println("---------------");
            System.out.println(i+1 + ".Kişi");
            System.out.println("Adınızı girin: ");
            isimler[i] = k.next();

            System.out.println("Ders Adı: ");
            dersler[i] = k.next();

            System.out.println("Vizeniz: ");
            vize[i] = k.nextInt();

            System.out.println("Finaliniz : ");
            finaller[i] = k.nextInt();

        }

        System.out.println("Menü: (1 Listeleme - 2 İstenilen Ders Bilgisi - 3 Vize,Final Ortalamaları - 4 En Büyük Vize,Final - 5 En Küçük Vize,Final - 6 Çıkış)");
        menu = k.nextInt();

        switch (menu){
            case 1:
                Listele(isimler, dersler, vize, finaller);
                break;
            case 2:
                System.out.println("Ders adı Girin: ");
                String tempDers = k.next();
                dersArama(isimler, dersler, vize, finaller, tempDers);
                break;
            case 3:
                System.out.println("Vize Ortalaması: " + (int)(vizeOrt / kisiSay) + " Final Ort: " + (int)(finalOrt / kisiSay));
                break;
            case 4:
                System.out.println("En Büyük Vize: " + enBuyuk(vize) + " En Büyük Final: " + enBuyuk(finaller));
                break;
            case 5:
                System.out.println("En Küçük Vize: " + enKucuk(vize) + " En Küçük Final: " + enKucuk(finaller));
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Geçerli bir işlem kodu giriniz!");
                break;
        }
    }
    public static int enBuyuk(int[] data)
    {
        int enBuyuk = 0;
        for (int i = 0; data.length > i; i++)
        {
            int tempVal = data[i];
            enBuyuk = tempVal;
            if(data[i]> tempVal) enBuyuk = data[i];
        }

        return enBuyuk;
    }

    public static int enKucuk(int[] data)
    {
        int enKucuk = 0;
        for (int i = 0; data.length > i; i++)
        {
            int tempVal = data[0];
            enKucuk = tempVal;
            if(tempVal > data[i]) enKucuk = tempVal;
        }

        return enKucuk;
    }


    public static void dersArama(String isimler[], String dersler[], int vize[], int finaller[], String tempDers)
    {

        for (int i = 0; dersler.length > i; i++)
        {
            if(dersler[i].equalsIgnoreCase(tempDers))
            {
                System.out.print(isimler[i] + " \t " + dersler[i] + " \t " + vize[i] + " \t " + finaller[i] + " \t " + (int)((vize[i]*.3) + (finaller[i]*.7)));
            }else {
                System.out.println("Uygun Kayıt Bulunamadı!");
            }
        }
    }

    public static void Listele(String isimler[], String dersler[], int vize[], int finaller[])
    {
        System.out.println("İsim \t Ders \t Vize \t Final \t Başarı Not");
        for (int i = 0; isimler.length > i; i++)
        {
            System.out.print(isimler[i] + " \t " + dersler[i] + " \t " + vize[i] + " \t " + finaller[i] + " \t " + (int)((vize[i]*.3) + (finaller[i]*.7)));
            System.out.println();
        }
    }
}
