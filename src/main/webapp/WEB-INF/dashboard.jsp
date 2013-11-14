<%@ page import="model.entity.User" %>
<%
    User u = (User) request.getAttribute("user");
%>

<!DOCTYPE html>
<html>
    <head>
        <title>Dashboard</title>
    </head>
    <body>
        <h2>
            Hello, <%=u.getUsername()%>
        </h2>
        <p>
            Your password is <%=u.getPassword()%>, oops!
        </p>
        Click <a href="/">here</a> to go back to Home.
    </body>
</html>