import java.util.Scanner;

public class Ex4_02 {

	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요: ");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " : 짝수");
		}
		else {
			System.out.println(num + " : 홀수");
		}
		
		System.out.println("\nOut of if");

	}

}
