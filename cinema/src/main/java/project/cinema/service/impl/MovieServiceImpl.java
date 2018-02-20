package project.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.cinema.model.Movie;
import project.cinema.repository.MovieRepository;
import project.cinema.service.MovieService;

/**
 * {@link MovieService} implementation
 */
@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	MovieRepository movieRepository;

    @Override
    public Movie findById(int id) {
        return movieRepository.findOne(id);
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie save(Movie movie) {
    	return movieRepository.save(movie);
    }

    @Override
    public void delete(int id) {
    	movieRepository.delete(id);
    }

}
