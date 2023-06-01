package Day6;

public class C04Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ranking = 2;
		char medalColor;
		switch(ranking) // if문과 elseif 문과 비슷하다. switch문은 다중분기문이라 불린다.
		{				// case 에는 상수만 들어간다
		case 1:
			medalColor = 'G';
			System.out.println("메달색상 : G");
			break;
		case 2:
			medalColor = 'S';
			System.out.println("메달색상 : S");
			break;
		case 3:
			medalColor = 'B';
			System.out.println("메달색상 : B");
			break;
		default:
			medalColor = 'C';
			System.out.println("메달색상 : C");
		}
		System.out.println(ranking + " 등 메달의 색은 "+medalColor + " 입니다.");
		
		
	}

}
