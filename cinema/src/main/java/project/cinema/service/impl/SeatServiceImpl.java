package project.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.cinema.model.Seat;
import project.cinema.repository.SeatRepository;
import project.cinema.service.SeatService;

/**
 * {@link SeatService} implementation
 */
@Service
public class SeatServiceImpl implements SeatService {

	@Autowired
	SeatRepository seatRepository;
	
	
    @Override
    public Seat findById(int id) {
        return seatRepository.findOne(id);
    }

    @Override
    public List<Seat> findAll() {
        return seatRepository.findAll();
    }

    @Override
    public void save(Seat seat) {
    	seatRepository.save(seat);
    }

    @Override
    public void delete(int id) {
    	seatRepository.delete(id);
    }

}
