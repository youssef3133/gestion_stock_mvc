<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">


<meta charset="ISO-8859-1">
<title>Ajouter un salarie</title>

<!-- Custom fonts for this template-->
<link
	href="<%=request.getContextPath()%>/resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link
	href="<%=request.getContextPath()%>/resources/css/sb-admin-2.min.css"
	rel="stylesheet">
</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!--Appel du menu left-->
		<%@ include file="/WEB-INF/views/menu_left/leftMenu.jsp"%>

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!--Appel du menu TOP-->
				<%@ include file="/WEB-INF/views/menu_top/topMenu.jsp"%>


				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<h1 class="h3 mb-4 text-gray-800">Ajouter un salarie</h1>
					
					<div id="content">
						<div class="row">
							<div class="col-lg-12">
								<div class="panel panel-primary">
									<div class="panel panel-heading"><fmt:message key="salaries.nouveau"/></div>
								</div>
								<div class="panel-body">
								</div>
							</div>
						</div>
					</div>

					<div class="p-5">
						<div class="text-center">
							<h1 class="h4 text-gray-900 mb-4"><fmt:message key="salaries.ajouter"/></h1>
						</div>
						<c:url value="/salarie/enregistrer" var ="urlEnregistrer"/>
						<f:form modelAttribute="salarie" action="${urlEnregistrer}" method="post">
						<f:hidden path="id"/>
							<div class="form-group row">
							
								
									<label><fmt:message key="common.nom"/></label>
									<f:input type="text" path="nom" class="form-control form-control-user" placeholder="Nom"/>
								
								
								
									<label><fmt:message key="common.prenom"/></label>
									<f:input type="text" path="prenom" class="form-control form-control-user" placeholder="prenom"/>
								

									<label><fmt:message key="common.numSecu"/></label>
									<f:input type="number" path="numSecu" class="form-control form-control-user" placeholder="numSecu"/>
								
							</div>
							<button type="submit" class="btn btn-primary btn-user btn-block"><i class="fa fa-save">Enregistrer</i></button>
<!-- 							<button type="reset" class="btn btn-primary btn-user btn-block"><i class="fa fa-save">Annuler</button> -->
							<a href="${pageContext.servletContext.contextPath}/salarie" class="btn btn-danger btn-user btn-block"><i class="fa fa-save">Annuler</i></a>
							
						</f:form>
						<hr>
					</div>

				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<footer class="sticky-footer bg-white">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright &copy; Your Website 2019</span>
					</div>
				</div>
			</footer>
			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="login.html">Logout</a>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script
		src="<%=request.getContextPath()%>/resources/vendor/jquery/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script
		src="<%=request.getContextPath()%>/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script
		src="<%=request.getContextPath()%>/resources/js/sb-admin-2.min.js"></script>

</body>
</html>