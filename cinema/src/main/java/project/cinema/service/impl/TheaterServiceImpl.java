package project.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.cinema.model.Theater;
import project.cinema.repository.TheaterRepository;
import project.cinema.service.TheaterService;

/**
 * {@link TheaterService} implementation
 */
@Service
public class TheaterServiceImpl implements TheaterService {

	@Autowired
	TheaterRepository theaterRepository;
	
    @Override
    public Theater findById(int id) {
        return theaterRepository.findOne(id);
    }

    @Override
    public List<Theater> findAll() {
        return theaterRepository.findAll();
    }

    @Override
    public void save(Theater theater) {
    	theaterRepository.save(theater);
    }

    @Override
    public void delete(int id) {
    	theaterRepository.delete(id);
    }

}
