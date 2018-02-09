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

import project.cinema.model.Cinema;
import project.cinema.service.CinemaService;

@RestController
@RequestMapping(value = "api/cinema")
public class CinemaControllers {

	@Autowired
    private CinemaService cinemaService;
	
	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Cinema>> findAll() {
		return new ResponseEntity<>(cinemaService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<Cinema> getById(@PathVariable(value = "id", required = true) int id) {
		return new ResponseEntity<>(cinemaService.findById(id), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Cinema> create(@RequestBody Cinema cinema) {
		return new ResponseEntity<>(cinemaService.save(cinema), HttpStatus.CREATED);
	}
}
