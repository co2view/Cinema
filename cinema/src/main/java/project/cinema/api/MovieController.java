package project.cinema.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import project.cinema.model.Movie;
import project.cinema.service.MovieService;

@RestController
@RequestMapping(value = "api/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Movie>> findAll() {
		return new ResponseEntity<>(movieService.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Movie> getById(@PathVariable(value = "id", required = true) int id) {
		return new ResponseEntity<>(movieService.findById(id), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Movie> create(@RequestBody Movie movie) {
		return new ResponseEntity<>(movieService.save(movie), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{movieId}",method = RequestMethod.DELETE)
	public ResponseEntity delete(@PathVariable(value = "movieId", required = true) int movieId) {
		movieService.delete(movieId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
