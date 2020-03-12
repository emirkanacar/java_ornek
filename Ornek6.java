package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int vizeOrt = 0, finalOrt = 0, BnOrt = 0;
        Scanner scanner = new Scanner(System.in);

        // Kaç kişi alınacak
        System.out.println("Kişi sayısı girin: ");
        int personCount = scanner.nextInt();

        // Kişi Sayısı Kontrol
        if(personCount < 0)
        {
            System.out.println("Geçerli kişi sayısı girin!");
            System.exit(0);
        }

        String personData[][] = new String[personCount][7];

        for(int i = 0; i < personCount; i++)
        {
            System.out.println("-----------");
            System.out.println((i+1) + ". kişinin verileri");
            System.out.println("Ad: ");
            personData[i][0] = scanner.next();
            System.out.println("Yaş: ");
            personData[i][1] = "" + scanner.nextInt();
            System.out.println("Okul: ");
            personData[i][2] = scanner.next();
            System.out.println("Vize: ");
            personData[i][3] = "" + scanner.nextInt();
            vizeOrt += Integer.parseInt(personData[i][3]);
            System.out.println("Final: ");
            personData[i][4] = "" + scanner.nextInt();
            finalOrt += Integer.parseInt(personData[i][4]);
            personData[i][5] = "" + (int) ((Integer.parseInt(personData[i][3])*.3) + (Integer.parseInt(personData[i][4])*.7));
            BnOrt += Integer.parseInt(personData[i][5]);
            personData[i][6] = letterNote(Integer.parseInt(personData[i][5]));
        }

        // Menu
        for(;;)
        {
            System.out.println();
            System.out.println("1-)Listele, 2-)Vize Ortalaması, 3-)Final Ortalaması, 4-)Başarı Notu Ortalaması");
            System.out.println("5-)Vize Ortalaması Altında Kalanlar, 6-)Final Ortalaması Altında Kalanlar");
            System.out.println("7-)Başarı Notu Ortalaması Altında Kalanlar, 8-)Çıkış");
            System.out.println();
            int menu = scanner.nextInt();

            switch (menu)
            {
                case 1:
                    System.out.println("İsim\t Yaş\t Okul\t Vize\t Final\t Başarı Notu\t Harf Notu");
                    for (int i = 0; i < personCount; i++)
                    {
                        System.out.print(personData[i][0] + "\t |");
                        System.out.print(personData[i][1] + "\t |");
                        System.out.print(personData[i][2] + "\t |");
                        System.out.print(personData[i][3] + "\t |");
                        System.out.print(personData[i][4] + "\t |");
                        System.out.print(personData[i][5] + "\t |");
                        System.out.print(personData[i][6] + "\n");
                    }
                    break;

                case 2:
                    System.out.println("Vize Ortalaması: " + ( (int) vizeOrt / personCount ));
                    break;

                case 3:
                    System.out.println("Final Ortalaması: " + ( (int) finalOrt / personCount ));
                    break;

                case 4:
                    System.out.println("Başarı Notu Ortalaması: " + ( (int) BnOrt / personCount ));
                    break;

                case 5:
                    System.out.println("Vize ortalaması altında kalanlar listeleniyor");
                    System.out.println("İsim\t Yaş\t Okul\t Vize\t Final\t Başarı Notu\t Harf Notu");
                    for (int i = 0; i < personCount; i++)
                    {
                        if((vizeOrt / personCount) > Integer.parseInt(personData[i][3]))
                        {
                            System.out.print(personData[i][0] + "\t |");
                            System.out.print(personData[i][1] + "\t |");
                            System.out.print(personData[i][2] + "\t |");
                            System.out.print(personData[i][3] + "\t |");
                            System.out.print(personData[i][4] + "\t |");
                            System.out.print(personData[i][5] + "\t |");
                            System.out.print(personData[i][6] + "\n");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Final ortalaması altında kalanlar listeleniyor");
                    System.out.println("İsim\t Yaş\t Okul\t Vize\t Final\t Başarı Notu\t Harf Notu");
                    for (int i = 0; i < personCount; i++)
                    {
                        if((finalOrt / personCount) > Integer.parseInt(personData[i][4]))
                        {
                            System.out.print(personData[i][0] + "\t |");
                            System.out.print(personData[i][1] + "\t |");
                            System.out.print(personData[i][2] + "\t |");
                            System.out.print(personData[i][3] + "\t |");
                            System.out.print(personData[i][4] + "\t |");
                            System.out.print(personData[i][5] + "\t |");
                            System.out.print(personData[i][6] + "\n");
                        }
                    }
                    break;

                case 7:
                    System.out.println("Başarı notu ortalaması altında kalanlar listeleniyor");
                    System.out.println("İsim\t Yaş\t Okul\t Vize\t Final\t Başarı Notu\t Harf Notu");
                    for (int i = 0; i < personCount; i++)
                    {
                        if((BnOrt / personCount) > Integer.parseInt(personData[i][4]))
                        {
                            System.out.print(personData[i][0] + "\t |");
                            System.out.print(personData[i][1] + "\t |");
                            System.out.print(personData[i][2] + "\t |");
                            System.out.print(personData[i][3] + "\t |");
                            System.out.print(personData[i][4] + "\t |");
                            System.out.print(personData[i][5] + "\t |");
                            System.out.print(personData[i][6] + "\n");
                        }
                    }
                    break;

                case 8:
                    System.out.println("Çıkış yapılıyor...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Geçerli menü kodu girin!");
                    break;
            }
        }

    }

    private static String letterNote(int finalNote)
    {
        if(finalNote < 25)
        {
            return "FF";
        }else if(finalNote > 25 && finalNote < 45)
        {
            return "DD";
        }else if (finalNote > 45 && finalNote < 55)
        {
            return "CC";
        }else if(finalNote > 55 && finalNote < 65)
        {
            return "BB";
        }else if(finalNote > 65 && finalNote < 80)
        {
            return "BA";
        }else if(finalNote > 75)
        {
            return "AA";
        }else {
            return "";
        }
    }
}
