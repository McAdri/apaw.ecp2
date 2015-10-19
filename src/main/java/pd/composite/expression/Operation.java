package pd.composite.expression;

public abstract class Operation extends Expresion{

	Expresion expresion1;
	Expresion expresion2;
	
	public Operation(Expresion expresion1,Expresion expresion2){
		this.expresion1 = expresion1;
		this.expresion2 = expresion2;
	}
	
	public abstract String toString();
}
