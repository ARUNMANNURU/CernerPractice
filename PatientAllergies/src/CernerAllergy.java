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
public class CernerAllergy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Patient patient = new Patient();
		List<Allergies> patientAllergies = new ArrayList<Allergies>();
		System.out.println("Enter patient Name:");
		String name = scanner.nextLine();
		patient.setName(name);
		System.out.println("Patient:"+patient.getName());
		System.out.println("Enter patient Age:");
		int age = scanner.nextInt();
		patient.setAge(age);
		System.out.println("PatientAge:"+patient.getAge());
		System.out.println("Enter patient address:");
		String address = scanner.next();
		patient.setAddress(address);
		System.out.println("Patient Address:"+patient.getAddress());
		System.out.println("Enter allergy name:");		
	}

}
