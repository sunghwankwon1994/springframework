<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="accordion" id="accordionExample">
	<div class="accordion-item">
		<h2 class="accordion-header">
			<button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">Ch01. 개발 환경 구축</button>
		</h2>
		<div id="collapseOne" class="accordion-collapse collapse show" data-bs-parent="#accordionExample">
			<div class="accordion-body">
				<ul>
					<li><a href="${pageContext.request.contextPath}">프로젝트 설정</a></li>
					<li><a href="${pageContext.request.contextPath}/ch01/content">공통 레이아웃 구성</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="accordion-item">
		<h2 class="accordion-header">
			<button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">Ch02.</button>
		</h2>
		<div id="collapseTwo" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
			<div class="accordion-body">
				<ul>
					<li><a href="${pageContext.request.contextPath}/ch02/getMethod?chNum=ch02">GET 방식</a></li>
					<li><a href="${pageContext.request.contextPath}/ch02/postMethod?chNum=ch02">POST 방식</a></li>
					<li><a href="${pageContext.request.contextPath}/ch02/modelAndViewReturn?chNum=ch02">ModelAndView 리턴</a></li>
					<li><a href="${pageContext.request.contextPath}/ch02/voidReturn?chNum=ch02">void 리턴</a></li>
					<li><a href="${pageContext.request.contextPath}/ch02/objectReturn?chNum=ch02">Object 리턴</a></li>
					<li><a href="${pageContext.request.contextPath}/ch02/testAuthInterceptor1?chNum=ch02">로그인 없이도 볼 수 있는 내용 </a></li>
					<li><a href="${pageContext.request.contextPath}/ch02/testAuthInterceptor2?chNum=ch02">로그인해야 볼 수 있는 내용 </a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="accordion-item">
		<h2 class="accordion-header">
			<button class="accordion-button ${chNum=='ch03'?'':'collapsed'}" type="button" data-bs-toggle="collapse" data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">Ch03.요청 매핑 메소드의 매개변수</button>
		</h2>
		<div id="collapseThree" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
			<div class="accordion-body">
				<ul>
					<li><a href="${pageContext.request.contextPath}/ch03/receiveParamData?param1=문자열&param2=5&param3=3.14&param4=true&param5=2024-04-15">GET 방식 데이터 얻기</a></li>
					<li><a href="${pageContext.request.contextPath}/ch03/postMethodForm">POST 방식 폼 데이터 얻기</a></li>
					<li><a href="${pageContext.request.contextPath}/ch03/requestParamAnnotation?param1=문자열&param2=5&param3=3.14&param4=true&param5=2024-04-15">@RequestParam</a></li>
					<li><a href="${pageContext.request.contextPath}/ch03/requestParamAnnotationRequired?param1=문자열&param2=5&param3=3.14&param4=true&param5=2024-04-15">@RequestParam의 required 속성</a></li>
					<li><a href="${pageContext.request.contextPath}/ch03/requestParamAnnotationDefaultValue?param1=문자열&param2=5&param3=3.14&param4=true&param5=2024-04-15">@RequestParam의 defaultValue 속성</a></li>
					<li><a href="${pageContext.request.contextPath}/ch03/typeChange?param1=문자열&param2=5&param3=3.14&param4=true&param5=2024-04-15">요청 파라미터의 값 타입 변환</a></li>
				</ul>
			</div>
		</div>
	</div>
</div>