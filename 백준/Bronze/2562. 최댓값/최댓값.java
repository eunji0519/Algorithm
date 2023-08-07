import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[9];
		int max = arr[0];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Integer.parseInt(br.readLine());

			if (arr[i] > max) {
				max = arr[i];
				index = i + 1;
			}

		}

		br.close();

		System.out.println(max);
		System.out.println(index);

	}

}