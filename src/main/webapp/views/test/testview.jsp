<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String basePath = request.getContextPath() + "/";
%>

<html>
<head>
	<meta charset="utf-8"/>
	<title>登录</title>
	<script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
	<link rel="stylesheet" href="https://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css">
</head>

<body style="background:rgb(249,247,247);">
<div class="htmleaf-container">
	<div class="container">
		<ol class="breadcrumb" style="background:rgb(249,247,247);">
			<li><a href="#">登录页面</a></li>
		</ol>
		<div class="row">
			<div class="col-lg-6">
				<form id="reForm" method="post" class="form-horizontal" action="<%=basePath%>loginHandler/userLogin">
					<div class="form-group">
						<label class="col-lg-3 control-label">用户:</label>
						<div class="col-lg-7">
							<input type="text" class="form-control" id="userNm" name="userNm" value="" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-lg-3 control-label">密码:</label>
						<div class="col-lg-7">
							<input type="text" class="form-control" id="passwd" name="passwd" value="" />
						</div>
					</div>

					<div class="form-group">
						<div class="col-lg-9 col-lg-offset-3">
							<button type="button" class="btn btn-primary" onclick="reSubmit();">登录</button>
							<button type="button" class="btn btn-primary" onclick="reSet();">重置</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
	function reSet(){
		$("#reForm").reset();
	}
	function reSubmit () {
		$("#reForm").submit();
	}
</script>
</body>
</html>
