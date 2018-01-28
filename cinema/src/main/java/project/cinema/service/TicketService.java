package project.cinema.service;

import java.util.List;

import project.cinema.model.Ticket;

/**
 * Service definition for {@link Ticket} entity.
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
public interface TicketService {

    Ticket findById(int id);

    List<Ticket> findAll();

    void save(Ticket Ticket);

    void delete(int id);

}
