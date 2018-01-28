package project.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.cinema.model.Ticket;
import project.cinema.repository.TicketRepository;
import project.cinema.service.TicketService;

/**
 * {@link TicketService} implementation
 */
@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepository ticketRepository;
    @Override
    public Ticket findById(int id) {
        return ticketRepository.findOne(id);
    }

    @Override
    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    @Override
    public void save(Ticket Ticket) {
    	ticketRepository.save(Ticket);
    }

    @Override
    public void delete(int id) {
    	ticketRepository.delete(id);
    }

}
