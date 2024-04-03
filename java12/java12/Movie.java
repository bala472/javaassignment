abstract class Movie {
    private String title;
    private int duration;

    public Movie(String title, int duration){
        this.title = title;
        this.duration = duration;
    }
    public String getTitle(){
        return title;
    }
    public int getDuration() {
        return duration;
    }
    abstract String getGenre();

}
class RomComMovie extends Movie {
    public RomComMovie(String title, int duration) {
        super(title, duration);
    }
    public String getGenre() {
        return "Romantic Comedy";
    }
}
class ThrillerMovie extends Movie {
    public ThrillerMovie(String title, int duration) {
        super(title, duration);
    }
    public String getGenre() {
        return "Thriller";
    }
}
class Main {
    public static void main(String[] args) {
        Movie movie1 = new RomComMovie("Messaya Murkku", 120);
        Movie movie2 = new ThrillerMovie("Ratchasan", 118);
        Movie[] movies = {movie1, movie2};
        for (Movie movie : movies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Duration: " + movie.getDuration() + " minutes");
            System.out.println("Genre: " + movie.getGenre());
            System.out.println();
        }
    }
}