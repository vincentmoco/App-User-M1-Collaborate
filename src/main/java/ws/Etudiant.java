package ws;

import org.apache.commons.lang3.ArrayUtils;

@webservice
public class Etudiant {
	String[][] listeEtudiant= {{"01", "Alan","Wake"},
			{"02", "Vincent", "Moco"}, 
			{"03", "Ricky", "Katumba"}, 
			{"04", "Kenny", "Dogu�"}};
	
	public String lister(String listeEtudiant) {
		return "Les �tudiants sont:" + listeEtudiant;
	}
	public String ajouterEtudiant(String idEtudiant, String prenomEtudiant, String nomEtudiant) {
		String[] newEtudiant={idEtudiant, prenomEtudiant, nomEtudiant};
		listeEtudiant = ArrayUtils.add(listeEtudiant, newEtudiant);
		return "Enregistrement Effectuer";
	}
	public String supprimerEtudiant(String idEtudiant, String prenomEtudiant, String nomEtudiant) {
		String[] rmEtudiant = {idEtudiant, prenomEtudiant, nomEtudiant}; 
		listeEtudiant = ArrayUtils.removeElement(listeEtudiant, rmEtudiant);
		return "Suppression r�ussie";
	}
	
}
