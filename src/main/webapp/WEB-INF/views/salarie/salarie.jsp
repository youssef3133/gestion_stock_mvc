<%@ include file="/WEB-INF/views/includes/includes.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin 2 - Blank</title>

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
					<h1 class="h3 mb-4 text-gray-800">
						<fmt:message key="common.dashboard" />
					</h1>

					<div class="card-body">
						<div class="table-responsive">
							<div id="dataTable_wrapper"
								class="dataTables_wrapper dt-bootstrap4">
								<div class="row">
									<div class="col-sm-12 col-md-6">
										<div class="dataTables_length" id="dataTable_length">
											<label>Show <select name="dataTable_length"
												aria-controls="dataTable"
												class="custom-select custom-select-sm form-control form-control-sm"><option
														value="10">10</option>
													<option value="25">25</option>
													<option value="50">50</option>
													<option value="100">100</option></select> entries
											</label>
										</div>
									</div>
									<div class="col-sm-12 col-md-6">
										<div id="dataTable_filter" class="dataTables_filter">
											<label>Search:<input type="search"
												class="form-control form-control-sm" placeholder=""
												aria-controls="dataTable"></label>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-12">
										<table class="table table-bordered dataTable" id="dataTable"
											width="100%" cellspacing="0" role="grid"
											aria-describedby="dataTable_info" style="width: 100%;">
											<thead>
												<tr role="row">
													<th class="sorting_asc" tabindex="0"
														aria-controls="dataTable" rowspan="1" colspan="1"
														aria-sort="ascending"
														aria-label="Name: activate to sort column descending"
														style="width: 72px;"><fmt:message key="common.id" /></th>
													<th class="sorting_asc" tabindex="0"
														aria-controls="dataTable" rowspan="1" colspan="1"
														aria-sort="ascending"
														aria-label="Name: activate to sort column descending"
														style="width: 72px;"><fmt:message key="common.nom" /></th>
													<th class="sorting" tabindex="0" aria-controls="dataTable"
														rowspan="1" colspan="1"
														aria-label="Position: activate to sort column ascending"
														style="width: 103px;">prenom</th>
													<th class="sorting" tabindex="0" aria-controls="dataTable"
														rowspan="1" colspan="1"
														aria-label="Office: activate to sort column ascending"
														style="width: 54px;">Numero de securite social</th>
													<th class="sorting" tabindex="0" aria-controls="dataTable"
														rowspan="1" colspan="1"
														aria-label="Office: activate to sort column ascending"
														style="width: 54px;">Action</th>

													<fmt:message key="common.salaries.liste" />
													<div class="row">
														<div class="col-lg-12">
															<ol class="breadcrumb">
															
																<li><a href="<c:url value = "/salarie/nouveau" />" />
																<i class="fas fa-plus"><fmt:message
																			key="common.ajouter" />&nbsp;&nbsp;&nbsp;</i>
																</li>
																
																<li><a href="#" />
																	<i class="fas fa-plus"><fmt:message	key="common.importer" />&nbsp;&nbsp;&nbsp;</i>
																</li>
																
																<li><a href="#" />
																	<i class="fas fa-plus"><fmt:message	key="common.exporter" />&nbsp;&nbsp;&nbsp;</i>
																</li>
															</ol>
														</div>
													</div>
												</tr>
											</thead>
											<tfoot>
												<tr>
													<th rowspan="1" colspan="1"><fmt:message
															key="common.id" /></th>
													<th rowspan="1" colspan="1"><fmt:message
															key="common.nom" /></th>
													<th rowspan="1" colspan="1">Prenom</th>
													<th rowspan="1" colspan="1">Numero securite social</th>
													<th rowspan="1" colspan="1">Action</th>

												</tr>
											</tfoot>
											<tbody>
												
												<c:forEach var="salarie" items="${salaries}">
													<tr role="row" class="odd">
														<td class="sorting_1">${salarie.getId()}</td>
														<td>${salarie.getNom()}</td>
														<td>${salarie.getPrenom()}</td>
														<td>${salarie.getNumSecu()}</td>
														<td><c:url value="/salarie/modifier/${salarie.getId()}" var="urlModifier"> </c:url>
															<a href="${urlModifier}"><i class="fa fa-edit"> &nbsp; </i></a> 
														</td>
														<td>
															<c:url value="/salarie/supprimer/${salarie.getId()}" var="urlSupprimer"></c:url>
															<a href="${urlSupprimer}" data-toggle="modal" data-target="#myModal${salarie.getId()}"><i class="fa fa-trash-alt"> &nbsp; </i></a>
															
															<div class="modal fade" id="myModal${salarie.getId()}" tabindex="-1" role="dialog">
															  <div class="modal-dialog" role="document">
															    <div class="modal-content">
															      <div class="modal-header">
															        <h5 class="modal-title">Suppression</h5>
															        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
															          <span aria-hidden="true">&times;</span>
															        </button>
															      </div>
															      <div class="modal-body">
															        <p>Etes-vous s�r de vouloir supprimer ce salarie ?</p>
															      </div>
															      <div class="modal-footer">
															        <a href="${urlSupprimer}"><i class="fa fa-trash-alt"> &nbsp; </i><fmt:message>common.supprimer</fmt:message></a>
															        <button type="button" class="btn btn-secondary" data-dismiss="modal">Annuler</button>
															      </div>
															    </div>
															  </div>
															</div>
														</td>														
													</tr>
												</c:forEach>
											</tbody>
										</table>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-12 col-md-5">
										<div class="dataTables_info" id="dataTable_info" role="status"
											aria-live="polite">Showing 1 to 10 of 57 entries</div>
									</div>
									<div class="col-sm-12 col-md-7">
										<div class="dataTables_paginate paging_simple_numbers"
											id="dataTable_paginate">
											<ul class="pagination">
												<li class="paginate_button page-item previous disabled"
													id="dataTable_previous"><a href="#"
													aria-controls="dataTable" data-dt-idx="0" tabindex="0"
													class="page-link">Previous</a></li>
												<li class="paginate_button page-item active"><a
													href="#" aria-controls="dataTable" data-dt-idx="1"
													tabindex="0" class="page-link">1</a></li>
												<li class="paginate_button page-item "><a href="#"
													aria-controls="dataTable" data-dt-idx="2" tabindex="0"
													class="page-link">2</a></li>
												<li class="paginate_button page-item "><a href="#"
													aria-controls="dataTable" data-dt-idx="3" tabindex="0"
													class="page-link">3</a></li>
												<li class="paginate_button page-item "><a href="#"
													aria-controls="dataTable" data-dt-idx="4" tabindex="0"
													class="page-link">4</a></li>
												<li class="paginate_button page-item "><a href="#"
													aria-controls="dataTable" data-dt-idx="5" tabindex="0"
													class="page-link">5</a></li>
												<li class="paginate_button page-item "><a href="#"
													aria-controls="dataTable" data-dt-idx="6" tabindex="0"
													class="page-link">6</a></li>
												<li class="paginate_button page-item next"
													id="dataTable_next"><a href="#"
													aria-controls="dataTable" data-dt-idx="7" tabindex="0"
													class="page-link">Next</a></li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
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
