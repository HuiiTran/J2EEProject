<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.DB.DBConnect" %>
<%@ page import="java.sql.Connection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Phone store</title>
<%@include file="components/css.jsp"%>
<style type="text/css">
.back-img {
	back-ground: url("img/link");
	height: 50vh;
	width: 100%;
	background-repeat: no-repeat;
	background-size: cover;
}

.crd-ho:hover {
	background-color: #fcf7f7;
}
</style>
</head>
<body style="background-color: #f7f7f7">
	<%@include file="components/navbar.jsp"%>
	<div class="container-fluid back-img">
		<h2 class="text-center text-danger">Phone store</h2>
	</div>


	<%-- <% Connection conn =  DBConnect.getConn();
	out.println(conn);
	%> --%>
	
	<div class=container>
		<h3 class="text-center">Iphone</h3>
		<div class="row">
		
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="" style="width: 150px; height: 200px"
							class="img-thumblin" />
						<p>Test name</p>
						<p>Test price</p>
						<p>Phân loại</p>
						<div class="row text-center">
							<a href="" class="btn btn-danger btn-sml ml-1">Add Cart</a> <a
								href="" class="btn btn-danger btn-sml ml-1">View Details</a>
							<!-- <a href="" class="btn btn-danger btn-sml ml-1"></a>	 -->
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="text-center mt-1">
			<a href="" class="btn btn-danger btn-sm text-white">View all</a>
		</div>
	</div>
	<%@include file="components/footer.jsp" %>
</body>
</html>