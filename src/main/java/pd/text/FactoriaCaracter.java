package pd.text;

import java.util.HashMap;

public class FactoriaCaracter {

	private static FactoriaCaracter factoriaCaracter;
	private HashMap<Character, Caracter> mapCaracter;
	
	public FactoriaCaracter() {
        this.mapCaracter = new HashMap<>();
    }
    
    public static FactoriaCaracter getFactoria(){
    	if(factoriaCaracter==null){
    		factoriaCaracter = new FactoriaCaracter();
    	}
    	return factoriaCaracter;
    }

    public Caracter get(char caracter) {
       if(!mapCaracter.containsKey(caracter)){
    	   mapCaracter.put(caracter, new Caracter(caracter));
       }
	   return mapCaracter.get(caracter);

    }
}
