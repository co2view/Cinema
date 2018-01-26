package project.cinema.model;

/**
 * Movie model
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
public class Movie {

    private int idMovie;
    private String name;
    private MovieGenre movieGenre;

    public Movie() {
        super();
    }

    public Movie(int idMovie, String name, MovieGenre movieGenre) {
        super();
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

    @Override
    public String toString() {
        return "Movie [idMovie=" + idMovie + ", name=" + name + ", movieGenre=" + movieGenre + "]";
    }

}
