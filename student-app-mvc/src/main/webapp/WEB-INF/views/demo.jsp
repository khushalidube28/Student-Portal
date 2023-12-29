<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
	html,body{
	height:100%;}
	
	*{
	margin:0;
	padding:0;
	box-sizing:border-box;}
	
	ul{list-style:none;}
	body{
	font-size:1rem;
	line-height:1.6;
	background-color:#ecf0f1;
	color:#666;
	}
	header{
	background-color:#2c3e50;
	padding:2rem 0;}
	
	nav{
		max-width:100px;
		margin:0 auto;
		display:flex;
		justify-content:space-between;
		align-items:center;
		}
		.menu > li, .menu > a{
			display:inline-block;
			}
		.logo{
		font-size:1.5rem;
		color:#fff;
		font-weight:700;}
		
		.menu a{
		text-decoration:none;
		color:#fff;
		display:block;
		padding: 10px 1.5rem;
		transition:background-color .22s ease,color .22s ease;}
		
		.menu a:hover{
		background-color:#f34949;
		}
		.menu li{
		position:relative;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<nav>
			<h1 class="logo">Blog</h1>
			<ul class="menu">
				<li class=""><a>About</a></li>
				<li class=""><a>Project</a></li>
				<li class=""><a>Articles</a></li>
					<ul class="submenu">
						<li>Frontend</li>
						<li>Bcakend</li>
						
					</ul>
				<li class=""><a>Contacts</a></li>
			</ul>
		</nav>
	</header>
		
	
</body>
</html>