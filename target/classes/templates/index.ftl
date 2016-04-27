<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lazy stack demo</title>
</head>
<body>
    <h1>Lazy stack demo</h1>
    <#list posts as post>
    	<h2>${post.title}</h2>
    	<div>
    		${post.body}
    	</div>
    
	</#list>
</body>
</html>