package project.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.cinema.model.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer>{

}
