import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;	
		score = sc.nextInt();	
		sc.close();
		if (0 <= score && score <= 100) {
			if(90 <= score && score <= 100) {
				System.out.println("A");
			} else if (80 <= score && score < 90) {
				System.out.println("B");
			} else if (70 <= score && score < 80) {
				System.out.println("C");
			} else if (60 <= score && score < 70) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		} else {
			System.out.println("점수를 잘못 입력했습니다.");
		}
	}
}