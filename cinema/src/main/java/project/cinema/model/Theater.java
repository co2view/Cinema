package project.cinema.model;

import java.util.List;

/**
 * 
 * Theater model
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
public class Theater {

    private int idTheater;
    private String name;
    private Cinema cinema;
    private List<Seat> seats;
    private List<Projection> projections;

    public Theater() {
        super();
    }

    public Theater(int idTheater, String name, Cinema cinema, List<Seat> seats, List<Projection> projections) {
        super();
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

    @Override
    public String toString() {
        return "Theater [idTheater=" + idTheater + ", name=" + name + ", cinema=" + cinema + ", seats=" + seats + ", projections=" + projections + "]";
    }

}
