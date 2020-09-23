<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-color: black;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="style.css">
</head>
<div >
<h1 style="color:gold;text-align:center; font-size:14dp">Your details</h1>
 
<p style="text-align:center;"><b>Name:</b>
 <%= request.getParameter("name")%>
</p>
<p style="text-align:center;"><b>Age:</b>
 <%= request.getParameter("name")%>
</p>
<p style="text-align:center;"><b>gender:</b>
 <%= request.getParameter("gender")%>
</p>

</div>
<body>
<div id="zodiac">

${astro}
</div>


</body>
</html>