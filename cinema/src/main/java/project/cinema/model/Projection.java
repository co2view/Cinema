package project.cinema.model;

import java.util.Date;

/**
 * Projection for movie model
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
public class Projection {

    private int idProjection;
    private Date startProjection;
    private Date endProjection;
    private Theater theater;
    private Movie movie;

    public Projection() {
        super();
    }

    public Projection(int idProjection, Date startProjection, Date endProjection, Theater theater, Movie movie) {
        super();
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

    @Override
    public String toString() {
        return "Projection [idProjection=" + idProjection + ", startProjection=" + startProjection + ", endProjection=" + endProjection + ", theater=" + theater + ", movie=" + movie + "]";
    }

}
