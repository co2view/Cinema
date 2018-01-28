package project.cinema.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Projection for movie model
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
@Entity
@Table(name="projection")
public class Projection {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_projection")
    private int idProjection;
	
	@Column(name="start_projection", nullable = false, unique=false)
    private Date startProjection;
	
	@Column(name="end_projection", nullable = false, unique=false)
    private Date endProjection;
	
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_theater", nullable = false, unique=false) 
    private Theater theater;
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_movie", nullable = false, unique=false) 
    private Movie movie;

    public Projection() {
    }

    public Projection(int idProjection, Date startProjection, Date endProjection, Theater theater, Movie movie) {
        this.idProjection = idProjection;
        this.startProjection = startProjection;
        this.endProjection = endProjection;
        this.theater = theater;
        this.movie = movie;
    }

    public int getIdProjection() {
        return idProjection;
    }

    public void setIdProjection(int idProjection) {
        this.idProjection = idProjection;
    }

    public Date getStartProjection() {
        return startProjection;
    }

    public void setStartProjection(Date startProjection) {
        this.startProjection = startProjection;
    }

    public Date getEndProjection() {
        return endProjection;
    }

    public void setEndProjection(Date endProjection) {
        this.endProjection = endProjection;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

}
