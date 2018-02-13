var appCommonModule = angular.module('cinemaHomeModule', []);

appCommonModule.controller('homeController', function($scope, homeService) {

	$scope.cinemas;

	$scope.homePageInit = function() {
		homeService.getAllCinemas().then(function successCallback(response) {
			$scope.cinemas = response.data;
		}, function errorCallback(response) {
			alert("Error home page init!!!");
		});
	};

});
