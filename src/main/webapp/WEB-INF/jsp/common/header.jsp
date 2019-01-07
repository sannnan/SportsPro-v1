<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
</head>
<body>
<%--Nav bar start--%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">SportsPro</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="piechart">Pie Chart</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="areachart ">Area Chart</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="livechart">Live Chart</a>
            </li>
            <%--<li class="nav-item dropdown">--%>
                <%--<a class="dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--%>
                    <%--Dropdown--%>
                <%--</a>--%>
                <%--<div class="dropdown-menu" aria-labelledby="navbarDropdown">--%>
                    <%--<a class="dropdown-item" href="#">Action</a>--%>
                    <%--<a class="dropdown-item" href="#">Another action</a>--%>
                    <%--<div class="dropdown-divider"></div>--%>
                    <%--<a class="dropdown-item" href="#">Something else here</a>--%>
                <%--</div>--%>
            <%--</li>--%>
            <li class="nav-item">
                <a class="nav-link disabled" href="#">Disabled</a>
            </li>
        </ul>
        <%--<form class="form-inline my-2 my-lg-0">--%>
        <%--<input class="form-control mr-sm-2 disabled"  type="search" placeholder="Search" aria-label="Search">--%>
        <%--<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>--%>
        <%--</form>--%>
    </div>
</nav>
<%--nav bar ends--%>

</body>
</html>