package Day19;

import java.util.ArrayList;
import java.util.List;

// CRUD (create , read, update, delete)
// 삽입
// 조회
// 수적
// 삭제

public class C01ListMain {

	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>(); // List 클래스는 상위 클래스다 // ArrayList는 List의 하위 클래스 UpCasting형태 
		
		// 추가, 삽입
		list1.add("HTML/CSS/JS");	// 0 index
		list1.add("React");
		list1.add("Redux");
		list1.add("Typescript");
		list1.add("Mysql");
		list1.add("Java");
		list1.add("JSP/Servlet");
		list1.add("SpringFramework");
		list1.add("SpringBoot");
		list1.add("Git/Github");
		list1.add("AWS");						// 중복을 허용한다
		list1.add("AWS");
		
		// 조회
		System.out.println("개수 확인 : " + list1.size());
		System.out.println("1 idx 의 값 : " + list1.get(1));
		System.out.println("1 idx 의 값 : " + list1.indexOf("Java"));
		
		// 삭제
		list1.remove(0); 		// 해당 인덱스 삭제
		list1.remove("Mysql");  // 해당 문자열 삭제
		System.out.println("------------------------");
		
		// 출력 확인
		for(String el : list1)
		{
			System.out.println(el);
		}
		
		// 전체 삭제
		list1.clear();
		
		
	}

}
