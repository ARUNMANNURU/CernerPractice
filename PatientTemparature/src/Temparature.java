/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class Temparature {
	
	private double ftemp;
	private Location location;
	public double getFtemp(){
		return ftemp;
	}
	public void setFtemp(double ftemp){
		this.ftemp = ftemp;
	}
	public Location getLocation(){
		return location;
	}
	public void setLocation(Location location){
		this.location = location;
	}
	public double getConvertCelsiusToFahrenheitTemp(){
		return ((9/5.0)*(ftemp+32));
	}
	public double getConvertFahrenheitToCelsiusTemp(){
		return ((5/9.0)*(ftemp-32));
	}
	public boolean patientFever(){
		return (ftemp > 39.0) ? true : false;
	}
}
