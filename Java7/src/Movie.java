import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String director;
    private int yearOfRelease;
    private double rating;
    private static int totalMoviesCount;
    private List<String> starring = new ArrayList<>();
    Movie(){
        totalMoviesCount++;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getYearOfRelease() {
        return yearOfRelease;
    }
    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public static int getTotalMoviesCount() {
        return totalMoviesCount;
    }
    public List<String> getStarring() {
        return starring;
    }
    public void addStarring(String starring) {
        this.starring.add(starring);
    }
}
