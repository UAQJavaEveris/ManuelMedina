package mx.com.everis.tallerjava.service;
import mx.com.everis.tallerjava.login.login;

/*
 * service
 */
public class implementarlogin implements interfacelogin{

	@Override
	public login validar(login obj) {
		login obj2 = new login();
		
		if(obj.getUsuario().equals("admin") && obj.getContra().equals("root")){
			obj2.setMensaje("Contrase�a valida...");
			obj2.setEstatus(true);
		}else{
			obj2.setMensaje("El usuario o la contrase�a no coinciden...");
			obj2.setEstatus(false);
		}
		return obj2;
	}

}
