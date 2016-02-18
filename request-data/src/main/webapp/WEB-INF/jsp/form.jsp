<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Request Parameters</title>
  </head>
  <body>
    <h1>${mvc.encoders.html(text)}</h1>

    <form action="bean" method="post">
      <label>ID:</label>
      <input type="text" name="id" />
      <br />
      <label>Name:</label>
      <input type="text" name="name" />
      <br />
      <label>Role:</label>
      <select name="role">
        <option value="admin">Admin</option>
        <option value="reporter">Reporter</option>
        <option value="accountant">Accountant</option>
      </select>
      <input type="submit"/>
    </form>

  </body>
</html>
