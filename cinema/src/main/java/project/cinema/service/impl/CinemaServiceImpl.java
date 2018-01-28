package project.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.cinema.model.Cinema;
import project.cinema.repository.CinemaRepository;
import project.cinema.service.CinemaService;

/**
 * {@link CinemaService} implementation
 */
@Service
public class CinemaServiceImpl implements CinemaService {

	@Autowired
	private CinemaRepository cinemaRepository;
	
	
    @Override
    public Cinema findById(int id) {
        return cinemaRepository.findOne(id);
    }

    @Override
    public List<Cinema> findAll() {
        return cinemaRepository.findAll();
    }

    @Override
    public void save(Cinema cinema) {
    	cinemaRepository.save(cinema);
    }

    @Override
    public void delete(int id) {
    	cinemaRepository.delete(id);
    }

}
