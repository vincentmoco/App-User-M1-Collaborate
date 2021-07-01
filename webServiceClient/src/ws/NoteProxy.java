package ws;

public class NoteProxy implements ws.Note {
  private String _endpoint = null;
  private ws.Note note = null;
  
  public NoteProxy() {
    _initNoteProxy();
  }
  
  public NoteProxy(String endpoint) {
    _endpoint = endpoint;
    _initNoteProxy();
  }
  
  private void _initNoteProxy() {
    try {
      note = (new ws.NoteServiceLocator()).getNote();
      if (note != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)note)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)note)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (note != null)
      ((javax.xml.rpc.Stub)note)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.Note getNote() {
    if (note == null)
      _initNoteProxy();
    return note;
  }
  
  public java.lang.String ajouterNote(java.lang.String idEtudiant, java.lang.String note0) throws java.rmi.RemoteException{
    if (note == null)
      _initNoteProxy();
    return note.ajouterNote(idEtudiant, note0);
  }
  
  public java.lang.String supprimerNote(java.lang.String idEtudiant, java.lang.String note0) throws java.rmi.RemoteException{
    if (note == null)
      _initNoteProxy();
    return note.supprimerNote(idEtudiant, note0);
  }
  
  public java.lang.String listerNote() throws java.rmi.RemoteException{
    if (note == null)
      _initNoteProxy();
    return note.listerNote();
  }
  
  public java.lang.String modifierNote(java.lang.String idEtudiant, java.lang.String note0) throws java.rmi.RemoteException{
    if (note == null)
      _initNoteProxy();
    return note.modifierNote(idEtudiant, note0);
  }
  
  
}