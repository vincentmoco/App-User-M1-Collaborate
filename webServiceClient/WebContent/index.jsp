<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Accueil</title>
		<link rel="stylesheet" href="app.css">
	</head>
	<body>
    	<div class="container">
    		<div class="contenu">
        		<h3>Services Etudiants</h3> 
				<hr>
				<div>
					<form action="http://localhost:8080/webServiceClient//EtudiantServlet" method="POST" id="etudiant" name="etudiant">
						<div>
							<label>nom Etudiant
								<input type="text" name="nomEtudiant">
							</label>
						</div>
						<div>
							<label>prénom Etudiant
								<input type="text" name="prenomEtudiant">
							</label>
						</div>
						<div>
							<label>numéro Etudiant
								<input type="text" name="idEtudiant">
							</label>
						</div>
					</form>
				</div>
				<div>
				 <input form="etudiant" type="submit" name="ajouterEtudiant" value="ajouterEtudiant">
				 <input form="etudiant" type="submit" name="supprimerEtudiant" value="supprimerEtudiant">
				 <input form="etudiant" type="submit" name="modifierEtudiant" value="modifierEtudiant">
				</div>
    		</div>
    		<div class="contenu">
       			<h3>Services Notes</h3> 
	   			<hr>
	   			<div>
	   				<form>
						<div>
							<label>numéro Etudiant
								<input type="text" name="idEtudiant">
							</label>
						</div>
						<div>
							<label>note Etudiant
								<input type="text" name="noteEtudiant">
							</label>
						</div>							
					</form>
	   			</div>
	   			<div>
				 <input form="" type="submit" name="ajouterNote" value="ajouterNote">
				 <input form="" type="submit" name="supprimerNote" value="supprimerNote">
				 <input form="" type="submit" name="modifierNote" value="modifierNote">
				</div>
    		</div>
    	</div>
	</body>
</html>