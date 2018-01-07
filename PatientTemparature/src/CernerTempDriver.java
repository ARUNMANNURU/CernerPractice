import java.util.Scanner;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class CernerTempDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patient patientHasFever = new Patient();
		Temparature patientTemparatureRecorded = new Temparature();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of Patient:");
		String patientName = scanner.nextLine();
		patientHasFever.setName(patientName);
		System.out.println("Enter age of patient:");
		int age = scanner.nextInt();
		patientHasFever.setAge(age);
		System.out.println("Enter address of patient:");
		String address = scanner.next();
		patientHasFever.setAddress(address);
		System.out.println("Enter temparature recorded");
		double patientTemparature = scanner.nextDouble();
		System.out.println("Opt which Location you have recorded the temparature:");
		System.out.println("1."+Location.ARMPIT+"\n"+"2."+Location.EAR+"\n"+"3."+Location.MOUTH);
		int part = scanner.nextInt();
		Location bodyPart=null;
		switch(part){
		case 1: bodyPart = Location.ARMPIT;
				break;
		case 2: bodyPart = Location.EAR;
				break;
		case 3: bodyPart = Location.MOUTH;
				break;
		}
		if(patientTemparatureRecorded.patientFever()){
			System.out.println(patientHasFever.getName()+" "+"suffereing from fever:"+"Temparature recorded at"+bodyPart);
		}else{
			System.out.println(patientHasFever.getName()+" "+"is Healthy:"+"Temparature recorded at"+bodyPart);
		}
		System.out.println("Temparature recorded in celsius"+patientTemparatureRecorded.getConvertFahrenheitToCelsiusTemp());
		System.out.println("Temparature recorded in Farheinheit"+patientTemparatureRecorded.getConvertCelsiusToFahrenheitTemp());
	}
}
