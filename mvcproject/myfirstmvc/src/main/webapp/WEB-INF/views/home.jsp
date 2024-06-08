
<!DOCTYPE html>
<%@page import="org.springframework.web.bind.annotation.RequestBody"%>
<html>
<head>
	<title>Home Page</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<form action="login" method="post"> </form>
	<header>
		<nav>
			<ul>
				<li><a href="#">Home</a></li>
				<li><a href="#">About</a></li>
				<li><a href="#">Services</a></li>
				<li><a href="#">Contact</a></li>
			</ul>
		</nav>
	</header>

	<main>
		<section class="hero-section">
			<h1>Welcome to anime world</h1>
			<p>We provide high-quality services for your needs.</p>
			<a href="#" class="btn">Learn More</a>
		</section>

		<section class="services-section">
			<h2>Our Services</h2>
			<ul>
				<li>Service 1</li>
				<li>Service 2</li>
				<li>Service 3</li>
			</ul>
		</section>

		<section class="about-section">
			<h2>About Us</h2>
			<p>Anime (Japanese: アニメ, IPA: [anime] (listen)) is hand-drawn and computer-generated animation originating from Japan. Outside of Japan and in English, anime refers specifically to animation produced in Japan.[1] However, in Japan and in Japanese, anime (a term derived from a shortening of the English word animation) describes all animated works, regardless of style or origin. Animation produced outside of Japan with similar style to Japanese animation is commonly referred to as anime-influenced animation.</p>
		</section>
	</main>

	<footer>
		<p>&copy; 2023, All Rights Reserved</p>
	</footer>
</body>
</html>

<style>body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
}

header {
	background-color: #333;
	color: #fff;
	padding: 10px 20px;
}

nav ul {
	list-style: none;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: space-between;
}

nav ul li a {
	color: #fff;
	text-decoration: none;
	padding: 5px 10px;
	border-radius: 5px;
	transition: all 0.3s ease;
}

nav ul li a:hover {
	background-color: #fff;
	color: #333;
}

.hero-section {
	background-image: url('https://images.saymedia-content.com/.image/c_limit%2Ccs_srgb%2Cq_auto:eco%2Cw_850/MTc2MjY1MzIwMTIwNzg4MTQx/20-best-anime-facebook-covers.webp');
	background-size: cover;
	background-position: center;
	color: #fff;
	padding: 50px;
	text-align: center;
}

.hero-section h1 {
	font-size: 3em;
	margin-bottom: 20px;
}

.btn {
	background-color: #4CAF50;
	color: #fff;
	padding: 10px 20px;
	border-radius: 5px;
	text-decoration: none;
	transition: all 0.3s ease;
}

.btn:hover {
	background-color: #fff;
	color: #333;
}

.services-section {
	background-color: #fff;
	padding: 50px;
	text-align: center;
}

.services-section h2 {
	margin-bottom: 20px;
}

.about-section {
	background-color: #f2f2f2;
	padding: 50px;
	text
</style>
	

