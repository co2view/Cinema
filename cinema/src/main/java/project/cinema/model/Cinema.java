package project.cinema.model;

import java.util.List;

/**
 * Cinema model
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
public class Cinema {

    private int idCinema;
    private String name;
    private String adrress;
    private List<Theater> theaters;

    public Cinema() {
        super();
    }

    public Cinema(int idCinema, String name, String adrress, List<Theater> theaters) {
        super();
        this.idCinema = idCinema;
        this.name = name;
        this.adrress = adrress;
        this.theaters = theaters;
    }

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

    public List<Theater> getTheaters() {
        return theaters;
    }

    public void setTheaters(List<Theater> theaters) {
        this.theaters = theaters;
    }

    @Override
    public String toString() {
        return "Cinema [idCinema=" + idCinema + ", name=" + name + ", adrress=" + adrress + ", theaters=" + theaters + "]";
    }

}
