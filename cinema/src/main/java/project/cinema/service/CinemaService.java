package project.cinema.service;

import java.util.List;

import project.cinema.model.Cinema;

/**
 * Service definition for {@link Cinema} entity.
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
public interface CinemaService {

    Cinema findById(int id);

    List<Cinema> findAll();

    Cinema save(Cinema cinema);

    void delete(int id);

}
