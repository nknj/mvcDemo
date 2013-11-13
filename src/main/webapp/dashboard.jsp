<%@ page import="model.entity.User, model.UserManager" %>

<!DOCTYPE html>

<html>
    <head>
        <title>Dashboard</title>
    </head>
    <body>
        <%
            User u = UserManager.getUser();
            if (u == null) {
                response.sendRedirect("404.html");
                return;
            }
        %>
        <h2>
            Hello, <%=u.getUsername()%>
        </h2>
        Your password is <%=u.getPassword()%>, oops!
    </body>
</html>