import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// reader선언
		StringTokenizer st;

		// 총 금액
		int X = Integer.parseInt(br.readLine());
		// 물건의 종류
		int N = Integer.parseInt(br.readLine());
		// 계산한 값
		int sum = 0;

		if (X >= 1 && X <= 1000000000) {
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				// 각 물건의 가격 a
				int a = Integer.parseInt(st.nextToken());
				// 각 물건의 개수 b
				int b = Integer.parseInt(st.nextToken());

				if ((a >= 1 && a <= 1000000) && (b >= 1 && b <= 10)) {
					sum += a * b;
				} else {
					System.out.println("입력범위를 벗어났습니다.");
				}
			}
			// 만약,영수증의 총 금액과 계산한 값이 같다면?
			if (X == sum) {
				System.out.println("Yes");
			// 다르다면?
			} else {
				System.out.println("No");
			}
			br.close();
		} else {
			System.out.println("총 금액을 벗어났습니다.");
		}
	}
}