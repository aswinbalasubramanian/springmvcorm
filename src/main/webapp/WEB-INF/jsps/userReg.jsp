<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
				Id:<input type="text" name="id" />
				Name:<input type="text" name="name" />
				Email:<input type="text" name="email" />
				<input type="submit" name="register" />
		</pre>
	</form>
	
	<br>${result} 
</body>
</html>