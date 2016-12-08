package model;
import java.io.Serializable;
public class SAgholder implements Serializable{
	private static final long serialVersionUID = 1L;
	private long male;
	private long female;
	private long other;
	private long gtotal;
	
	public long getMale() {
		return this.male;
	}

	public void setMale(long male) {
		this.male = male;
	}	
	public long getFemale() {
		return this.female;
	}

	public void setFemale(long female) {
		this.female = female;
	}	
	public long getOther() {
		return this.other;
	}

	public void setOther(long other) {
		this.other = other;
	}	
	public long getGtotal() {
		return this.gtotal;
	}

	public void setGtotal(long gtotal) {
		this.gtotal = gtotal;
	}	

}
