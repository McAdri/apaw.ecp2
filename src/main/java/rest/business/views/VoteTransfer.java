package rest.business.views;

public class VoteTransfer {

	private String name;
	private double num;
	
	public VoteTransfer(String name, double num){
		this.setName(name);
		this.setNum(num);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}
}
