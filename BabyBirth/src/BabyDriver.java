import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class BabyDriver {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Baby baby = new Baby();
		Scanner scanner = new Scanner(System.in);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd",Locale.US);
		System.out.println("Enter baby name:");
		System.out.println("Enter birth Date:");
		String birthDate = scanner.nextLine();
		Date babyBirth = format.parse(birthDate);
		baby.setBirth(babyBirth);
		System.out.println(baby.convertoTimeZone("USA", "TEANECK"));
		System.out.println(baby.getBirthInOtherTimeZone("INDIA", "KADAPA"));
	}

}
