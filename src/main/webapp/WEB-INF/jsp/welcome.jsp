<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Calculator</title>
    <link href="${pageContext.request.contextPath}/resources/styles.css" rel="stylesheet" />
</head>
<body>
<div class="form-body form-body-calculator">
    <h1>Welcome to Calculator</h1>
    <%
        String msg=(String)request.getAttribute("error");
        if(msg==null)
        {
            msg="";
        }
    %>
    <%=msg%>

    <form action="add" method="post">
        <div class="form-input">
            <input type="text" name="first" placeholder="First Number" class="form-input-text">
        </div>
        <br>
        <div class="form-input">
            <input type="text" name="second" placeholder="Second Number" class="form-input-text">
        </div>
        <br>
        <button type="submit" value="+" class="calci-buttons"><p class="calci-button-text">+</p></button>
        <button type="submit" value="+" formaction="subtract" class="calci-buttons"><p class="calci-button-text">-</p></button>
        <button type="submit" value="+" formaction="multiply" class="calci-buttons"><p class="calci-button-text">x</p></button>
        <button type="submit" value="+" formaction="divide" class="calci-buttons"><p class="calci-button-text">/</p></button>
        <br>
    </form>
</div>
</body>
</html>