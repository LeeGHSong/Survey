package model;
import java.io.Serializable;
public class SAmholder implements Serializable{
	private static final long serialVersionUID = 1L;
	private long single;
	private long divorced;
	private long married;
	private long widowed;
	private long mtotal;
	public long getSingle() {
		return this.single;
	}

	public void setSingle(long single) {
		this.single = single;
	}	
	public long getDivorced() {
		return this.divorced;
	}

	public void setDivorced(long divorced) {
		this.divorced = divorced;
	}	
	public long getMarried() {
		return this.married;
	}

	public void setMarried(long married) {
		this.married = married;
	}	
	public long getWidowed() {
		return this.widowed;
	}

	public void setWidowed(long widowed) {
		this.widowed = widowed;
	}		
	public long getMtotal() {
		return this.mtotal;
	}

	public void setMtotal(long mtotal) {
		this.mtotal = mtotal;
	}	
}
