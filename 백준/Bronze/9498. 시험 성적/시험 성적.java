import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int score;
		
		score = sc.nextInt();
		
		sc.close();

		if (0 <= score && score <= 100) {
			int divScore = score/10;
			if(divScore == 9 || divScore == 10) {
				System.out.println("A");
			} else if (divScore == 8) {
				System.out.println("B");
			} else if (divScore == 7) {
				System.out.println("C");
			} else if (divScore == 6) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		} else {
			System.out.println("점수를 잘못 입력했습니다.");
		}
		
	}
}