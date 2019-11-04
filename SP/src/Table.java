
public class Table implements Element{
	
	String name;

	public Table(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void print() {
		System.out.println("Table: "+name);
		
	}

}
