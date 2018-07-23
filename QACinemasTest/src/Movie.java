
public class Movie {
	private String name;	
	private Rating rating;	
	//what the movie costed to the Cinema
	private double cost;
	//just for our purposes it is just days, here normally would be time slots that the movie is available
	private Day[] showingDays; 

	Movie(String name){
		this.name = name;		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Day[] getShowingDays() {
		return showingDays;
	}

	public void setShowingDays(Day[] showingDays) {
		this.showingDays = showingDays;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
}
