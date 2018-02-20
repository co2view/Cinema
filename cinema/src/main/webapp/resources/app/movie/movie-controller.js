// Module for movie.html
var appMovieModule = angular.module('cinemaMovieModule', []);

// Controller for movie module
appMovieModule.controller('movieController', function($scope, movieService, movieFactory, $location) {

	$scope.movie = {};

	$scope.moviePageInit = function() {
		// call movie service module to get a list of the movies.
		movieService.getAll().then(function successCallback(response) {
			$scope.movies = response.data;
		}, function errorCallback(response) {
			alert("Error movie page init!!!");
		});
	};

	$scope.addEdit = function(movieId) {
		if (movieId !== "") {
			movieService.getById(movieId).then(
					function successCallback(response) {
						movieFactory.setMovie(response);
					}, function errorCallback(response) {
						alert("Error find movie!!!");
					});
			$location.path("/movies/edit/" + movieId);
		} else {
			$location.path("/movies/add");
		}
	}

	$scope.deleteOne = function(id) {
		alert(id)
	}

	$scope.save = function(movie) {
		alert(movie)
	}

	$scope.initAddEditMovie = function() {
		$scope.movie = movieFactory.getMovie();
	}
})