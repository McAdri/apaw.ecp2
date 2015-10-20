package pd.state.connection;

public class Conexion {
	
    private EstadoConexion estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = new EstadoCerrado(this);
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estado.getEstado();
    }

    public void setEstado(EstadoConexion estado) {
        this.estado = estado;
    }
    
    public void abrir(){
    	this.estado.abrir();
    }
    
    public void cerrar(){
    	this.estado.cerrar();
    }
    
    public void parar(){
    	this.estado.parar();
    }
    
    public void iniciar(){
    	this.estado.iniciar();
    }
    
    public void enviar(String string){
    	this.estado.enviar(string);
    }
    
    public void recibir(int num){
    	this.estado.recibir(num);
    }
}
