<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Validation</title>
</head>
<body>

<form action="${mvc.contextPath}/contact" method="post">
    <label>Name:</label>
    <input type="text" name="name"/>
    <br/>

    <label>E-Mail:</label>
    <input type="text" name="email"/>
    <br/>

    <label>Message:</label>
    <textarea name="message"></textarea>
    <br/>

    <input type="submit"/>

    <c:if test="${bindingResult.isFailed()}">
        <p>Form validation failed. Reasons:</p>
        <ul>
            <c:forEach items="${bindingResult.allValidationErrors}" var="validationError">
                <li>
                    <c:out value="${validationError.paramName}: ${validationError.message}"/>
                </li>
            </c:forEach>
        </ul>
    </c:if>
</form>

</body>
</html>
