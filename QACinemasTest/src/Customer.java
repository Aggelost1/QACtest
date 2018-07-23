/**
 * @author admin
 * class Customer inherits from Person 
 * has a setter and a getter for the customer card variable 
 * and the category of the client (enum: STANDART, OAP, STUDENT, CHILD) 
 */
public class Customer extends Person {
	private Cinemas cinemas;
	private String customerCard;
	
	public Category category;
	
	public Customer(Category category, Cinemas cinemas) {
		this.category = category;
		this.cinemas = cinemas;
	}
	
	public void setCustomerCard(String card) {
		this.customerCard = card; 
	} 
	
	public String getCustomerCard( ) {
		return this.customerCard;
	}

	public Cinemas getCinemas() {
		return cinemas;
	}

	public void setCinemas(Cinemas cinemas) {
		this.cinemas = cinemas;
	}
	
}
