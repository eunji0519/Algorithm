import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		// 읽기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 쓰기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 문자열 쪼개기 선언
		StringTokenizer st;
		
		// 테스트케이스 개수 
		int T = Integer.parseInt(br.readLine());
		
		// 테스트개수 범위 지정
		if (T <= 1000000) {
			
			// 테스트케이스 만큼 for문
			for (int i = 0; i < T; i++) {
				
				// 문자열 쪼개기
				st = new StringTokenizer(br.readLine());
				
				// 입력 변수 선언
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				
				// 입력 변수 범위 지정
				if ((A >= 1 && A <= 1000) && (B >= 1 && B <= 1000)) {
					
					// 합
					int sum = A + B;
					// 순번
					int cnt = i + 1;
					// 첫번째 합 출력하기
					bw.write("Case #"+ cnt +": " + sum + "\n");
					
				} else {
					
					System.out.println("입력범위를 벗어났습니다");
					
				}
			}
			// 입력 닫기
			br.close();
			// 나머지 출력하기
			bw.flush();
			// 출력 닫기
			bw.close();
			
		} else {

			br.close();
			System.out.println("테스트 범위를 벗어났습니다");

		}

	}

}