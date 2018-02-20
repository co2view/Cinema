appMovieModule.factory("movieFactory", function() {

	movie = {};

	return {
		getMovie : function() {
			return movie;
		},
		setMovie : function(movie) {
			this.movie = movie;
		}
	}

})