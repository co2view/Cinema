appCommonModule.service('homeService', function($http) {
	
	this.apiBasicUrl = 'api/cinemas/';
	
	this.getAllCinemas = function() {
		return $http({
			method:'get',
			url:this.apiBasicUrl,
			contentType: "application/json"
		});
		
	};
});