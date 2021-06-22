/**
 * EtudiantServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class EtudiantServiceLocator extends org.apache.axis.client.Service implements ws.EtudiantService {

    public EtudiantServiceLocator() {
    }


    public EtudiantServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EtudiantServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Etudiant
    private java.lang.String Etudiant_address = "http://localhost:8080/webServiceEtudiant/services/Etudiant";

    public java.lang.String getEtudiantAddress() {
        return Etudiant_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EtudiantWSDDServiceName = "Etudiant";

    public java.lang.String getEtudiantWSDDServiceName() {
        return EtudiantWSDDServiceName;
    }

    public void setEtudiantWSDDServiceName(java.lang.String name) {
        EtudiantWSDDServiceName = name;
    }

    public ws.Etudiant getEtudiant() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Etudiant_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEtudiant(endpoint);
    }

    public ws.Etudiant getEtudiant(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.EtudiantSoapBindingStub _stub = new ws.EtudiantSoapBindingStub(portAddress, this);
            _stub.setPortName(getEtudiantWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEtudiantEndpointAddress(java.lang.String address) {
        Etudiant_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.Etudiant.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.EtudiantSoapBindingStub _stub = new ws.EtudiantSoapBindingStub(new java.net.URL(Etudiant_address), this);
                _stub.setPortName(getEtudiantWSDDServiceName());
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
        if ("Etudiant".equals(inputPortName)) {
            return getEtudiant();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws", "EtudiantService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws", "Etudiant"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Etudiant".equals(portName)) {
            setEtudiantEndpointAddress(address);
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
