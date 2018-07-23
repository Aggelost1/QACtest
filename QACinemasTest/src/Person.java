/** class Person summary:
 * Person has age , name , address, id as parameters with data hiding
 * We have a setter and a getter for each parameter   
 * @author admin *
 */
public class Person {
	private int age;
	private String name;
	private String address;
	private String id;
	
	public void setAge(int age) {
		this.age = age; 
	} 
	
	public int getAge( ) {
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name; 
	} 
	
	public String getName( ) {
		return this.name;
	}
	
	public void setAddress(String address) {
		this.address = address; 
	} 
	
	public String getAddress( ) {
		return this.address;
	}
	
	public void setID(String id) {
		this.id = id; 
	} 
	
	public String getID( ) {
		return this.id;
	}
}
