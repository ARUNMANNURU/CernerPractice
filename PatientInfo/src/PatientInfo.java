/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class PatientInfo {
	
	private String firstName;
	private String lastName;
	private String patientAddress;
	private String patientPhoneNumber;
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the patientAddress
	 */
	public String getPatientAddress() {
		return patientAddress;
	}
	/**
	 * @param patientAddress the patientAddress to set
	 */
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	/**
	 * @return the patientPhoneNumber
	 */
	public String getPatientPhoneNumber() {
		return patientPhoneNumber;
	}
	/**
	 * @param patientPhoneNumber the patientPhoneNumber to set
	 */
	public void setPatientPhoneNumber(String patientPhoneNumber) {
		this.patientPhoneNumber = patientPhoneNumber;
	}
	public void setFirstName(String name){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	

}
