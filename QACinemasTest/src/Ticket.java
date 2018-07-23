
public class Ticket {
	//hard-coding the day customers get discount and the amount
	private static Day discountDay = Day.WEDNESDAY;
	private static double discount = 2;
	//hard-coding the price for each category
	private static double standartPrice = 8;
	private static double OAPPrice = 6;
	private static double studentPrice = 6;
	private static double childPrice = 4;
	
	private Showing showing;	
	private Customer customer;

	public Ticket(Showing showing, Customer customer) {
		this.showing = showing;
		this.customer = customer;
	}
	
	public Showing getShowing() {
		return showing;
	}

	public void setShowing(Showing showing) {
		this.showing = showing;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	//half of the logic of what I was asked to do is here i.e getting the price of a ticket
	public double price() {
		double cost=0;
		
		if (this.showing.getDay() == Ticket.discountDay) {
			cost-= Ticket.discount;			
		}
		
		switch(customer.category) {
			case STANDART:
				cost += Ticket.standartPrice;
				break;
			case OAP:
				cost += Ticket.OAPPrice;
				break;
			case STUDENT:
				cost += Ticket.studentPrice;
				break;
			case CHILD: 
				cost += Ticket.childPrice;
				break;
		}
				
		return cost;
	}
	
	public void print() {
		System.out.println("Movie: " + this.showing.getMovie().getName() + "\n" +"Price: " + this.price() );
	}
	
	public void buy() {
		this.print();
		this.customer.getCinemas().income(this.price());
	}
}
