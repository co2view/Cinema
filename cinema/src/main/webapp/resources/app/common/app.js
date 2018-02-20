// Creating basic module for AngularJS. 
// Add all other created modules in basic model.
var cinemaApp = angular.module('cinemaApp', [ 'ngRoute', 'cinemaHomeModule', 'cinemaMovieModule' ]);

// Configuration for AngularJS application.
cinemaApp.config([ '$routeProvider', function($routeProvider, $compile) {

	// Routing for application - routes the application to different pages without reloading the entire application.
	$routeProvider
	.when('/', {
		templateUrl : 'resources/app/common/home.html',
		controller  : 'homeController'
    })
    .when('/movies', {
		templateUrl : 'resources/app/movie/movies.html',
		controller  : 'movieController'
    })
    .when('/movies/edit/:id', {
		templateUrl : 'resources/app/movie/add-edit.html',
		controller  : 'movieController'
    })
    .when('/movies/add', {
		templateUrl : 'resources/app/movie/add-edit.html',
		controller  : 'movieController'
    })
    
} ])