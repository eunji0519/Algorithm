import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		/* 필요 변수 */
		// 테스트 케이스 T
		// 입력받는 값 A
		// 입력받는 값 B
		
		/* 로직 */
		// 1. 테스트 케이스 T 만큼 for문을 도는 가?
		// 2. T만큼 입력이 가능한가?
		// 3. A와 B의 값이 범위 안에 들어오는 가?
		// 4. A + B를 더한다.
		// 5. 더한 결과값이 순차적으로 나오는 가?

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine());

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int result = 0;

			if ((A > 0 && A < 10) && (B > 0 && B < 10)) {
				result = A + B;
			} else {
				System.out.println("입력범위를 초과했습니다.");
			}
			
			bw.write(result + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();

	}
}