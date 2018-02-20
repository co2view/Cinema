// Common module - for index.html and home.html
var appCommonModule = angular.module('cinemaHomeModule', []);

// Controller for common module
appCommonModule.controller('homeController', function($scope, homeService) {

	$scope.homePageInit = function() {
		// call common service module to get a list of the cinemas.
		homeService.getAll().then(function successCallback(response) {
			$scope.cinemas = response.data;
		}, function errorCallback(response) {
			alert("Error home page init!!!");
		});
	};

});
