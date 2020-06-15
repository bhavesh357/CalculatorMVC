<html>
<head>
    <meta charset="US-ASCII">
    <title>Registration Page</title>
    <link href="${pageContext.request.contextPath}/resources/styles.css" rel="stylesheet" />
</head>
<body>
<div class="form-body form-body-register">
    <h1>Register Form</h1>
    <%
        String msg=(String)request.getAttribute("message");
        if(msg==null)
        {
            msg="";
        }
    %>
    <%=msg%>
    <form action="registeruser" method="post">
        <div class="form-input">
            <input type="text" name="username" placeholder="Username" class="form-input-text">
        </div>
        <br>
        <div class="form-input">
            <input type="text" name="email" placeholder="Email ID" class="form-input-text">
        </div>
        <br>
        <div class="form-input">
            <input type="password" name="password" placeholder="Password" class="form-input-text">
        </div>
        <br>
        <div class="form-input">
            <input type="password" name="passwordRepeat" placeholder="Re-Enter Password" class="form-input-text">
        </div>
        <br>
        <br>
        <button type="submit" value="Register" class="form-primary">Register</button>
    </form>
    <h4>Already Registered?</h4>
    <a href="${pageContext.request.contextPath}/"><button>Login</button></a>
</div>
</body>
</html>