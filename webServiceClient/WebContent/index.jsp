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
				<div class="input-field">
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
					<select form="etudiant" name="options-list">
						<option value="ajouter">ajouter un étudiant</option>
						<option value="lister">lister les étudiants</option>
						<option value="supprimer">supprimer un étudiant</option>
					</select>
					<input form="etudiant" type="submit" value="OK">
				</div>
    		</div>
    		<div class="contenu">
       			<h3>Services Notes</h3> 
	   			<hr>
	   			<div class="input-field">
	   				<form action="http://localhost:8080/webServiceClient//NoteServlet" method="POST" id="note" name="note">
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
				 	<select form="note" name="options-list">
						<option value="ajouter">ajouter une note</option>
						<option value="lister">lister les notes</option>
						<option value="modifier">modifier une note</option>
						<option value="supprimer">supprimer une note</option>
					</select>
					<input form="note" type="submit" value="OK">
				</div>
    		</div>
    		<button id="btnInformations">Informations</button>
    		<div id="myWindow" class="info-window">
    			<div class="info-window-content">
    				<span class="close-info">&times;</span>
    				<p>Bienvenue sur le client de notre service web</p>
    				<p>Les paramètres des différents services</p>
    				<p>Ajouter Etudiant : nom, prénom, identifiant</p>
    				<p>Supprimer Etudiant : identifiant</p>
    				<p>lister les Etudiant : Aucun paramètres</p><br>
    				<p>Ajouter Note : note, identifiant</p>
    				<p>Supprimer Note : note, identifiant</p>
    				<p>Modifier Note : note, identifiant</p>
    			</div>
    		</div>
    	</div>
    	<script src="app.js"></script>
	</body>
</html>