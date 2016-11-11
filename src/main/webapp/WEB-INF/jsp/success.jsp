<%--
  Created by IntelliJ IDEA.
  User: hanyongkai
  Date: 2016/11/11
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
    <head>
        <title>Success</title>
    </head>
    <body>
        <h4>Success Page</h4><br/><br/>
        <a href="helloworld">hello world</a><br/><br/>
        <a href="testPathVariable/1">testPathVariable</a><br/><br/>
        <a href="testRequestParam?username=qiezi&age=26">testRequestParam</a><br/><br/>
        <a href="testCookieValue">testCookieValue</a><br/><br/>
        <a href="testRequestHeader">testRequestHeader</a><br/><br/>
        <a href="testModelAndView">testModelAndView</a><br/><br/>
        <a href="testViewAndViewResolver">testViewAndViewResolver</a><br/><br/>

        time: ${requestScope.time}<br><br>

        <a href="testRest/1">testRest</a><br/><br/>


        <form action="testRest/1" method="post">
            <input type="hidden" name="_method" value= "PUT"/>
            <input type="submit" value="testRestPut"/>
        </form><br/><br/>

        <form action="testRest/1" method="post">
            <input type="hidden" name="_method" value="DELETE"/>
            <input type="submit" value="testRestDelete"/>
        </form><br><br>

        <form action="testRest" method="post">
            <input type="submit" value="testRestPost">
        </form><br/><br/>

        <form action="testPojo" method="post">
            username: <input type="text" name="username"><br>
            password: <input type="password" name="password"><br>
            email: <input type="text" name="email"><br>
            age: <input type="text" name="age"><br>
            city: <input type="text" name="address.city"><br>
            province: <input type="text" name="address.province"><br>
            <input type="submit" value="submit">
        </form><br/><br/>
    </body>
</html>
