import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int[] arg = new int[T];
		
		for (int i = 0; i < T; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			if ((A > 0 && A < 10) && (B > 0 && B < 10)) {
				arg[i] = A + B;
			} else {
				System.out.println("입력범위를 초과했습니다.");
			}

		}

		br.close();

		for (int i = 0; i < T; i++) {
			System.out.println(arg[i]);
		}

	}
}