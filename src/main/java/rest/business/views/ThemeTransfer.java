package rest.business.views;

public class ThemeTransfer {

	private String name;
	private double avg;
	
	public ThemeTransfer(String name, double avg){
		this.name = name;
		this.avg = avg;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
}
