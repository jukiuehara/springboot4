<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>検索結果</h2>
<p>${fn:escapeXml(msg)}</p>
<table border="2">
<tr><th>id</th>
<th>name</th>
<th>price</th></tr>
<c:forEach items="${list}" var="product">
  <tr>
    <td>${fn:escapeXml(product.getProductId())}</td>
    <td>${fn:escapeXml(product.getProductName())}</td>
    <td>${fn:escapeXml(product.getPrice())}</td>
  </tr>
</c:forEach>
</table>
<a href="index">戻る</a>
</body>

</html>