/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class Allergies {

	private String allergyName;
	private Severity allergySeverity;
	private Symptoms allergySymptoms;
	public String getAllergyName(){
		return allergyName;
	}
	public void setAllergyName(){
		this.allergyName = allergyName;
	}
	public Severity getAllergySeverity(){
		return allergySeverity;
	}
	public void setAllergySeverity(){
		this.allergySeverity = allergySeverity;
	}
	public Symptoms setAllergySymptoms(){
		return allergySymptoms;
	}
	public void getAllergySymptoms(){
		this.allergySymptoms = allergySymptoms;
	}
}
