<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Dashboard</title>
    </head>
    <body>
        <h2>
            Hello, ${user.username}
        </h2>
        <p>
            Your password is ${user.password}, oops!
        </p>
        Click <a href="/">here</a> to go back to Home.
    </body>
</html>