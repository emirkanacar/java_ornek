package com.relakith;

public class Diziler {
    public static void main(String[] args) {
        int[] sayi = new int[]{1, 2, 3, 4, 5};
        int tempToplam = 0;

        for (int i = 0; sayi.length > i; i++)
        {
            System.out.println(sayi[i]);
            tempToplam += sayi[i];
        }
        System.out.println("Toplam: " + tempToplam);
    }
}
