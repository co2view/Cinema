package project.cinema.service;

import java.util.List;

import project.cinema.model.Seat;

/**
 * Service definition for {@link Seat} entity.
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
public interface SeatService {

    Seat findById(int id);

    List<Seat> findAll();

    void save(Seat seat);

    void update(Seat seat);

    void delete(int id);
}
