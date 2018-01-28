package project.cinema.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * Theater model
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
@Entity
@Table(name="theater")
public class Theater {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_theater")
    private int idTheater;
	
	@Column(name="name", nullable = false, unique=false)
    private String name;
	
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_cinema", nullable = false, unique=false) 
    private Cinema cinema;
    
    @OneToMany(targetEntity=Seat.class, mappedBy="theater", fetch=FetchType.EAGER)
    private List<Seat> seats;
    
    @JsonIgnore
    @OneToMany(targetEntity=Projection.class, mappedBy="theater", fetch=FetchType.LAZY)
    private List<Projection> projections;

    public Theater() {
    }

    public Theater(int idTheater, String name, Cinema cinema, List<Seat> seats, List<Projection> projections) {
        this.idTheater = idTheater;
        this.name = name;
        this.cinema = cinema;
        this.seats = seats;
        this.projections = projections;
    }

    
    public int getIdTheater() {
        return idTheater;
    }

    public void setIdTheater(int idTheater) {
        this.idTheater = idTheater;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public List<Projection> getProjections() {
        return projections;
    }

    public void setProjections(List<Projection> projections) {
        this.projections = projections;
    }

}
