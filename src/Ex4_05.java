import java.util.Scanner;

public class Ex4_05 {

	public static void main(String[] args) {
		
		System.out.print("점수를 입력하세요: ");
		
		Scanner z = new Scanner(System.in);
		int grade = z.nextInt();
		
		switch(grade / 10) {
			case 10: //10이 없으면 다음 9가 실행됨.
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
		}
		
		/*
		 * if (grade >= 90) { System.out.println("A"); }
		 * 
		 * else if (grade >= 80) { System.out.println("B"); } else if (grade >= 70) {
		 * System.out.println("C"); } else if (grade >= 60) { System.out.println("D"); }
		 * 
		 * else { System.out.println("F"); }
		 */		

	}

}
