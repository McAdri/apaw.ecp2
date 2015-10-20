package pd.factoryMethod.naturalNumber;

public class NaturalNumberMain {

	public static void main(String[] args) {
        NaturalNumberManager manager = new NaturalNumberManager();
        
        manager.setNaturalNumberCreator(new NaturalNumberEnCreator());
        
        manager.createNaturalNumber(0);
        manager.write();
        
        manager.setNaturalNumberCreator(new NaturalNumberFrCreator());
        
        manager.createNaturalNumber(1);
        manager.write();
        
        manager.setNaturalNumberCreator(new NaturalNumberEsCreator());
        
        manager.createNaturalNumber(2);
        manager.write();
        
        manager.setNaturalNumberCreator(new NaturalNumberEnCreator());
        
        manager.createNaturalNumber(3);
        manager.write();
        
        manager.setNaturalNumberCreator(new NaturalNumberFrCreator());
        
        manager.createNaturalNumber(4);
        manager.write();
                
    }
}
