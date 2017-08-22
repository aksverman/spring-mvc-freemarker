<html>
<head>
	<title>FreeMarker Spring MVC Example</title>
</head>

<body>
<b> ${rc.contextPath} </b>

<h2> Add User rootContext</h2>
  <fieldset>
	<form name = "user" action="${rc.contextPath}/addUser" method="POST">
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
  
  <h3> click to see in users Map </h3>
  <a href="${rc.contextPath}/mapUser"> UsersMap </a>
</body>
</html>