<%-- <jsp:forward page="/jsp/login.jsp"/> --%>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Tomcat集群测试</title>
  </head>
  
  <body>
        服务器信息:

    <%
      String dtm = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
      System.out.println("["+request.getLocalAddr()+":"+ request.getLocalPort()+"]" + dtm);
      out.println("<br>["+request.getLocalAddr()+":" +request.getLocalPort()+"]" + dtm+"<br>"); 
    %>
    
    session分发:
    <%
        session.setAttribute("name","dennisit");
        System.out.println("[session分发] session id:"+session.getId());
        out.println("<br>[session分发] session id： " + session.getId()+"<br>");
    %>
  </body>
</html>