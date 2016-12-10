/**
 * ImplementarloginServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.everis.tallerjava.service;

public class ImplementarloginServiceLocator extends org.apache.axis.client.Service implements mx.com.everis.tallerjava.service.ImplementarloginService {

    public ImplementarloginServiceLocator() {
    }


    public ImplementarloginServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ImplementarloginServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for implementarlogin
    private java.lang.String implementarlogin_address = "http://localhost:8080/login/services/implementarlogin";

    public java.lang.String getimplementarloginAddress() {
        return implementarlogin_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String implementarloginWSDDServiceName = "implementarlogin";

    public java.lang.String getimplementarloginWSDDServiceName() {
        return implementarloginWSDDServiceName;
    }

    public void setimplementarloginWSDDServiceName(java.lang.String name) {
        implementarloginWSDDServiceName = name;
    }

    public mx.com.everis.tallerjava.service.Implementarlogin getimplementarlogin() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(implementarlogin_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getimplementarlogin(endpoint);
    }

    public mx.com.everis.tallerjava.service.Implementarlogin getimplementarlogin(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mx.com.everis.tallerjava.service.ImplementarloginSoapBindingStub _stub = new mx.com.everis.tallerjava.service.ImplementarloginSoapBindingStub(portAddress, this);
            _stub.setPortName(getimplementarloginWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setimplementarloginEndpointAddress(java.lang.String address) {
        implementarlogin_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mx.com.everis.tallerjava.service.Implementarlogin.class.isAssignableFrom(serviceEndpointInterface)) {
                mx.com.everis.tallerjava.service.ImplementarloginSoapBindingStub _stub = new mx.com.everis.tallerjava.service.ImplementarloginSoapBindingStub(new java.net.URL(implementarlogin_address), this);
                _stub.setPortName(getimplementarloginWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("implementarlogin".equals(inputPortName)) {
            return getimplementarlogin();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.tallerjava.everis.com.mx", "implementarloginService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.tallerjava.everis.com.mx", "implementarlogin"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("implementarlogin".equals(portName)) {
            setimplementarloginEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
