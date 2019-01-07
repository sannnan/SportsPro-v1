<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <%@ include file="common/meta.jsp" %>
    <title>Home Page</title>
    <%@ include file="common/header.jsp" %>
</head>
<body>
<div class="view">
    <c:if test="${page != null}">
        <div class="areaChart">
            <jsp:include page="charts/${page}.jsp" />
                <%--<jsp:include page="charts/chart.jsp"></jsp:include>--%>
        </div>
    </c:if>

</div>
<%@ include file="common/footer.jsp" %>
</body>
</html>