package project.cinema.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Projection for movie model
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
@Entity
@Table(name = "projection")
public class Projection {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "start_projection", nullable = false, unique = false)
    private LocalDateTime startProjection;

    @Column(name = "end_projection", nullable = false, unique = false)
    private LocalDateTime endProjection;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "theater_id", referencedColumnName = "id", nullable = false, unique = false)
    private Theater theater;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "movie_id", referencedColumnName = "id", nullable = false, unique = false)
    private Movie movie;

    public Projection() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getStartProjection() {
        return startProjection;
    }

    public void setStartProjection(LocalDateTime startProjection) {
        this.startProjection = startProjection;
    }

    public LocalDateTime getEndProjection() {
        return endProjection;
    }

    public void setEndProjection(LocalDateTime endProjection) {
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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("startProjection", startProjection)
                .append("endProjection", endProjection)
                .toString();
    }

}
