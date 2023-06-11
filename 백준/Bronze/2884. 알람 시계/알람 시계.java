import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		sc.close();

		// H 와 M의 범위 정하기
		if ((H >= 0 && H <= 23) && (M >= 0 && M <= 59)) {
			// 만약 M < 45 면, 시간과 분이 바껴야 함.
			if (M < 45) {
				// 0시 면 23으로 내려가야함.
				if (H == 0) {
					H = 23;
				} else {
					H -= 1;
				}
				M = 60 - (45 - M);
				System.out.println(H + " " + M);
			} else {
				M -= 45;
				System.out.println(H + " " + M);
			}
		} else {
			System.out.println("시간 입력을 잘못했습니다.");
		}
	}
}