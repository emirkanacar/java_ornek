package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int vizeOrt = 0, finalOrt = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Öğrenci sayısı girin: ");
        int ogrenciSayi = s.nextInt();

        // öğrenci adı, vize, final, bn, harf notu
        String[][] ogrenciler = new String[ogrenciSayi][5];

        for (int i = 0; i < ogrenciSayi; i++)
        {
            System.out.println("------");
            System.out.println("Öğrenci adı: ");
            ogrenciler[i][0] = s.next();
            System.out.println("Öğrenci Vize Notu : ");
            ogrenciler[i][1] = "" + s.nextInt();
            vizeOrt += Integer.parseInt(ogrenciler[i][1]);
            System.out.println("Öğrenci Final Notu : ");
            ogrenciler[i][2] = "" + s.nextInt();
            finalOrt += Integer.parseInt(ogrenciler[i][2]);
            int basariNot = (int) (Integer.parseInt(ogrenciler[i][1])*.3 + Integer.parseInt(ogrenciler[i][2])*.7);
            ogrenciler[i][3] = "" + basariNot;
            ogrenciler[i][4] = harfNotu(basariNot);
        }

        for(;;)
        {
            System.out.println("1-)Listeleme, 2-)Öğrenci adına göre arama, 3-)Vize Ortalama, 4-)Final Ortalama");
            System.out.println("5-)En büyük vize değeri, 6-)En büyük final değeri, 7-)Çıkış");
            System.out.println();

            System.out.println("Menü değerini giriniz: ");
            int menu = s.nextInt();

            switch (menu)
            {
                case 1:
                    Listeleme(ogrenciler);
                    break;

                case 2:
                    Arama(ogrenciler);

                    break;

                case 3:
                    System.out.println("Vize ortalaması: " + VizeOrtalama(ogrenciler));
                    break;

                case 4:
                    System.out.println("Final ortalaması: " + finalOrtalama(ogrenciler));
                    break;

                case 5:
                    System.out.println("En büyük vize notu: " + EnBuyuk(ogrenciler, 1));
                    break;

                case 6:
                    System.out.println("En büyük vize notu: " + EnBuyuk(ogrenciler, 2));
                    break;

                case 7:
                    System.out.println("Sistemden çıkış yapılıyor");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Geçerli menü değeri giriniz!");
                    break;
            }
        }
    }

    private static String harfNotu(int basariNotu)
    {
        if(basariNotu < 45)
        {
            return "FF";
        }else if(basariNotu > 45 && basariNotu < 55)
        {
            return "DD";
        }else if(basariNotu > 55 && basariNotu < 65)
        {
            return "BB";
        }else if(basariNotu > 65 && basariNotu < 75)
        {
            return "BA";
        }else if(basariNotu > 75)
        {
            return "AA";
        }else {
            return "";
        }
    }

    private static void Listeleme(String dizi[][])
    {
        int ogrenciSayi = dizi.length;

        System.out.println("Öğrenci Adı\t Vize\t Final\t Başarı Notu\t Harf Puanı\t");
        for (int i = 0; i < ogrenciSayi; i++)
        {
            System.out.print(dizi[i][0] + "\t |");
            System.out.print(dizi[i][1] + "\t |");
            System.out.print(dizi[i][2] + "\t |");
            System.out.print(dizi[i][3] + "\t |");
            System.out.print(dizi[i][4] + "\n");
        }
    }

    private static void Arama(String dizi[][])
    {
        Scanner s = new Scanner(System.in);
        int ogrenciSayi = dizi.length;

        System.out.println("Öğrenci adı giriniz");
        String ogrenciAd = s.next();

        System.out.println("Öğrenci Adı\t Vize\t Final\t Başarı Notu\t Harf Puanı\t");

        for (int i = 0; i < ogrenciSayi; i++)
        {
            if(dizi[i][0].equalsIgnoreCase(ogrenciAd))
            {
                System.out.print(dizi[i][0] + "\t |");
                System.out.print(dizi[i][1] + "\t |");
                System.out.print(dizi[i][2] + "\t |");
                System.out.print(dizi[i][3] + "\t |");
                System.out.print(dizi[i][4] + "\n");
            }else {
                System.out.println("Bu isime ait kayıt bulunamadı!");
            }
        }
    }

    private static int VizeOrtalama(String dizi[][])
    {
        int veriSayisi = dizi.length;
        int ortVeriToplam = 0;

        for(int i = 0; i < veriSayisi; i++)
        {
            ortVeriToplam = Integer.parseInt(dizi[i][1]);
        }

        return (int) ortVeriToplam / veriSayisi;
    }

    private static int finalOrtalama(String dizi[][])
    {
        int veriSayisi = dizi.length;
        int ortVeriToplam = 0;

        for(int i = 0; i < veriSayisi; i++)
        {
            ortVeriToplam = Integer.parseInt(dizi[i][2]);
        }

        return (int) ortVeriToplam / veriSayisi;
    }

    private static int EnBuyuk(String dizi[][], int sutun)
    {
        int tempNot = 0;
        int diziUzunluk = dizi.length;

        for (int i = 0; i < diziUzunluk; i++)
        {
            tempNot = Integer.parseInt(dizi[i][sutun]);
            if(Integer.parseInt(dizi[i][sutun]) > tempNot)
            {
                tempNot = Integer.parseInt(dizi[i][sutun]);
            }
        }

        return tempNot;
    }
}
