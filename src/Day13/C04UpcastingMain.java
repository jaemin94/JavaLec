package Day13;

class Super
{
	int n1;
}

class Sub extends Super
{
	int n2;
}

public class C04UpcastingMain {

	public static void main(String[] args) {
		
	Super ob1 = new Super();
	ob1.n1 = 10;
	Sub ob2 = new Sub();
	ob2.n1 =20;
	ob2.n2 =20;
	
	// UPcasting
	// 상위클래스형 참조변수 = 하위객체
	Super ob3 = new Sub();
	ob3.n1 = 10;
	
	// DownCasting
	// 하위클래스형 참조변수 = 상위클래스형 객체
	// 강제 형변환
	Sub down = (Sub)ob3;
	down.n2 = 20;
	
	Sub a = (Sub) new Super();
	
	
	}

}
