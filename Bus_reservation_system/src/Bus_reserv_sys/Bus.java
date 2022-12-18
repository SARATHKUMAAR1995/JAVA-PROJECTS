package Bus_reserv_sys;

public class Bus {
	private int busno;
	private boolean ac;
	private int capacity;
	
	
	public Bus(int busno, boolean ac, int capacity) {
		super();
		this.busno = busno;
		this.ac = ac;
		this.capacity = capacity;
	}
	public int getBusno() {
		return busno;
	}
	public void setBusno(int busno) {
		this.busno = busno;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	void displaybusinfo() {
		System.out.println("Bus No   : "+ busno+'\n'+"Ac       : "+
	ac+'\n'+"Capacity : "+capacity);
		System.out.println("-------------------------------------------------");
	}
	

}
