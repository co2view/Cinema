package project.cinema.service;

import java.util.List;

import project.cinema.model.Projection;

/**
 * Service definition for {@link Projection} entity.
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
public interface ProjectionService {

    Projection findById(int id);

    List<Projection> findAll();

    void save(Projection projection);

    void delete(int id);
}
