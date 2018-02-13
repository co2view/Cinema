var cinemaApp = angular.module('cinemaApp', [ 'ngRoute', 'cinemaHomeModule' ]);

cinemaApp.config([ '$routeProvider', function($routeProvider, $compile) {

	$routeProvider
	.when('/', {
		templateUrl : 'resources/app/common/home.html',
		controller  : 'homeController'
    })
    
} ])