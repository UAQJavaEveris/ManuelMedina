package mx.com.everis.tallerjava.cliente;

import java.rmi.RemoteException;

import mx.com.everis.tallerjava.login.Login;
import mx.com.everis.tallerjava.service.Implementarlogin;
import mx.com.everis.tallerjava.service.ImplementarloginProxy;

public class principal {

	public static void main(String[] args) {
	Implementarlogin inface = new ImplementarloginProxy("http://localhost:8080/login/services/implementarlogin");
	Login obj = new Login();
	obj.setUsuario("admin");
	obj.setContra("root");
	try{
	obj = inface.validar(obj);
	if(obj.getEstatus()){
		System.out.println("Acceso permitido...");
	}else{
		System.out.println(obj.getMensaje());
	}
	}catch(RemoteException ex){
		ex.printStackTrace();
	}
	

	}

}
