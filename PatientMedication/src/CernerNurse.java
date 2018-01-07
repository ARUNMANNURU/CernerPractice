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
public class CernerNurse {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Medication medication = new Medication();
		Scanner scanner = new Scanner(System.in);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd",Locale.US);
		System.out.println("Enter patient name:");
		String name = scanner.nextLine();
		medication.setName(name);
		System.out.println("Start Date:");
		String start = scanner.nextLine();
		Date startDate = format.parse(start);
		medication.setStart(startDate);
		System.out.println("End Date:");
		String end = scanner.nextLine();
		Date endDate = format.parse(end);
		medication.setEnd(endDate);
		System.out.println("Frequency of medication to"+medication.getName()+"is between"+medication.getStart()+"and"+medication.getEnd());
	}
}