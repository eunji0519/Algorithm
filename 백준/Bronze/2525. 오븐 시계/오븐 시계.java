import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		sc.close();

		// 주어지는 것: 시작 시각 / 굽는 시간(분)
		// 계산 식: 시작 시간 + 굽는 시간 = 끝나는 시간

		// 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)
		if ((A >= 0 && A <= 23) && (B >= 0 && B <= 59) && (C >= 0 && C <= 1000)) {
			// 1. 일단, 분을 시간, 분으로 나눠서 다 더하기
			A += C / 60;
			B += C % 60;
			// 분을 먼저 if문을 사용한 이유는 분이 60을 초과해서 시간이 24시 이상이 되었을 경우 0으로 초기화 되어야 하기 때문
			// 분을 더했을 때 60 이상이면,
			if (B >= 59) {
				// 시간에 +1 하기
				A += 1;
				// 60을 넘었기 때문에 한번 더 나눠서 분을 가져와야 함
				B %= 60;
				// 시간에 +1을 했을 때 24이상이면 0으로 초기화 해야하기 때문
				if (A >= 24) {
					A -= 24;
				}
				// 분을 더했을 때 60이 아니라면
			} else {
				// 시간만 더했을 때, 24이상일 수 있기 때문
				if (A >= 24) {
					A -= 24;
				}
			}
			System.out.println(A + " " + B);
		} else {
			System.out.println("시각 입력이 잘못되었습니다.");
		}
	}
}