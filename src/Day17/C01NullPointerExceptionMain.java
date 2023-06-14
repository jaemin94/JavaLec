package Day17;

public class C01NullPointerExceptionMain {

	public static void main(String[] args) {
		
		
		try 
		{
			String str = null;
			System.out.println(str.toString());
		}
		catch(NullPointerException ex)
		{
//			System.out.println("예외발생");
//			System.out.println(ex.getCause()); // 예외 원인
//			System.out.println(ex.toString());	// 예외객체 메시지
//			System.out.println(ex.getStackTrace()); // 예외객체 식별 정보			
			ex.printStackTrace();
		}
		
		System.out.println("실행해야되는 코드1");
		System.out.println("실행해야되는 코드2");
	}

}
