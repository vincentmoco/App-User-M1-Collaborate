<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
					<a href="" class="navbar-brand"> CRUD-SAP | Annuaire  </a>
				</div>
				<ul class="navbar-nav">
					<li><a href="<%=request.getContextPath()%>/new" class="btn btn-outline-success me-2"><span class="spinner-grow spinner-grow-sm" role="status" aria-hidden="true"></span> Ajouter un nouveau utilisateurs </a></li>
				</ul>
			</nav>
		</header>
		<hr>

		<div class="row">
			<div class="container col-md-10">
				<h3 class="text-center">Liste des utilisateurs</h3>
				<hr>
				
				<table class="table table-bordered">
					<thead>
						<tr>
							<th> Id </th>
							<th> Nom & prénom </th>
							<th> Adresse mail </th>
							<th> Pays de residence </th>
							<th>Actions</th>
						</tr>
					</thead>
					<tbody>
					
						<c:forEach var="user" items="${listUser}">
	
							<tr>
								<td><c:out value="${user.id}" /></td>
								<td><c:out value="${user.name}" /></td>
								<td><c:out value="${user.email}" /></td>
								<td><c:out value="${user.country}" /></td>
								<td>
									<a href="edit?id=<c:out value='${user.id}' />" class="btn btn-info"> Mettre à jour </a>  
									<a href="delete?id=<c:out value='${user.id}' />" class="btn btn-danger"> Supprimer </a>
								</td>
							</tr>
						</c:forEach>
			
					</tbody>
	
				</table>
			</div>
		</div>
	</body>
</html>