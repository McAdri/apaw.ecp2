package pd.visitor;

import pd.factoryMethod.naturalNumber.NaturalNumberMain;

public class Visitor2 extends Visitor{

	private int numA = 0;
	private int numB = 0;
	
	@Override
	public void visitElementA(ElementA e) {
		this.numA++;
	}

	@Override
	public void visitElementB(ElementB e) {
		this.numB++;
	}

	public int getAs() {
		return numA;
	}

	public int getBs() {
		return numB;
	}

}
