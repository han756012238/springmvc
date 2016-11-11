<%--
  Created by IntelliJ IDEA.
  User: hanyongkai
  Date: 2016/11/11
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>list</title>
        <script src="http://code.jquery.com/jquery-1.9.1.js">
            $(function(){
                $(".delete").click(function(){
                    var href = $(this).attr("href");
                    $("form").attr("action", href).submit();
                    return false;
                });
            })
        </script>
    </head>
    <body>
        <c:if test="${empty requestScope.employees}">
            没有员工信息
        </c:if>
        <c:if test="${!empty requestScope.employees }">
            <table border="1" cellpadding="10" cellspacing="0">
                <tr>
                    <th>ID</th>
                    <th>LastName</th>
                    <th>Email</th>
                    <th>Gender</th>
                    <th>Department</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>

                <c:forEach items="${requestScope.employees }" var="emp">
                    <tr>
                        <td>${emp.id }</td>
                        <td>${emp.lastName }</td>
                        <td>${emp.email }</td>
                        <td>${emp.gender==0?'Female':'Male' }</td>
                        <td>${emp.department.departmentName }</td>
                        <td><a href="emp/${emp.id}">Edit</a></td>
                        <form:form action="" method="POST">
                            <input type="hidden" name="_method" value="DELETE"/>
                            <td><a class="delete" href="emp/${emp.id}">Delete</a></td>
                        </form:form>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
        <br><br>

        <form action="" method="POST">
            <input type="hidden" name="_method" value="DELETE"/>
        </form>
        <a href = "emp">add new employee</a><br/>
    </body>
</html>
