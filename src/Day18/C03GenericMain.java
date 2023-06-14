package Day18;

class Tiger
{
	String name;
	Tiger(String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return "Tiger [name=" + name + "]";
	}
}

class Panda
{
	Panda(String name)
	{
		this.name = name;
	}
	String name;
	public String toString()
	{
		return "Panda [name=" + name + "]";
	}
}


public class C03GenericMain {

	public static <T> void PrintInfo(T[] array)
	{
		for(T el : array)
		{
			System.out.println(el.toString());
		}
	}
	
	public static  void PrintInfo2(Object[] array)
	{
		for(Object el : array)
		{
			if(el instanceof Tiger)
			{
				Tiger down = (Tiger)el;
				System.out.println(el);
			}
			else if(el instanceof Panda)
			{
				Panda down = (Panda)el;
				System.out.println(el);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Tiger[] arr1 = {new Tiger(" 호랑이"),new Tiger(" 호랑이"),new Tiger(" 호랑이")};
		
		PrintInfo(arr1);
		System.out.println();
		Panda[] arr2 = {new Panda("렛서팬더"),new Panda("중국팬더")};
		PrintInfo(arr2);
		System.out.println();
		
		Object[] arr3 = {new Panda("중국팬더"), new Tiger("시베리안호랑이"), new Panda("래서팬더")};
		PrintInfo2(arr3);
		
	}

}
