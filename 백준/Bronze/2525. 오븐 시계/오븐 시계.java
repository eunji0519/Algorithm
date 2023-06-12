import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		sc.close();

		if ((A >= 0 && A <= 23) && (B >= 0 && B <= 59) && (C >= 0 && C <= 1000)) {

			// 모두 분으로 고치기
			int MM = 60 * A + B;
			
			MM += C;
			A = (MM / 60) % 24;
			B = MM % 60;

			System.out.println(A + " " + B);
		} else {
			System.out.println("시각 입력이 잘못되었습니다.");
		}
	}
}