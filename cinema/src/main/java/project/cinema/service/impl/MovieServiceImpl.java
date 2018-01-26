package project.cinema.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import project.cinema.model.Movie;
import project.cinema.service.MovieService;

/**
 * {@link MovieService} implementation
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Override
    public Movie findById(int id) {
        return null;
    }

    @Override
    public List<Movie> findAll() {
        return null;
    }

    @Override
    public void save(Movie movie) {

    }

    @Override
    public void update(Movie movie) {

    }

    @Override
    public void delete(int id) {

    }

}
