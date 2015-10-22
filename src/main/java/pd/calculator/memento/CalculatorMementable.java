package pd.calculator.memento;

import pd.calculator.Calculator;

public class CalculatorMementable extends Calculator implements Mementable<MementoCalculadora>{

	@Override
	public MementoCalculadora createMemento() {
		return new MementoCalculadora(getTotal());
	}

	@Override
	public void restoreMemento(MementoCalculadora memento) {
		this.setTotal(memento.getValue());		
	}

}
