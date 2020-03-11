package xy;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		int inputCount, ort=0, ortB = 0, ortBCount=0, ortK = 0, ortKCount=0, menu;
		Scanner s = new Scanner(System.in);
		System.out.println("Kaç sayı girelecek ?");
		inputCount = s.nextInt();
		int[] sayilar = new int[inputCount];
		
		for(int i = 0; i<inputCount; i++)
		{
			System.out.println(i+1 + ".sayıyı girin: ");
			sayilar[i] = s.nextInt();
		}
		
		for(int j = 0; j < sayilar.length; j++)
		{
			ort += sayilar[j];
		}
		
		ort = (ort / sayilar.length);
		
		for(;;)
		{
			System.out.println("İstediğiniz işlem ? 1-ort, 2-ort kucuk sayı ve ort, 3-ort buyuk sayı ve ort, 4-çıkış");
			menu = s.nextInt();
			
			switch(menu)
			{
				case 1:
					System.out.println("ortalama: " + ort);
				break;
				
				case 2:
					for(int j = 0; j < sayilar.length; j++)
					{
						if(sayilar[j] < ort)
						{
							ortK += sayilar[j];
							ortKCount += 1;
						}
					}
					
					System.out.println("çıktı: " + (ortK / ortKCount));
				break;
				
				case 3:
					for(int j = 0; j < sayilar.length; j++)
					{
						if(sayilar[j] > ort)
						{
							ortB += sayilar[j];
							ortBCount += 1;
						}
					}
					
					System.out.println("çıktı: " + (ortB / ortBCount));
				break;
				
				case 4:
					System.exit(0);
				break;
				
				default:
					System.out.println("Geçerli işlem giriniz");
				break;
				
			}
		}
		
		


	}

}
