import align.AlignStrategy;

public class Paragraph implements Element{
	
	public Paragraph(String name) {
		super();
		this.name = name;
	}
	
	private AlignStrategy align;

	String name;

	@Override
	public String toString() {
		return "Paragraph : " + name + "\n";
	}

	@Override
	public void print() {
		if(name != null && align != null)
			align.print(name);
		else
			System.out.println("Paragraph: "+ name);
		
	}
	
	public void setAlignStrategy( AlignStrategy alignStrategy) {
		this.align = alignStrategy;
	}
	

}
