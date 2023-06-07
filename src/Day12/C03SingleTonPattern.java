package Day12;


// 디자인패턴
class Company
{
	int n1;
	int n2;
	
	public String toString()
	{
		return "[n1= " + n1 +" n2= "+ n2 + "]";
	}
	
	// 싱글톤 패턴 구조
	private static Company Instance = new Company();
	// 생성자의 private으로 설정 -> 외부에서 객체생성 불가능
	private Company()
	{
		n1 = 100;
		n2 = 200;
	}
	public static Company getInstance()
	{
		if(Instance == null)
			Instance = new Company();
		return Instance;
	}
}

public class C03SingleTonPattern {

	public static void main(String[] args) {
			
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		
		System.out.println(com1.toString());
		System.out.println(com2.toString());

	}

}
