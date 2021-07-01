package ws;

import org.apache.commons.lang3.ArrayUtils;

import javax.jws.WebService;
import javax.jws.WebMethod;


@WebService
public class Note {
	static String[][] listeNote = {{"01","10"},{"02","12"}};
	
	@WebMethod
	public String listerNote() {
		return "Les associations etudiant-note sont:" + ArrayUtils.toString(listeNote);
	}
	
	@WebMethod
	public String ajouterNote(String idEtudiant, String note) {
		String[] newNote={idEtudiant, note};
		listeNote = ArrayUtils.add(listeNote, newNote);
		return "Enregistrement Effectuer";
	}
	
	@WebMethod
	public String modifierNote(String idEtudiant, String note) {
		String[] newNote={idEtudiant, note};
		for (String[] element : listeNote) {
			if (element[0].equals(idEtudiant)) {
				listeNote = ArrayUtils.removeElement(listeNote, element);
				listeNote = ArrayUtils.add(listeNote, newNote);
			}
		}
		return "Enregistrement Effectuer";
	}
	
	@WebMethod
	public String supprimerNote(String idEtudiant, String note) {
		String[] rmNote = {idEtudiant, note}; 
		
		for (String[] element : listeNote) {
			String elementString = element.toString();
			if (elementString.equals(rmNote.toString())) {
				listeNote = ArrayUtils.removeElement(listeNote, rmNote);
			}
		}
		return "Suppression reussie";
	}
	
}
