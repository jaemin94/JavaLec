package Day17;

public class C02ArrayIdxExceptionMain {

	public static void main(String[] args) {
		
		try 
		{
		int[] arr = {10,20,30};
		
		for(int i = 0; i<4; i++)
		{
			System.out.println(arr[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("Hello World");
		System.out.println("Hello World");

	}

}
