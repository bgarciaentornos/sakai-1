<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.sakaiproject.component.cover.ComponentManager" %>
<%@ page import="org.sakaiproject.tool.api.ActiveToolManager" %>
<%@ page import="org.sakaiproject.tool.api.ActiveTool" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="margin-top: 1em;">
		<div style="background-color: #FFEEEE; border: 2px; border-style: solid; border-color: #FF5555;">
			 <% 
			 	ActiveToolManager toolManager = (ActiveToolManager)ComponentManager.get(org.sakaiproject.tool.api.ActiveToolManager.class);
			 	ActiveTool tool = toolManager.getActiveTool("sakai.login");
			 	String context = request.getHeader("referer");
			 	tool.help(request, response, context, "/login");
			 %>
			 <p>
			 	<img style="float: left; margin: 0 10px 0 10px;" src="images/exclamation.gif" ></img>
			 	<span style="font-family: 'Trebuchet MS',Verdana,Geneva,Arial,Helvetica,sans-serif; font-size: 80%; color: #FF5555;">
			 		Sorry! You need to login before you can access this page.
			 	</span>
			 </p>
		</div>
	</div>
</body>
</html>