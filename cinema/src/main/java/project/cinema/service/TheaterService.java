package project.cinema.service;

import java.util.List;

import project.cinema.model.Theater;

/**
 * Service definition for {@link Theater} entity.
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
public interface TheaterService {

    Theater findById(int id);

    List<Theater> findAll();

    void save(Theater theater);

    void update(Theater theater);

    void delete(int id);
}
