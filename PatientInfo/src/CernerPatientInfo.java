import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class CernerPatientInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientInfo  patientInfo = new PatientInfo();
		List<String> patientList = new ArrayList<String>();
		ArrayList<String> patientInfoList = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter patient First Name:");
		String firstName = scanner.nextLine();
		patientList.add(firstName);
		System.out.println("Enter patient Last Name:");
		String lastName = scanner.nextLine();
		patientList.add(lastName);
		System.out.println("Enter patient address:");
		String address = scanner.nextLine();
		patientList.add(address);
		System.out.println("Enter patient Phone Number:");
		String phoneNumber = scanner.nextLine();
		patientList.add(phoneNumber);
		patientInfoList.addAll(patientList);
		for(String list : patientInfoList){
			System.out.println(list);
		}
	}

}
