package project.cinema.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Cinema model
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
@Entity
@Table(name = "cinema")
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", nullable = true)
    private String address;

    @JsonIgnore
    @OneToMany(targetEntity = Theater.class, mappedBy = "cinema")
    private List<Theater> theaters;

    public Cinema() {
    }

    public Cinema(String name, String address) {
		this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Theater> getTheaters() {
        return theaters;
    }

    public void setTheaters(List<Theater> theaters) {
        this.theaters = theaters;
    }

    public void addTheater(Theater theater) {
        theater.setCinema(this);
        theaters.add(theater);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("address", address).toString();
    }
}
