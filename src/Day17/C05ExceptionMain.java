package Day17;

public class C05ExceptionMain {

	public static void main(String[] args) {
		
//		String str = null;
//		String r = str.toString(); // Null 예외
//		int[] arr = {10,20,30};
//		arr[5] = 100;			   // 배열 예외
//		System.out.println(15/0);  // 산술 예외
		
		try
		{
			String str = null;
			String r = str.toString(); // Null 예외
			int[] arr = {10,20,30};
			arr[5] = 100;			   // 배열 예외
			System.out.println(15/0);  // 산술 예외
		}
//		catch(NullPointerException ex)
//		{
//			System.out.println("NULL 예외");
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Array 예외");
//		}
//		catch(ArithmeticException x)
//		{
//			System.out.println("산술 예외");
//		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
