
public class Ex4_06 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 10; i++) { // < 10 => 9까지
			System.out.println("구구단 " + i +"단");
			
			for(int j=1; j < 10; j++) { // < 10 => 9까지
				System.out.println(i + "X" + j + "=" + i*j);
			}
		}
	}

}
