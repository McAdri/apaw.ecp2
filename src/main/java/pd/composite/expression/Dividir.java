package pd.composite.expression;

public class Dividir extends Operation{

	public Dividir(Expresion expresion1,Expresion expresion2){
		super(expresion1,expresion2);
	}
	


	@Override
	public String toString() {
		return "(" + expresion1.toString() + "/" + expresion2.toString() + ")";
	}

	@Override
	public int operar() {
		return this.expresion1.operar() / this.expresion2.operar();
	}
}
