<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<h2>検索条件を入力してください</h2>
<form:form action="result" modelAttribute="product">
<label>product_name</label>
<form:input path="name"/><br>
<label>price</label>
<form:input path="price"/><br>
<form:button name="param1">検索</form:button>
<form:button name="param2">登録</form:button>

</form:form>

</head>
<body>

</body>
</html>