package pd.calculator.memento;

public class MementoCalculadora {

	private int value;
	
	public MementoCalculadora(int value){
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
