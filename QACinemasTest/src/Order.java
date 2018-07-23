import java.util.List;

public class Order {
	private List<Ticket> tickets;
	
	Order(List<Ticket> tickets){
		this.tickets = tickets;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	// this foreach loop is the other half of what I was asked to do, just adds up the price of the tickets
	public double price() {
		double cost = 0;
		
		for (Ticket ticket : this.tickets) {
			cost += ticket.price();
		}	
		
		return cost;
	}
}
