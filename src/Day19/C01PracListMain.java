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
	
	public static List<String> func2(List<String> list)
	{
		ArrayList<String> strings = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
        // 사용자로부터 문자열 입력 받기
        System.out.println("문자열을 입력하세요 (종료: 빈 문자열):");
        String input = scan.nextLine();
        while (!input.isEmpty()) {
            strings.add(input);
            input = scan.nextLine();
        }

        // 길이가 5보다 큰 문자열 출력
        System.out.println("길이가 5보다 큰 문자열:");
        for (String str : strings) {
            if (str.length() >= 5) {
                System.out.println(str);
            }
        }
		// ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 출력하는 코드를 작성하세요.
		// func2 합수 환성하기
		return strings;
	}
	
	public static void func3()
	{
		List<Integer> numbers = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요 (종료: 0):");
        int input = scan.nextInt();

        while (input != 0) {
            if (input % 2 == 0) {
                numbers.add(input);
            }
            input = scan.nextInt();
        }

        System.out.println("입력된 짝수 값:");
        for (int number : numbers) {
            System.out.println(number);
        }
		// ArrayList에 있는 정수값을 입력받는데 전달되는 수중에 짝수의 값만 입력받는 코드를 작성화세요
		// func3 합수 환성하기
	}
	
	public static void main(String[] args) {
		List<String> li = new ArrayList();
		func1(li);
		func2(li);
		func3();		
		
	}

}

/*
	1:	for(String el : list)
		{
			if(el.length()>5
			{
				System.out.println(el);
			}
		}
		
	2:	Scanner scan = new Scanner(System.in);
		String el = null;
		System.out.println("입력하세요: ");
		while(true)
		{
			el = scan.next();
			if(el.length()>5)
				break;
			System.out.println("다시 입력: ");
		}
		
		list.add(el);
		
		
	3:	List<Integer> list = new ArrayList();
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		
		int n = 0;
		
		 while(true)
		 {
		 	n = sc.nextInt();
		 	if(n%2 ==0)
		 	break;
		 }
		 list.add(n);
		





















*/
