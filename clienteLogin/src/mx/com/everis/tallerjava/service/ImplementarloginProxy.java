package mx.com.everis.tallerjava.service;

public class ImplementarloginProxy implements mx.com.everis.tallerjava.service.Implementarlogin {
  private String _endpoint = null;
  private mx.com.everis.tallerjava.service.Implementarlogin implementarlogin = null;
  
  public ImplementarloginProxy() {
    _initImplementarloginProxy();
  }
  
  public ImplementarloginProxy(String endpoint) {
    _endpoint = endpoint;
    _initImplementarloginProxy();
  }
  
  private void _initImplementarloginProxy() {
    try {
      implementarlogin = (new mx.com.everis.tallerjava.service.ImplementarloginServiceLocator()).getimplementarlogin();
      if (implementarlogin != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)implementarlogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)implementarlogin)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (implementarlogin != null)
      ((javax.xml.rpc.Stub)implementarlogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mx.com.everis.tallerjava.service.Implementarlogin getImplementarlogin() {
    if (implementarlogin == null)
      _initImplementarloginProxy();
    return implementarlogin;
  }
  
  public mx.com.everis.tallerjava.login.Login validar(mx.com.everis.tallerjava.login.Login obj) throws java.rmi.RemoteException{
    if (implementarlogin == null)
      _initImplementarloginProxy();
    return implementarlogin.validar(obj);
  }
  
  
}