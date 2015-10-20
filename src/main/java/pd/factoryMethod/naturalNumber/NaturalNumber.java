package pd.factoryMethod.naturalNumber;

public abstract class NaturalNumber {

	private int value;
	protected String[] textValue;
	
	public NaturalNumber(int value) {
        this.setValue(value);
    }

    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
    	assert value>=0;
        this.value = value;
    }
    
    public void add(int value) {
        this.setValue(this.value + value);
    }
    
    public String getTextValue() {
        if (this.value < textValue.length) {
            return this.textValue[this.value];
        } else {
            return "???";
        }
    }
}