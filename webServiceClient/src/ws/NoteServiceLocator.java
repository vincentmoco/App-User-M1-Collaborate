/**
 * NoteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class NoteServiceLocator extends org.apache.axis.client.Service implements ws.NoteService {

    public NoteServiceLocator() {
    }


    public NoteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NoteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Note
    private java.lang.String Note_address = "http://localhost:8080/webServiceBackend/services/Note";

    public java.lang.String getNoteAddress() {
        return Note_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NoteWSDDServiceName = "Note";

    public java.lang.String getNoteWSDDServiceName() {
        return NoteWSDDServiceName;
    }

    public void setNoteWSDDServiceName(java.lang.String name) {
        NoteWSDDServiceName = name;
    }

    public ws.Note getNote() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Note_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNote(endpoint);
    }

    public ws.Note getNote(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.NoteSoapBindingStub _stub = new ws.NoteSoapBindingStub(portAddress, this);
            _stub.setPortName(getNoteWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNoteEndpointAddress(java.lang.String address) {
        Note_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.Note.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.NoteSoapBindingStub _stub = new ws.NoteSoapBindingStub(new java.net.URL(Note_address), this);
                _stub.setPortName(getNoteWSDDServiceName());
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
        if ("Note".equals(inputPortName)) {
            return getNote();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws", "NoteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws", "Note"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Note".equals(portName)) {
            setNoteEndpointAddress(address);
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
