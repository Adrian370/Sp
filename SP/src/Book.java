import java.util.*;
public class Book implements Element{
	String name;
	ArrayList<Author> authors;
	ArrayList<Element> elementList;
	
	Book(String name){
		this.name = name;
		authors = new ArrayList<>();
		elementList = new ArrayList<>();
	}

	public void addAuthor(Author author) {
		authors.add(author);
	}
	

	public void addContent(Element element) {
		elementList.add(element);
		//return chapterList.size()-1;
	}

	@Override
	public void print() {
		System.out.println("Book: " + name);
		System.out.println("Authors: ");
		System.out.println(Printing.fancyPrinting(authors));
		for(Element element: elementList)
			element.print();
	}

	
	/*
	public int addChapter(String chapterName) {
		chapterList.add(new Chapter(chapterName));
		return chapterList.size()-1;
	}
	
	public Chapter getChapter(int index) {
		return chapterList.get(index);
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", authors=" + authors + ", chapterList=" + chapterList + "]";
	}
	*/
	
	
	
}
