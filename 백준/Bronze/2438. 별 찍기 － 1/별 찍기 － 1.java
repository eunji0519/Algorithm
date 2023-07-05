import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());

		br.close();

		if ((N >= 1) && (N <= 100)) {
			for (int i = 1; i <= N; i++) { // 행 만들기
				for (int j = 1; j <= i; j++) { // 열 만들기
					bw.write("*");
				}
				bw.write("\n");
			 }
			bw.flush();
			bw.close();
		 } else {
			 System.out.println("입력범위를 벗어났습니다");
		 }
	}
}