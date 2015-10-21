package pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class Escrito extends Componente{

	protected List<Componente> compenenteList;
	
	public Escrito(List<Componente> componenteList){
		super();
		this.compenenteList = componenteList;
	}
	
	public Escrito(){
		compenenteList = new ArrayList<Componente>();
	}
}
