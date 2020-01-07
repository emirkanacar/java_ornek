package com.relakith;

import java.util.Scanner;


public class Ornek2 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int kisiSay, evliMaasOrt = 0, bekarYasOrt = 0, ortMaas = 0, menu, evliSayi = 0, bekarSayi = 0;

        String isimler[] = new String[0];
        String dogumYerleri[] = new String[0];
        int dogumTarih[] = new int[0];
        int medeniDurum[] = new int[0];
        int maaslar[] = new int[0];

        System.out.println("Kaç kişi girelecek ?");
        kisiSay = k.nextInt();

        if (kisiSay > 0)
        {
            isimler = new String[kisiSay];
            dogumYerleri = new String[kisiSay];
            dogumTarih = new int[kisiSay];
            medeniDurum = new int[kisiSay];
            maaslar = new int[kisiSay];
        }else {
            System.exit(0);
        }

        for (int i = 0; kisiSay > i; i++)
        {
            System.out.println("---------------");
            System.out.println(i+1 + ".Kişi");
            System.out.println("Adınızı girin: ");
            isimler[i] = k.next();

            System.out.println("Doğum Yeriniz: ");
            dogumYerleri[i] = k.next();

            System.out.println("Doğum Tarihiniz: ");
            dogumTarih[i] = k.nextInt();

            System.out.println("Medeni Durumunuz(0=Bekar,1=Evli): ");
            medeniDurum[i] = k.nextInt();
            int mDurumTemp = medeniDurum[i];

            if(mDurumTemp == 0)
            {
                bekarYasOrt += (2020 - mDurumTemp);
                bekarSayi += 1;
            }else {
                evliSayi += 1;
            }

            System.out.println("Maaşınız: ");
            maaslar[i] = k.nextInt();
            int maasTemp = maaslar[i];

            if(mDurumTemp == 1)
            {
                evliMaasOrt += maasTemp;
            }

            ortMaas += maasTemp;
        }

        System.out.println("Menü: (1 Listeleme - 2 İstenilen Şehir Bilgisi - 3 Evlilerin Maaş Ort - 4 Bekar Yaş Ort - 5 Ort,Büyük,Küçük Maaş Ort)");
        menu = k.nextInt();

        switch (menu){
            case 1:
                System.out.println("İsim \t Doğum Yeri \t Doğum Tarihi \t Medeni Durum \t Maaş");
                for (int i = 0; isimler.length > i; i++)
                {
                    String medeniD = "";
                    if(medeniDurum[i] == 0) medeniD = "Bekar";
                    else medeniD = "Evli";

                    System.out.print(isimler[i] + " \t " + dogumYerleri[i] + " \t " + dogumTarih[i] + " \t " + medeniD + " \t " + maaslar[i]);
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Şehir Girin: ");
                String tempSehir = k.next();

                for (int i = 0; isimler.length > i; i++)
                {
                    if(dogumYerleri[i].equalsIgnoreCase(tempSehir))
                    {
                        String medeniD = "";
                        if(medeniDurum[i] == 0) medeniD = "Bekar";
                        else medeniD = "Evli";

                        System.out.println("İsim: " + isimler[i] + " Doğum Yeri: " + dogumYerleri[i] + " Doğum Tarihi: " + dogumTarih[i] + " Medeni Durum: " + medeniD + " Maaş: " +  maaslar[i]);
                    }else {
                        System.out.println("Uygun Kayıt Bulunamadı!");
                    }
                }
                break;
            case 3:
                System.out.println("Evlilerin Maaş Ortalaması: " + (evliMaasOrt / evliSayi));
                break;
            case 4:
                System.out.println("Bekarların Yaş Ortalaması: " + (bekarYasOrt / bekarSayi));
                break;
            case 5:
                System.out.println("Maaş Ortalaması: " + (ortMaas / kisiSay));
                System.out.println("En büyük maaş: " + enBuyuk(maaslar));
                System.out.println("En küçük maaş: " + enKucuk(maaslar));
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Geçerli bir işlem kodu giriniz!");
                break;
        }

        /*for (int i = 0; data.length > i; i++)
        {
            for (int j = 0; data[i].length > j; j++)
            {
                System.out.println(data[i][j]);
            }
        }*/



    }
    public static int enBuyuk(int[] data)
    {
        int enBuyuk = 0;
        for (int i = 0; data.length > i; i++)
        {
            int tempVal = data[i];
            enBuyuk = tempVal;
            if(data[i]> tempVal)
            {
                enBuyuk = data[i];
            }
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
            if(tempVal > data[i])
            {
                enKucuk = tempVal;
            }
        }

        return enKucuk;
    }
}
