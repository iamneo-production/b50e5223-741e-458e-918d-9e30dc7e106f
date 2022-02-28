<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Document</title>
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
		<link rel="stylesheet" href="assets/style.css">
	</head>
	<body>
		<div class="container">
			<h1>Food Recipe App</h2>
			<form id="form" class="search"> 
				<input type="search" id="query" name="q" placeholder="type here to search">
				<button id="search_btn">Search</button>
			</form>
			<select class="filter_btn" name="option">
				<option value="" disabled selected>Filter</option>
				<option value="1">Option 1</option>
				<option value="2">Option 2</option>
				<option value="3">Option 3</option>
			  </select>
		</div>
			<div class="horizontal">
				<div class="food_image">
					<img src="assets/images/food1.jpg" class="img" alt="food2">
				</div>
				<div class="food_desc">
					<h5>food name: Mutton Fry</h5>
					<h5>Recipe Description: zzzzzzz</h5>
					<h4><span>Edit</span><span>Delete</span><span>View</span></h4>
				</div>
			</div>
			<div class="horizontal">
				<div class="food_image">
					<img src="assets/images/food2.png" class="img" alt="food2">
				</div>
				<div class="food_desc">
					<h5>food name: Pizza</h5>
					<h5>Recipe Description: zzzzzzz</h5>
					<h4><span>Edit</span><span>Delete</span><span>View</span></h4>
				</div>
			</div>
			<div class="horizontal">
				<div class="food_image">
					<img src="assets/images/food3.jpg" class="img" alt="food2">
				</div>
				<div class="food_desc">
					<h5>food name: Burger</h5>
					<h5>Recipe Description: zzzzzzz</h5>
					<h4><span>Edit</span><span>Delete</span><span>View</span></h4>
				</div>
			</div>
			<div class="horizontal">
				<div class="food_image">
					<img src="assets/images/food4.jpg" class="img" alt="food2">
				</div>
				<div class="food_desc">
					<h5>food name: Sandwich</h5>
					<h5>Recipe Description: zzzzzzz</h5>
					<h4><span>Edit</span><span>Delete</span><span>View</span></h4>
				</div>
			</div>
			<div class="horizontal">
				<div class="food_image">
					<img src="assets/images/food5.webp" class="img" alt="food2">
				</div>
				<div class="food_desc">
					<h5>food name: Chocolate cake</h5>
					<h5>Recipe Description: zzzzzzz</h5>
					<h4><span>Edit</span><span>Delete</span><span>View</span></h4>
				</div>
			</div>
			<div class="horizontal">
				<div class="food_image">
					<img src="assets/images/food6.jpg" class="img" alt="food2">
				</div>
				<div class="food_desc">
					<h5>food name: French Fries</h5>
					<h5>Recipe Description: zzzzzzz</h5>
					<h4><span>Edit</span><span>Delete</span><span>View</span></h4>
				</div>
			</div>
		  
		  <div class="split right">
			<div class="centered"><br><br><br>
				<div class="recipe_form">
					<h2 class="head">Add Recipe</h2>
					<form action="RecipeServlet" method="POST">
						<input type="text" id="recipe_id" name="id" value="" placeholder="enter Recipe id"><br>
						<input type="text" id="name" name="name" value="" placeholder="enter Recipe name"><br>
						<input type="text" id="img_url" name="url" value="" placeholder="enter Recipe image URL"><br>
						<input type="text" id="desc" name="description" value="" placeholder="enter Recipe description"><br><br>
						<input type="submit" value="Add"><br><br><br><br>
					</form> 
				</div>
			</div>
			
			

	</body>
</html>