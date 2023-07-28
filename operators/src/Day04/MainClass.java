package Day04;
class encapsulation {
	  private int id;
	  private String name;
	  private String address;
	  private long number;
	  
	//  public encapsulation() {
//	    super();
//	    // TODO Auto-generated constructor stub
	//  }

	  public encapsulation(int id, String name, String address, long number) {
//	    super();
	    this.id = id;
	    this.name = name;
	    this.address = address;
	    this.number = number;
	  }

	  public int getId() {
	    return id;
	  }

	  public void setId(int id) {
	    this.id = id;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getAddress() {
	    return address;
	  }

	  public void setAddress(String address) {
	    this.address = address;
	  }

	  public long getNumber() {
	    return number;
	  }

	  public void setNumber(long number) {
	    this.number = number;
	  }
	  
	  
	  
	    @Override
	  public String toString() {
	    return "Student [id=" + id + ", name=" + name + ", address=" + address + ", number=" + number + "]";
	  }
	}
public class MainClass {

	public static void main(String[] args) 
	{
		  encapsulation e=new encapsulation(202,"A.P SakthiKummar","Thoothukudi",97517);
		    System.out.println(e.getAddress());
		    System.out.println(e.toString());

	}

}
