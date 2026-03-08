package metodlar2.Movie;

public class movieObjects {
    public static void main(String[] args) {

        Movie movie=new Movie();

        movie.title="The Godfather";
        movie.director="Ford Capolla";
        movie.releaseYear=1974;
        movie.rating=10;
        movie.isAwardWinner=true;
        movie.genreCode='A';

        movie.play();
        movie.pause();
        movie.printMovieINfo();







    }
}
