package project.cinema.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Cinema model
 * 
 * @author zelimirss
 * @since Jan 26, 2018
 *
 */
@Entity
@Table(name="cinema")
public class Cinema {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_cinema")
    private int idCinema;
	
	@Column(name="name", nullable = false, unique = false)
    private String name;
	
	@Column(name="adrress", nullable = true, unique= false)
    private String adrress;
	
	@JsonIgnore
    @OneToMany(targetEntity=Theater.class, mappedBy="cinema", fetch=FetchType.LAZY)
    private List<Theater> theaters;

    public Cinema() {
    }

    public Cinema(int idCinema, String name, String adrress, List<Theater> theaters) {
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

}
