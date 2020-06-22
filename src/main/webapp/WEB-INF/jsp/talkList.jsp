<?xml version="1.0" encoding="UTF-8"?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

<%--
<%@ page import="java.io.*,java.util.*" %>
<%
    // 设置每隔5秒刷新一次
    response.setIntHeader("Refresh", 1);
    // 获取当前时间
    Calendar calendar = new GregorianCalendar();
    String am_pm;
    int hour = calendar.get(Calendar.HOUR);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    if(calendar.get(Calendar.AM_PM) == 0)
        am_pm = "上午";
    else
        am_pm = "下午";
    String CT = am_pm+" "+hour+":"+ minute +":"+ second  ;
    out.println("当前时间为: " + CT + "\n");
%> --%>

<c:forEach items="${list}" var="keyword" varStatus="id">
    <br>
    ${keyword}
</c:forEach>




</body>
</html>