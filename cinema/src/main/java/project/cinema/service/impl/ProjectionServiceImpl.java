package project.cinema.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import project.cinema.model.Projection;
import project.cinema.service.ProjectionService;

/**
 * {@link ProjectionService} implementation
 */
@Service
public class ProjectionServiceImpl implements ProjectionService {

    @Override
    public Projection findById(int id) {
        return null;
    }

    @Override
    public List<Projection> findAll() {
        return null;
    }

    @Override
    public void save(Projection projection) {

    }

    @Override
    public void update(Projection projection) {

    }

    @Override
    public void delete(int id) {

    }
}
