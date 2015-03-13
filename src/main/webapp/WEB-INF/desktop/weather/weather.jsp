<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>form.jsp</title>
</head>
<body>
	<hr>
	<h1>날씨 정보 조회 경과</h1>
	<hr>
	${requestScope.weather.current.temperature} <br> 
	${requestScope.weather.current.skycode} <br> 
	${requestScope.weather.current.skytext} <br>
	
	${requestScope.weather.forecasts[0].low} <br> 
	${requestScope.weather.forecasts[0].high} <br> 
	${requestScope.weather.forecasts[0].date} <br>
</body>
</html>

</body>
</html>