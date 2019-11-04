import java.util.*;

public class Section implements Element{
	String sectionTitle;
	ArrayList<Element> content;
	
	Section(){}
	
	Section(String sectionTitle){
		this.sectionTitle = sectionTitle;
		content = new ArrayList<>();
	}
	
	void add(Element element) {
		content.add(element);
	}
	
	void remove(Element element) {
		content.remove(element);
	}
	
	Element getElement(int index) {
		return content.get(index%content.size());
	}
	
	@Override
	public void print() {
		System.out.println(sectionTitle);
		for(Element element: content)
			element.print();
		
	}

}
