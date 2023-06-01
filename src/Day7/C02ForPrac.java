package Day7;

import java.util.Scanner;

public class C02ForPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
//		int i = 0 ;
//		int j = 0;
//		
//		while(i<h)
//			j=0;
//			while(j<(h-1)-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//		System.out.println();
//		i++;
		
		for(int i = 0; i<h; i++)
		{
			for(int j=0;j<(h-1)-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}

/*
			Scanner scan = new Scanner(System.in);
		int n = 0;
		
		for(n=2;n<=9;n++)
		{
			for(int i=1;i<=9;i++)
			{
				System.out.println(n + " x " + i + " = " + (n*i));
			}
			System.out.println();
		}





*/