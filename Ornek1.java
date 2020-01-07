package com.relakith;

import java.util.Scanner;


public class Ornek1 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int kisiSay, evliMaasOrt = 0, bekarYasOrt = 0, ortMaas = 0, menu, evliSayi = 0, bekarSayi = 0;
        String data[][] = new String[0][5];

        System.out.println("Kaç kişi girelecek ?");
        kisiSay = k.nextInt();

        if (kisiSay > 0)
        {
            data = new String[kisiSay][5];
        }else {
            System.exit(0);
        }

        for (int i = 0; kisiSay > i; i++)
        {
            System.out.println("---------------");
            System.out.println(i+1 + ".Kişi");
            System.out.println("Adınızı girin: ");
            data[i][0] = k.next();

            System.out.println("Doğum Yeriniz: ");
            data[i][1] = k.next();

            System.out.println("Doğum Tarihiniz: ");
            data[i][2] = k.next();

            System.out.println("Medeni Durumunuz(0=Bekar,1=Evli): ");
            data[i][3] = k.next();
            int mDurumTemp = Integer.parseInt(data[i][3]);

            if(mDurumTemp == 0)
            {
                bekarYasOrt += (2020 - mDurumTemp);
                bekarSayi += 1;
            }else {
                evliSayi += 1;
            }

            System.out.println("Maaşınız: ");
            data[i][4] = k.next();
            int maasTemp = Integer.parseInt(data[i][4]);

            if(mDurumTemp == 1)
            {
                evliMaasOrt += maasTemp;
            }
        }

        System.out.println("Menü: (1 Listeleme - 2 İstenilen Şehir Bilgisi - 3 Evlilerin Maaş Ort - 4 Bekar Yaş Ort - 5 Ort,Büyük,Küçük Maaş Ort - 6 Çıkış)");
        menu = k.nextInt();

        switch (menu){
            case 1:
                System.out.println("# \t İsim \t Doğum Yeri \t Doğum Tarihi \t Medeni Durum \t Maaş");
                for (int i = 0; data.length > i; i++)
                {
                    System.out.print(i + " \t ");
                    for (int j = 0; data[i].length > j; j++)
                    {
                        System.out.print(data[i][j] + " \t ");
                    }
                }
                break;
            case 2:
                System.out.println("Şehir Girin: ");
                String tempSehir = k.next();

                for (int i = 0; data.length > i; i++)
                {
                    if(data[i][1].equalsIgnoreCase(tempSehir))
                    {
                        System.out.println("İsim: " + data[i][0] + " Doğum Yeri: " + data[i][1] + " Doğum Tarihi: " + data[i][2] + " Medeni Durum: " + data[i][3] + " Maaş: " + data[i][4]);
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
                System.out.println("En büyük maaş: " + enBuyuk(data));
                System.out.println("En küçük maaş: " + enKucuk(data));
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
    public static int enBuyuk(String[][] data)
    {
        int enBuyuk = 0;
        for (int i = 0; data.length > i; i++)
        {
            int tempVal = Integer.parseInt(data[i][4]);
            enBuyuk = tempVal;
            if(Integer.parseInt(data[i][4]) > tempVal)
            {
                enBuyuk = Integer.parseInt(data[i][4]);
            }
        }

        return enBuyuk;
    }

    public static int enKucuk(String[][] data)
    {
        int enKucuk = 0;
        for (int i = 0; data.length > i; i++)
        {
            int tempVal = Integer.parseInt(data[i][4]);
            enKucuk = tempVal;
            if(tempVal > Integer.parseInt(data[i][4]))
            {
                enKucuk = Integer.parseInt(data[i][4]);
            }
        }

        return enKucuk;
    }
}
