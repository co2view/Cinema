package project.cinema.service;

import java.util.List;

import project.cinema.model.Movie;

/**
 * Service definition for {@link Movie} entity.
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
public interface MovieService {

    Movie findById(int id);

    List<Movie> findAll();

    void save(Movie movie);

    void delete(int id);
}
