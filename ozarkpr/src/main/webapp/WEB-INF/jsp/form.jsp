<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Request Parameters</title>
</head>
<body>
<h1>${text}</h1>

<form action="/ttt/test/form" method="post">
    <input type="hidden" name="${mvc.csrf.name}" value="${mvc.csrf.token}"/>

    <p>foo: ${foo}</p>
    <label>Name:</label>
    <input type="text" name="name"/>
    <br/>

    <label>E-Mail:</label>
    <input type="text" name="email"/>
    <br/>

    <label>Age:</label>
    <input type="text" name="age"/>
    <br/>

    <input type="submit"/>
</form>

</body>
</html>
