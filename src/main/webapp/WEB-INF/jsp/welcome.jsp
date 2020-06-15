<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h2>Welcome to Calculator</h2>
<%
    String msg=(String)request.getAttribute("error");
    if(msg==null)
    {
        msg="";
    }
    %>
<%=msg%>
<form action="add" method="post">
    <input type="text" name="first" placeholder="First Number" class="form-input-text">
    <br>
    <input type="text" name="second" placeholder="Second Number" class="form-input-text">
    <input type="submit" value="Add">
    <input type="submit" value="Subtract" formaction="subtract">
    <input type="submit" value="Multiply" formaction="multiply">
    <input type="submit" value="Divide" formaction="divide">

</form>
</body>
</html>