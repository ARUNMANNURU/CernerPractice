import java.util.Date;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class Medication {
	
	private String name;
	private Date start;
	private Date end;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setStart(Date start){
		this.start = start;
	}
	public Date getStart(){
		return start;
	}
	public void setEnd(Date end){
		this.end = end;
	}
	public Date getEnd(){
		return end;
	}
}
