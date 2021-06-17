<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>CRUD-SOAP</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
	</head>
	<body>
		<header>
			<nav class="navbar navbar-dark bg-dark" style="background-color: #343a40!important">
				<div>
					<a href="" class="navbar-brand"> CRUD-SOAP | Créer un utilisateur  </a>
				</div>
	
				<ul class="navbar-nav">
					<li><a href="<%=request.getContextPath()%>/list" class="btn btn-outline-success me-2"><span class="spinner-grow spinner-grow-sm" role="status" aria-hidden="true"></span>Voir tous les utilisateurs</a></li>
				</ul>
			</nav>
		</header>
		<br>
		<div class="container col-md-8">
			<div class="card">
				<div class="card-body">
					<c:if test="${user != null}">
						<form action="update" method="post">
					</c:if>
					<c:if test="${user == null}">
						<form action="insert" method="post">
					</c:if>
					<caption>
						<h2>
							<c:if test="${user != null}"> Edit User </c:if>
							<!--  	<c:if test="${user == null}"> Créer un utilisateur </c:if> -->
						</h2>
					</caption>
					<c:if test="${user != null}">
						<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
					</c:if>
	
					<fieldset class="form-group">
						<label>Nom et prenom</label> <input type="text" value="<c:out value='${user.name}' />" class="form-control" name="name" required="required">
					</fieldset>
	
					<fieldset class="form-group">
						<label>Adresse mail</label> <input type="text" value="<c:out value='${user.email}' />" class="form-control" name="email">
					</fieldset>
	
					<fieldset class="form-group">
						<label>Pays de residence</label> <input type="text" value="<c:out value='${user.country}' />" class="form-control" name="country">
					</fieldset>
	
					<button type="submit" class="btn btn-info"> Soumettre <span class="spinner-grow spinner-grow-sm" role="status" aria-hidden="true"></span></button>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>