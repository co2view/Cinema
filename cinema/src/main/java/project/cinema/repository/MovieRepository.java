package project.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.cinema.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
