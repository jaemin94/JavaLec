package Day19;

import java.util.HashMap;
import java.util.Map;

class AuthCollector
{
	private static Map<String,Integer> map = new HashMap();
	// CRUD
	
	public static void Insert(String id, Integer pw) // 삽입
	{
		if(map.containsKey(id))
		{
			System.out.println("동일한 ID 값이 존재합니다. Insert 할 수 없습니다");
			return;
		}
		map.put(id, pw);
	}
	
	public static void ShowInfo() // 조회
	{
		for(String key : map.keySet())
		{
			System.out.println(key + " " + map.get(key));
		}
	}
	
	public static void ShowInfo(String id) // 오버로딩
	{
		
	}
	
	public static void Remove(String id) // 삭제
	{
		map.remove(id);
	}
	public static void Update(String id, Integer pw) // 수정 or 변경 -> 삭제 + 삽입이 같이 일어난다
	{	
		map.replace(id,pw);
	}
	
}


public class C04MapMain {

	public static void main(String[] args) {
		
		AuthCollector.Insert("aaa", 111);
		AuthCollector.Insert("bbb", 222);
		AuthCollector.Insert("ccc", 333);
		AuthCollector.Insert("eee", 444);
		AuthCollector.Insert("ccc", 555); // 키가 중복되어 삽입 되지 않는다.
		
		AuthCollector.Update("ccc", 1234);
		AuthCollector.ShowInfo();
		
		
	}

}
