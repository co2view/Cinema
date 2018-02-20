// Service for movie module
appMovieModule.service('movieService', function($http) {
	
	this.apiBasicUrl = 'api/movies/';
	
	this.getAll = function() {
		return $http({
			method:'get',
			url:this.apiBasicUrl,
			contentType: "application/json"
		});
	};
	
	this.getById = function(id) {
		return $http({
			method:'get',
			url:this.apiBasicUrl+id,
			contentType: "application/json"
		});
	};
	
});