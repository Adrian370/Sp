import java.util.concurrent.*;
public class Image implements Element{
	String name;

	@Override
	public String toString() {
		return "Image with name: " + name + "\n";
	}

	public Image(String name) {
		super();
		this.name = name;
		try {
			TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		
		
		
	}

	@Override
	public void print() {
		System.out.println("Image with title: "+name);
		
	}
	
	
}
