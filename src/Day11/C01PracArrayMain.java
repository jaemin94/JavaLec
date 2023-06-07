package Day11;

import java.util.Arrays;
import java.util.Scanner;

public class C01PracArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		// 5개의 정수값을 입력 받아 int형 배열에 저장하고
		// 최대값, 최소값, 전체합을 출력합니다.
				
		System.out.println("정수를 입려하세요 : ");
		int[] num = new int[5];
		for(int i = 0 ; i < num.length; i++)
			num[i] = scan.nextInt();

		System.out.println(Arrays.stream(num).max().getAsInt());
		System.out.println(Arrays.stream(num).min().getAsInt());
		System.out.println(Arrays.stream(num).sum());
		
//		  for(int i = 0 ; i < num.length; i++)
//		  {
//		  	num[i] = scan.nextInt();
//		  	
//		  	int max = num[0];
//		  	int min = num[0];
//		  	int sum = 0;
//		  	for(int el : num)
//		  	{
//		  		if(max<el)
//		  		{
//		  			max = el;
//		  		}
//		  		if(min > el)
//		  		{
//		  			min = el;
//		  		}
//		  		sum+=el;
//		  }
//		  System.out.println("최대값 : " + max );
//		  System.out.println("최소값 : " + min );
//		  System.out.println("합계값 : " + sum );
		  
		  
		 
		
		
}
}


/*
  
  	최대값 : for(int i : num)
			 {
				 if(num[0] > num[1] && num[0] > num[2] && num[0] > num[3] && num[0] > num[4])
					{
					max=num[0];
					}
				else if(num[1] > num[0] && num[1] > num[2] && num[1] > num[3] && num[1] > num[4])
				{
					max=num[1];
		
				}	
				else if(num[2] > num[0] && num[2] > num[1] && num[2] > num[3] && num[2] > num[4])
				{
					max=num[2];
		
				}
				else if(num[3] > num[0] && num[3] > num[2] && num[3] > num[1] && num[3] > num[4])
				{
					max=num[3];
		
				}
				else
				{
					max = num[4];		
				}
				System.out.println(i);
		}
			System.out.println("최대값은 : " + max);

 
 	최소값 : for(int i : num)
			{
				if(num[0] < num[1] && num[0] < num[2] && num[0] < num[3] && num[0] < num[4])
					{
					min=num[0];
					}
				else if(num[1] < num[0] && num[1] < num[2] && num[1] < num[3] && num[1] < num[4])
				{
					min=num[1];
		
				}
				else if(num[2] < num[0] && num[2] < num[1] && num[2] < num[3] && num[2] < num[4])
				{
					min=num[2];
		
				}
				else if(num[3] < num[0] && num[3] < num[2] && num[3] < num[1] && num[3] < num[4])
				{
					min=num[3];
		
				}
				else
				{
					min = num[4];		
				}
			}
			System.out.println("최소값은 : " + min);
 
 
 	합계 : for(int i=0; i < num.length;i++)
			{
				sum+=num[i];
		}
			System.out.println("전체합은 : " + sum);
 
 
 
 
 
 
 
 
 
 */
