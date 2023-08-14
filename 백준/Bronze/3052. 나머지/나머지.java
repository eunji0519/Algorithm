import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			
			int N = Integer.parseInt(br.readLine());
			int mod = N % 42;
			
			set.add(mod);
			
		}

		System.out.println(set.size());
	}

}