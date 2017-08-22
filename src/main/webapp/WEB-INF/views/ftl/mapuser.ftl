<#import "spring.ftl" as spring />
<html>
<head>
  <title> Map User ftl </title>
</head>
<body>
  <h2> Show Users Map </h2>
	<#list model["usersMap"]?keys as k>
		${k}
	</#list>
	<#list model["usersMap"]?values as v>
		${v}
	</#list>
</body> 
</html>
