package Day11;

import java.util.Scanner;

public class C03PracMultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5명의 학생에 국여수 점수를 입력 받아 2차원배열 저장
		// 각 학생의 국영수 점수의 합/평균 구하고
		// 각 과목당 합/평균 구해보세요
		
		int[][] score = new int[5][3];
		Scanner scan = new Scanner(System.in);
		System.out.println("국영수 점수 입력 : ");
		
		for(int i = 0; i<score.length ; i++) // score.length == 5
		{
			for(int j = 0 ; j<score[i].length; j++) // score[i].length == 각행의 길이
			{
				score[i][j]= scan.nextInt();
			}
		}
		// 각 학생별(행) 국영수 총합, 평균
		int stdsum[] = new int[score.length];
		double stdavg[] = new double[score.length];
		for(int i = 0; i<score.length ; i++) // score.length == 5
		{
			for(int j = 0 ; j<score[i].length; j++) // score[i].length == 각행의 길이
			{
				stdsum[i]+=score[i][j];
			}
			stdavg[i]=stdsum[i]/score[i].length;
		}
		
		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.printf("%d 번재 학생 점수 : %d %f\n", i,stdsum[i],stdavg[i]);
		}
		
		
		// 각 과목별(열) 국영수 총합, 평균
		int subjectsum[] = new int[3];
		double subjectavg[] = new double[3];
		
		for(int j = 0; j<score[j].length ; j++) 
		{
			for(int i = 0 ; i<score.length; i++) 
			{
				subjectsum[j] += score[i][j];
			}
			// 총합 구해지고 난 다음 평균계산
			subjectavg[j] = subjectsum[j]/score.length;
			
		}
			System.out.printf("국영수 총합 : %d %d %d \n", subjectsum[0],subjectsum[1],subjectsum[2]);
			System.out.printf("국영수 총합 : %f %f %f \n", subjectavg[0],subjectavg[1],subjectavg[2]);
				
	}

}
