/**
 * Note.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public interface Note extends java.rmi.Remote {
    public java.lang.String ajouterNote(java.lang.String idEtudiant, java.lang.String note) throws java.rmi.RemoteException;
    public java.lang.String modifierNote(java.lang.String idEtudiant, java.lang.String note) throws java.rmi.RemoteException;
    public java.lang.String listerNote() throws java.rmi.RemoteException;
    public java.lang.String supprimerNote(java.lang.String idEtudiant, java.lang.String note) throws java.rmi.RemoteException;
}
