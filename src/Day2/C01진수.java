package Day2;

public class C01진수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 128 64 32 16 8 4 2 1 = 8비트 값 (255)

		// 2진수 -> 10진수
		// 10101100 = 128+32+8+4 = 174
		// 10011010 = 128+16+8+2 = 154
		// 01101001 = 64+32+8+1 = 105
		// 10010010 = 128+16+4 = 148

		// 10진수 -> 2진수
		// 192 = 11000000
		// 224 = 11100000
		// 252 = 11111100
		// 12 = 00001100
		// 15 = 00001111

		System.out.printf("2진수 : %d\n", 0b10101010); // 2진수( 0b : 2진수를 의미하는 접두사
		System.out.printf("10진수 : %d\n", 173); // 10진수
		System.out.printf("10진수 : %d\n", 0255); // 8진수(0:8진수를 의미하는 접두사)
		System.out.printf("10진수 : %d\n", 0xAD); // 16진수 (0x:16진수를 의미하는 접두사)

		System.out.printf("8진수 : %o\n", 173); // 10진수
		System.out.printf("8진수 : %o\n", 0255); // 8진수(0:8진수를 의미하는 접두사)
		System.out.printf("8진수 : %o\n", 0xAD); // 16진수 (0x:16진수를 의미하는 접두사)

		System.out.printf("16진수 : %x\n", 173); // 10진수
		System.out.printf("16진수 : %x\n", 0255); // 8진수(0:8진수를 의미하는 접두사)
		System.out.printf("16진수 : %x\n", 0xAD); // 16진수 (0x:16진수를 의미하는 접두사)

	}

}
