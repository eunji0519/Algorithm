import java.io.IOException;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) throws IOException {

		Calendar now = Calendar.getInstance();

		System.out.printf("%tF\n", now);

	}
}