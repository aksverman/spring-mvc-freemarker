<html>
<head>
	<title>FreeMarker Spring MVC Example</title>
</head>

<body>
<h2> Add User </h2>
  <fieldset>
	<form name = "user" action="/MvcFreeMarker/addUser" method="POST">
		Username : <input type="text" name="username"> <br/>
		Country  : <input type="text" name="country">  <br/>
		<input type = "submit" value=" Add User "/>
	</form>
  </fieldset>
  
  <br/>
  <table>
  	<tr>
  		<th> Username </th> <th> Country </th> 
  	</tr>
  	<#list model["usersList"] as user>
	<tr><td> ${user.username} </td> <td> ${user.country} </td> </tr>
	</#list>
  </table>
</body>
</html>