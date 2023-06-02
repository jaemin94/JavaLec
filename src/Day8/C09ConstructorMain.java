package Day8;

// 클래스 선언지 생성자 함수를 하나도 명시하지 않았을때는 디폴트 생성자가 주입이 되나
// 생성자 함수가 하나 이상 명시가 되면 디폴트 생성자는 주입 되지 않는다.

class C09Simple{
	
	C09Simple()
	{
		
	}
	C09Simple(int x)
	{
		
	}
	
}

public class C09ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C09Simple obj1 = new C09Simple(); 
		
	}

}
