package pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {

	private NaturalNumberCreator naturalNumberCreator;
	private NaturalNumber naturalNumber;
	
	public void setNaturalNumberCreator(NaturalNumberCreator naturalNumberCreator){
		this.naturalNumberCreator = naturalNumberCreator;
	}
	
	public void createNaturalNumber(int value){
		assert naturalNumberCreator !=null;
		this.naturalNumber = naturalNumberCreator.createNaturalNumber(value);
	}
	
	public void write(){
		System.out.println(naturalNumber.getTextValue());
	}
}
