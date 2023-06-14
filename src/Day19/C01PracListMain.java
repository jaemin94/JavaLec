package Day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01PracListMain {

	public static void func1(List<String> list)
	{
		list.add("AAAAAAAA");
		list.add("BB");
		list.add("CCCCCCC");
		// ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 출력하는 코드를 작성하세요.
		// fun1합수 환성하기
		for(String el : list)
		{
			try
			{
				char ch = el.charAt(5);
				if( ch > 5)
				{
					System.out.println(el);
				}
			}
			catch(StringIndexOutOfBoundsException ex)
			{
				System.out.print("");
			}
		}
		
		
	}
	
	public static List<String> func2()
	{
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String str = scan.nextLine();
	
		
		try
		{
			ch = str.charAt(5);
			if( ch > 5)
			{
				System.out.println(str);
			}
		}
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.print("");
		}
		// ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 출력하는 코드를 작성하세요.
		// func2 합수 환성하기
		return null;
	}
	
	public static void func3()
	{
		// ArrayList에 있는 정수값을 입력받는데 전달되는 수중에 짝수의 값만 입력받는 코드를 작성화세요
		// func3 합수 환성하기
	}
	
	public static void main(String[] args) {
		
		func1(new ArrayList());
		List<String> list = func2();
		func3();		
		
	}

}
