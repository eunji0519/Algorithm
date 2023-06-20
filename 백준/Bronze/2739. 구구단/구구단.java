import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// int로 형변환 까지해서 변수에 넣음
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		// 입력 값 제한하기
		if (N > 0 && N < 10) {
			// 구구단 만들기
			for (int i=1; i < 10; i++) {
				// 결과값 담기
				int result = N*i;
				System.out.println(N + " * " + i + " = " + result);
			}
		} else {
			System.out.println("입력범위를 벗어났습니다.");
		}
	}
}