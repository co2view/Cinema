package project.cinema.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import project.cinema.model.Ticket;
import project.cinema.service.TicketService;

/**
 * {@link TicketService} implementation
 */
@Service
public class TicketServiceImpl implements TicketService {

    @Override
    public Ticket findById(int id) {
        return null;
    }

    @Override
    public List<Ticket> findAll() {
        return null;
    }

    @Override
    public void save(Ticket Ticket) {

    }

    @Override
    public void update(Ticket Ticket) {

    }

    @Override
    public void delete(int id) {

    }

}
