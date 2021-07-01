package ws;

public class EtudiantProxy implements ws.Etudiant {
  private String _endpoint = null;
  private ws.Etudiant etudiant = null;
  
  public EtudiantProxy() {
    _initEtudiantProxy();
  }
  
  public EtudiantProxy(String endpoint) {
    _endpoint = endpoint;
    _initEtudiantProxy();
  }
  
  private void _initEtudiantProxy() {
    try {
      etudiant = (new ws.EtudiantServiceLocator()).getEtudiant();
      if (etudiant != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)etudiant)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)etudiant)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (etudiant != null)
      ((javax.xml.rpc.Stub)etudiant)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.Etudiant getEtudiant() {
    if (etudiant == null)
      _initEtudiantProxy();
    return etudiant;
  }
  
  public java.lang.String ajouterEtudiant(java.lang.String idEtudiant, java.lang.String prenomEtudiant, java.lang.String nomEtudiant) throws java.rmi.RemoteException{
    if (etudiant == null)
      _initEtudiantProxy();
    return etudiant.ajouterEtudiant(idEtudiant, prenomEtudiant, nomEtudiant);
  }
  
  public java.lang.String lister() throws java.rmi.RemoteException{
    if (etudiant == null)
      _initEtudiantProxy();
    return etudiant.lister();
  }
  
  public java.lang.String supprimerEtudiant(java.lang.String idEtudiant) throws java.rmi.RemoteException{
    if (etudiant == null)
      _initEtudiantProxy();
    return etudiant.supprimerEtudiant(idEtudiant);
  }
  
  
}