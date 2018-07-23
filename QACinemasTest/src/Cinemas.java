import java.util.List;

public class Cinemas implements Company {
	private String name;
	private double money;
	private List<Movie> movies;
	
	public Cinemas(String name ) {
		this.setName(name);
		this.money = 0;
	}
	
	public void income(double in) {
		this.money += in;
	};
	
	public void expense(double out) {
		this.money -= out;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}; 
	
	public void buyMovie(Movie movie) {
		this.movies.add(movie);
		this.expense(movie.getCost());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
