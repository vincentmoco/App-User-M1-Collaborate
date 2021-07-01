/**
 * Etudiant.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public interface Etudiant extends java.rmi.Remote {
    public java.lang.String supprimerEtudiant(java.lang.String idEtudiant) throws java.rmi.RemoteException;
    public java.lang.String lister() throws java.rmi.RemoteException;
    public java.lang.String ajouterEtudiant(java.lang.String idEtudiant, java.lang.String prenomEtudiant, java.lang.String nomEtudiant) throws java.rmi.RemoteException;
}
