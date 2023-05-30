package JavaPrac;

import java.util.*;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("홀수 입력 : ");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			sc.close();

			// num이 7이라면?
			// 상단부(피라미드) 0~2행
			for (int i = 0; i < num / 2; i++) {
				// 공백 출력(3,2,1)
				for (int j = num / 2; j > i; j--)
					System.out.print(" ");
				// 별 출력(1,3,5)
				for (int j = 0; j < i * 2 + 1; j++)
					System.out.print("*");
				// 개행
				System.out.println();
			}

			// 하단부(역피라미드) 3~6행
			for (int i = num / 2; i >= 0; i--) {
				// 공백 출력(0,1,2,3)
				for (int j = num / 2; j > i; j--)
					System.out.print(" ");
				// 별 출력(7,5,3,1)
				for (int j = 0; j < i * 2 + 1; j++)
					System.out.print("*");
				// 개행
				System.out.println();
			}
			break;
		
		}
	}

}
