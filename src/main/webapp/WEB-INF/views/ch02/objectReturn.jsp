<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
		<!-- Bootstrap 5를 위한 외부 라이브러리 설정 -->
		<!-- Latest compiled and minified CSS -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
		<!-- Latest compiled JavaScript -->
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
		
		<!-- jQuery -->
		<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
		
		<!-- 사용자 정의 자바스크립트 -->
		<script>
		const handleBtn1 = () => {
		  console.log("handleBtn1");
		  $.ajax({
		    url: "objectReturnJson1",
		    method: "get",
		    success: function(data) {
		      console.log(data);
		    }
		  });
		}
		
		const handleBtn2 = ()=>{
		  console.log("handleBtn2");	
		  $.ajax({
		    url: "objectReturnJson2",
		    method: "get",
		    success: function(data) {
		      console.log(data);
		    }
		  });
		}
		</script>
</head>
<body>

	<div class="d-flex flex-column "><!-- viewport height -->
		<%@include file="/WEB-INF/views/common/header.jsp"%>
		<div class="flex-grow-1 m-2">
			<div class="d-flex row">
				<div class="col-md-4">
					<%@include file="/WEB-INF/views/common/menu.jsp"%>				
				</div>
				
				<div class="col-md-8">
					<!-- #################################### -->
					<div class="card">
						<div class="card-header">Object 리턴</div>
						<div class="card-body">
						<button onClick="handleBtn1()" class="btn btn-info btn-sm">파일 정보를 JSON으로 받기1</button>
						<button onClick="handleBtn2()" class="btn btn-danger btn-sm">파일 정보를 JSON으로 받기2</button>
						</div>
					</div>
					<!-- #################################### -->
				</div>
			</div>
		</div> 
	</div>
</body>
</html>