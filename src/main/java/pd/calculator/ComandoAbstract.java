package pd.calculator;

public abstract class ComandoAbstract implements Comando{

	protected Calculator calculator;
	
	public ComandoAbstract(Calculator calculator){
		this.calculator = calculator;
	}
}
