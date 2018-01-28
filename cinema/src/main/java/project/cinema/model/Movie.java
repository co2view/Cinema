package project.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Movie model
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
@Entity
@Table(name="movie")
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_movie")
    private int idMovie;
	
	@Column(name="name", nullable = false,unique=false)
    private String name;
	
	@Enumerated(EnumType.STRING)
	@Column(name="movie_genre", nullable = false,unique=false)
    private MovieGenre movieGenre;

    public Movie() {
    }

    public Movie(int idMovie, String name, MovieGenre movieGenre) {
        this.idMovie = idMovie;
        this.name = name;
        this.movieGenre = movieGenre;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieGenre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(MovieGenre movieGenre) {
        this.movieGenre = movieGenre;
    }

}
