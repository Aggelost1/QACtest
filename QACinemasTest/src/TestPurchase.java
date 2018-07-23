import java.util.ArrayList;
import java.util.List;

public class TestPurchase {

	public static void main(String[] args) {
		//creating my QACinemas Company 
		Cinemas cinema = new Cinemas("QACinemas");
		//creating 4 customers of QACinemas 1 for each category
		Customer george = new Customer(Category.STUDENT, cinema);
		Customer jhon = new Customer(Category.STANDART, cinema);
		Customer baby = new Customer(Category.CHILD, cinema);
		Customer gpapa = new Customer(Category.OAP, cinema);
		// creating Movie batman
		Movie batman = new Movie("batman");
		//creating 2 showings of the movie one on Wednesday (discount day) 
		Showing showing1 = new Showing(Day.WEDNESDAY, batman);
		Showing showing2 = new Showing(Day.MONDAY, batman);
		List<Ticket> tickets = new ArrayList<Ticket>();  
		//creating the tickets (and buying them) and adding them to the tickets array list  
		Ticket ticket1 = new Ticket(showing1, george);
		ticket1.buy();
		tickets.add(ticket1);
		Ticket ticket2 = new Ticket(showing1, jhon);
		ticket2.buy();
		tickets.add(ticket2);
		Ticket ticket3 = new Ticket(showing2, baby);
		ticket3.buy();
		tickets.add(ticket3);
		Ticket ticket4 = new Ticket(showing2, gpapa);
		ticket4.buy();
		tickets.add(ticket4);
		//making our order passing it our tickets array list  
		Order order = new Order(tickets);
		System.out.println(order.price());
	}

}
