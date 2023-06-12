package Day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C07FormatterMain {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("YYYY/MM/DD 입력: ");
		String ymd = sc.next();
		
		// 포매터 객체 생성 (입력 받을때의 포매팅)
		SimpleDateFormat fmtin = new SimpleDateFormat("yyyy/MM/dd");
		
		System.out.println(ymd);
		Date date = fmtin.parse(ymd);
		System.out.println(date);
		
		
		// 포매터 객체 생성 (입력 받을때의 포매팅)
				SimpleDateFormat fmtOut = new SimpleDateFormat("yyyy-MM-dd");
				System.out.println(fmtOut.format(date));
		
		
	}

}
