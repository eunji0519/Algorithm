import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 반복할 갯수 선언
		int N = Integer.parseInt(br.readLine());

		// StringTokenizer로 입력
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 최소, 최대 선언
		int min = 0;
		int max = 0;
		
        // 기본 값 입력
		int a = Integer.parseInt(st.nextToken());
		
		min = a;
		max = a;

		// N만큼 반복
		for (int i = 0; i < N-1; i++) {

			// 비교 값 입력
			int b = Integer.parseInt(st.nextToken());

			// 최소, 최대 비교
			if (min > b)
				min = b;

			if (max < b)
				max = b;
		}

		// 결과 출력
		bw.write(min + " " + max);
		bw.close();

	}

}