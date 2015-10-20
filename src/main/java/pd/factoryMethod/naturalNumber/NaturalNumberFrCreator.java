package pd.factoryMethod.naturalNumber;

public class NaturalNumberFrCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber createNaturalNumber(int value){
		return new NaturalNumberFr(value);
	}
}
