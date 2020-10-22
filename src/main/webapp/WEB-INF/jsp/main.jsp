<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8"?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<taglib xmlns="http://java.sun.com/xml/ns/javaee"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-jsptaglibrary_2_1.xsd"
        version="2.1">
</taglib>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>

<script type="text/javascript" src="jquery-2.1.4.min.js"></script>

<script>

    window.setInterval("showContent();",1000);
    $(function(){
        showContent();
    });
    // 显示聊天列表
    function showContent(){
        $.post("${pageContext.request.contextPath}/talkList?"+new Date().getTime(),function(data){
            $("#talkcontent").html(data);
        });
    }

</script>


<hr />
<b>聊天列表：</b>
<br>

<div id="talkcontent">
<%@ include file="talkList.jsp"%>
</div>

<hr />
<form id="form01" name="userform" action="/"  method="post" target="_self" >
    用户:<c:out value="${username}"></c:out>
    <br>
    输入框:<br>
    <input name="sendbox" type="text" style="height:40px;width:600px"
           nKeyDown="if(event.keyCode==13 && event.ctrlKey){send();}" autofocus="autofocus">

    <br><br>
    <input type="submit" value="发送" />
    <input type="reset" value="清空"/>
</form>

</body>
</html>