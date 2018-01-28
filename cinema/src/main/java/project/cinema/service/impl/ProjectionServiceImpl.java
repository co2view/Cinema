package project.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.cinema.model.Projection;
import project.cinema.repository.ProjectionRepository;
import project.cinema.service.ProjectionService;

/**
 * {@link ProjectionService} implementation
 */
@Service
public class ProjectionServiceImpl implements ProjectionService {

	@Autowired
	ProjectionRepository projectionRepository;
	
    @Override
    public Projection findById(int id) {
        return projectionRepository.findOne(id);
    }

    @Override
    public List<Projection> findAll() {
        return projectionRepository.findAll();
    }

    @Override
    public void save(Projection projection) {
    	projectionRepository.save(projection);
    }

    @Override
    public void delete(int id) {
    	projectionRepository.delete(id);
    }
}
