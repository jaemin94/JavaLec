package Day11;

public class C03MultiArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[][] arr1 = new int[2][3];
//		arr1[0][0] = 10;
//		arr1[0][1] = 10;
//		arr1[0][2] = 10;
//		
//		arr1[1][0] = 11;
//		arr1[1][1] = 22;
//		arr1[1][2] = 33;
//		
//		// arr1 뒤에 [인덱스] 를 부여 하지 않으면 행의 길이를 알려준다.
//		System.out.println("행 개수 : " + arr1.length); 
//		
//		// arr1 뒤에 [인덱스] 를 부여 하면 행의 속한 열의길이를 알려준다.
//		System.out.println("0번행의 열 개수 : " + arr1[0].length);
//		System.out.println("1번행의 열 개수 : " + arr1[1].length);
		
		int[][] arr1 = {
				{10,20,30},
				{40,50,60,70},
				{80,90,100,110,120}
				};
		System.out.println("행 개수 : " + arr1.length);
		System.out.println("0번째 행 컬럼수 : " + arr1[0].length);
		System.out.println("1번째 행 컬럼수 : " + arr1[1].length);
		System.out.println("2번째 행 컬럼수 : " + arr1[2].length);
		
		
	}

}
