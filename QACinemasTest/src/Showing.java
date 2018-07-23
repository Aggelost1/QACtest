
public class Showing {
	private Movie movie;
	
	// here normally would be the time-slot it is (just for our purposes we use only the day)
	private Day day;
	
	public Showing(Day day, Movie movie) {
		this.day = day;
		this.movie = movie;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}
}
