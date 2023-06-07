package Day12;


class C02Simple
{
	int n1;
	static int n2;
	
	void func1()
	{
		n1 = 10;
		n2 = 20;
	}
	
	static void func2()
	{
		//n1 = 10; // n1 은 객체 생성 이후 접근가능한 멤버변수 , 컴파일 오휴
		n2 = 20;
	}
		
	C02Simple()
	{
		
	}
	
	C02Simple(int n1, int n2)
	{
		this.n1 = n1;
		this.n2 = n2;
	}
}

public class C02Static {

	public static void main(String[] args) {
		
		C02Simple ob1 = new C02Simple();
		
	}

}
