package Day19;

import java.util.HashMap;
import java.util.Map;

class A
{
	public String toString()
	{
		return "A 객체";
	}
}

class B
{
	public String toString()
	{
		return "B 객체";
	}
}

class C
{
	public String toString()
	{
		return "C 객체";
	}
}


public class C05MapMain {

	public static void main(String[] args) {
		
		Map<String,Object> map = new HashMap();
		
		map.put("k1", new A());
		map.put("k2", new B());
		map.put("k3", new C());

		for(String key : map.keySet())
		{
			if(map.get(key) instanceof A)
			{
				A down = (A)map.get(key);
				System.out.println(down);
			}
			else if (map.get(key) instanceof B)
			{
				B down = (B)map.get(key);
				System.out.println(down);
			}
			else if (map.get(key) instanceof C)
			{
				C down = (C)map.get(key);
				System.out.println(down);
			}
		}
		
	}

}
