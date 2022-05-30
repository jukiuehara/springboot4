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
<p>${fn:escapeXml(msg)}</p>
<form:form action="result" modelAttribute="product">
<label>product_id</label>
<form:input path="id"/>
<form:button>検索</form:button>

</form:form>

</head>
<body>

</body>
</html>