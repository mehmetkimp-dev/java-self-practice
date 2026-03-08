package metodlar2.Movie;

public class Movie {

    public String title;
    public String director;
    public int releaseYear;
    public double rating;
    public boolean isAwardWinner;
    public char genreCode;

    public void play(){
        System.out.println("Movie is playing.");
    }public void pause(){
        System.out.println("Movie is paused.");
    }
public void printMovieINfo(){
    System.out.println(toString());

}


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                ", isAwardWinner=" + isAwardWinner +
                ", genreCode=" + genreCode +
                '}';
    }
}
