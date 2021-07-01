package ws;

import org.apache.commons.lang3.ArrayUtils;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class Etudiant {
	static String[][] listeEtudiant= {{"01", "Alan","Wake"},
			{"02", "Vincent", "Moco"}, 
			{"03", "Ricky", "Katumba"}, 
			{"04", "Kenny", "Dogue"}};
	
	@WebMethod
	public String lister() {
		return "Les etudiants sont:" + ArrayUtils.toString(listeEtudiant);
	}
	
	@WebMethod
	public String ajouterEtudiant(String idEtudiant, String prenomEtudiant, String nomEtudiant) {
		String[] newEtudiant={idEtudiant, prenomEtudiant, nomEtudiant};
		listeEtudiant = ArrayUtils.add(listeEtudiant, newEtudiant);
		return "Enregistrement Effectuer";
	}
	
	@WebMethod
	public String supprimerEtudiant(String idEtudiant) {
		for (String[] element : listeEtudiant) {
			if (element[0].equals(idEtudiant)) {
				listeEtudiant = ArrayUtils.removeElement(listeEtudiant, element);
			}
		}
		return "Suppression reussie";
	}
	
}
