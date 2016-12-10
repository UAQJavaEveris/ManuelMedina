package mx.com.everis.tallerjava.login;
import java.io.Serializable;

public class login<bolean> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2651147903209487667L;
	private String usuario;
	private String contra;
	private String mensaje;
	private bolean estatus;
	
	public bolean getEstatus() {
		return estatus;
	}
	public void setEstatus(bolean estatus) {
		this.estatus = estatus;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		this.contra = contra;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
