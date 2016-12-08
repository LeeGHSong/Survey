<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Survey</title>
</head>
<body>
	<h1>Survey</h1>
	<form action="SurveyServlet" method="post">
        <!-- hidden input to let servlet know which form was used -->
        <input type="hidden" name="hiddenAction" value="postFormSubmission">

        <label>Email:</label>
        <input type="email" name="email" required value=""><br>

        <label>First Name:</label>
        <input type="text" name="firstName" required value=""><br>

        <label>Last Name:</label>
        <input type="text" name="lastName" required value=""><br>

		<label>Gender:</label><br>
		<input type="radio" name="gender" value="male" checked> Male<br>
		<input type="radio" name="gender" value="female"> Female<br>
		<input type="radio" name="gender" value="other"> Other<br>


		<label>Favorite Color(s):</label><br>
		<input type="checkbox" name="color" value="red"> Red<br>
		<input type="checkbox" name="color" value="green"> Green<br>
		<input type="checkbox" name="color" value="blue"> Blue<br>

		<label>Favorite Animal:</label><br>
		<input type="text" name="animal" value=""> <br>

		<label>Political Party:</label><br>
		<input type="radio" name="party" value="Democrat"> Democrat<br>
		<input type="radio" name="party" value="Republican"> Republican<br>
		<input type="radio" name="party" value="Other"> Other <input type="text" name="textparty" placeholder="Party name here"> <br>
 
		<label>Marriage status:</label><br>
		<input type="radio" name="status" value="Single"> Single<br>
		<input type="radio" name="status" value="Married"> Married<br>
		<input type="radio" name="status" value="Divorced"> Divorced<br>
		<input type="radio" name="status" value="Widowed"> Widowed<br>
		
        <label>&nbsp;</label>
        <input type="submit" value="Submit" id="submit">
        <input type="reset" value="Clear Form">
    </form>
</body>
</html>