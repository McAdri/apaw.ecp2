package pd.state.connection;

public class EstadoParado extends EstadoConexion{

	public EstadoParado(Conexion conexion){
		super(conexion);
	}
	
	@Override
	public void parar(){
	}
	
	@Override
	public void iniciar(){	
		this.conexion.setEstado(new EstadoPreparado(this.conexion));
	}
	
	@Override
	public Estado getEstado(){
		return Estado.PARADO;
	}
}
