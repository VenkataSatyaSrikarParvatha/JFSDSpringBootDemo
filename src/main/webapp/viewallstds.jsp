<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View All Students</title>
</head>
<body>
    Total Students = <c:out value="${count}"></c:out>
    <h3>View All Students</h3>
    <table>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>GENDER</th>
            <th>DEPARTMENT</th>
            <th>YEAR</th>
            <th>SEMESTER</th>
            <th>EMAIL</th>
            <th>CONTACT</th>
        </tr>
        <c:forEach items="${stdlist}" var="std">
            <tr>
                <td><c:out value="${std.id}"/></td>
                <td><c:out value="${std.name}"/></td>
                <td><c:out value="${std.gender}"/></td>
                <td><c:out value="${std.department}"/></td>
                <td><c:out value="${std.year}"/></td>
                <td><c:out value="${std.semester}"/></td>
                <td><c:out value="${std.email}"/></td>
                <td><c:out value="${std.contact}"/></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
