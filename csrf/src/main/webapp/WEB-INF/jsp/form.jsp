<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Request Parameters</title>
</head>
<body>

<form action="${mvc.contextPath}/csrf" method="post">

    <input type="hidden" name="${mvc.csrf.name}" value="${mvc.csrf.token}"/>

    <label>Name:</label>
    <input type="text" name="name"/>
    <br/>

    <label>E-Mail:</label>
    <input type="text" name="email"/>
    <br/>

    <input type="submit"/>
</form>

</body>
</html>
