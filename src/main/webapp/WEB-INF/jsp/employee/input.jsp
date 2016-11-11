<%--
  Created by IntelliJ IDEA.
  User: hanyongkai
  Date: 2016/11/11
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>input</title>
    </head>
    <body>

        <form:form action="/employee/emp" method="POST" modelAttribute="employee">
            <!-- path 属性对应html表单标签的name属性 -->
            <c:if test="${employee.id == null }">
                <!-- path 属性对应 html 表单标签的 name 属性值 -->
                LastName: <form:input path="lastName" />
                <form:errors path="lastName"></form:errors>
            </c:if>
            <c:if test="${employee.id != null }">
                <form:hidden path="id" />
                <input type="hidden" name="_method" value="PUT" />
            </c:if>
            Email:<form:input path="email"></form:input><br>
            <%
                Map<String, String> genders = new HashMap<String, String>();
                genders.put("1", "male");
                genders.put("0", "female");
                request.setAttribute("genders", genders);
            %>
            Gender:<form:radiobuttons path="gender" items="${genders }"/><br>
            Department:<form:select path="department.id" items="${departments }" itemLabel="departmentName" itemValue="id"></form:select><br>
            <input type="submit" value="Submit"/>
        </form:form>
    </body>
</html>
