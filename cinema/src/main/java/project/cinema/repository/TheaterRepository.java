package project.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.cinema.model.Theater;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Integer>{

}
