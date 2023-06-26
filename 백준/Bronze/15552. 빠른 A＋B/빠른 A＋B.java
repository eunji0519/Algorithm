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
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		if (T <= 1000000) {
			for (int i = 0; i < T; i++) {
				st = new StringTokenizer(br.readLine());
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				if ((A >= 1 && A <= 1000) && (B >= 1 && B <= 1000)) {
					int sum = A + B;
					bw.write(sum + "\n");
				} else {
					System.out.println("입력범위를 벗어났습니다");
				}
			}
			br.close();
			bw.flush();
			bw.close();
		}
	}
}