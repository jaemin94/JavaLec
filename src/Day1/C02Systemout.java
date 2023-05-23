package Day1;

public class C02Systemout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//단축키
		//복사 : ctrl + alt + 방향키
		//주석 : ctrl + /
		
		//System: OS
		//System.out : OS가 관리하는 표준 출력 스트림
		
		
	//System.out.print()
	//ESCAPE문자 : 그래픽문자 -> 알파벳, 숫자, 기호 등 / 제어문자 -> esc, alt 등
	// \n : 개행,줄바꿈
	// \b : 빽스페이스
	// \t : 탭길이(기본 8칸) 민크 커서 이동
//		System.out.print("Hello World\n");
//		System.out.print("Hello World\n");
//		System.out.print("Hello World\n");
//		System.out.print("He\tlloWorld");

	//System.out.printf()
		//format : 형식 , 서식
		//%d : 10진수 정수 서식문자
		//%f : 10진수 실수 서식문자
		//%c : 한문자 서식문자
		//%s : 문자명 서식문자
		
		System.out.printf("%d %d %d\n", 10,20,30);
		System.out.printf("%f %f %f\n",10.1,20.1,30.1);
		System.out.printf("%c %c %c\n", 'A', 'B', 'C');
		System.out.printf("%s %s %s\n","This is","String","Test");
		System.out.printf("%d,%s : %d\n",1,"국어",100);

	//System.out.println()
		
	}

}





