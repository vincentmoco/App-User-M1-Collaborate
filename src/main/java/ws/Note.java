package ws;

import org.apache.commons.lang3.ArrayUtils;

@WebService
public class Note {
	String[][] listeNote = {{"01","10"},{"01","12"}};
	public String listerNote(String listeNote) {
		return "Les étudiants sont:" + listeNote;
	}
	public String ajouterNote(String idEtudiant, String listeNote, String note) {
		String[] newNote={idEtudiant, note};
		listeNote = ArrayUtils.add(listeNote, newNote);
		return "Enregistrement Effectuer";
	}
	public String supprimerNote(String idEtudiant, String listeNote) {
		String[] rmNote = {idEtudiant, listeNote}; 
		listeNote = ArrayUtils.removeElement(listeNote, rmNote);
		return "Suppression réussie";
	}
	
}
