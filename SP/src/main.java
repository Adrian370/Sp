import align.*;

public class main {
	public static void main(String[] args) {
		/*
		Book titanic = new Book("Titanic");
		Author Paul = new Author("Paul");
		titanic.addAuthor(Paul);
		
		int indexOfChapter = titanic.addChapter("Chapter One");
		Chapter chapter = titanic.getChapter(indexOfChapter);
		
		int indexOfSubChapter = chapter.addSubChapter("ChapterOne One");
		SubChapter subChapter = chapter.getSubChapter(indexOfSubChapter);
		int indexOfParagraph  = subChapter.addParagraph("Paragraph1");
		int indexOfImage  = subChapter.addImage("Image1");
		int indexOfImage1  = subChapter.addImage("Image2");
		int indexOfParagraph2  = subChapter.addParagraph("Paragraph2");
		int indexOfTable  = subChapter.addTable("Table1");
		int indexOfParagraph3  = subChapter.addParagraph("Paragraph3");
		*/
//		Paragraph paragraph = subChapter.getParagraph(indexOfParagraph);
//		Image image = subChapter.getImage(indexOfImage);
//		Table table = subChapter.getTable(indexOfTable);

//		System.out.println(titanic);
//		System.out.println(chapter);
//		System.out.println(subChapter);
//		System.out.println(paragraph);
//		System.out.println(image);
//		System.out.println(table);
		

//		Book noapteBuna = new Book("Noapte buna, copii!");
//		Author rpGheo = new Author("Radu Pavel Gheo");
//		noapteBuna.addAuthor(rpGheo);
//		Section cap1 = new Section("Capitolul 1");
//		Section cap11 = new Section("Capitolul 1.1");
//		Section cap111 = new Section("Capitolul 1.1.1");
//		Section cap1111 = new Section("Subchapter 1.1.1.1");
//		noapteBuna.addContent(new Paragraph("Multumesc celor care au facut posibila......"));
//		noapteBuna.addContent(cap1);
//		
//		cap1.add(new Paragraph("Moto capitol"));
//		cap1.add(cap11);
//		cap11.add(new Paragraph("Text from subchapter 1.1"));
//		cap11.add(cap111);
//		cap111.add(new Paragraph("Text from subchapter 1.1.1"));
//		cap111.add(cap1111);
//		cap1111.add(new Image("Image subchapter 1.1.1.1"));
//		noapteBuna.print();
		
//		
//		long startTime = System.currentTimeMillis();
//		ImageProxy img1 = new ImageProxy("Pamela Anderson");
//		ImageProxy img2 = new ImageProxy("Kim Kardashian");
//		ImageProxy img3 = new ImageProxy("Kirby Griffin");
//		Section playboyS1 = new Section("Front Cover");
//		playboyS1.add(img1);
//		Section playboyS2 = new Section("Summer Girls");
//		playboyS2.add(img2);
//		playboyS2.add(img3);
//		Book playboy = new Book("Playboy");
//		playboy.addContent(playboyS1);
//		playboy.addContent(playboyS2);
//		long endTime = System.currentTimeMillis();
//		System.out.println("Creation of the content took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing of the section 1 took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing again the section 1 took " + (endTime -
//		startTime) + " milliseconds");
		
		
			Section cap1 = new Section("Capitolul 1");
			Paragraph p1 = new Paragraph("Paragraph 1");
			cap1.add(p1);
			Paragraph p2 = new Paragraph("Paragraph 2");
			cap1.add(p2);
			Paragraph p3 = new Paragraph("Paragraph 3");
			cap1.add(p3);
			Paragraph p4 = new Paragraph("Paragraph 4");
			cap1.add(p4);
			System.out.println("Printing without Alignment");

			System.out.println();
			cap1.print();
			p1.setAlignStrategy(new AlignCenter());
			p2.setAlignStrategy(new AlignRight());
			p3.setAlignStrategy(new AlignLeft());
			System.out.println();
			System.out.println("Printing with Alignment");
			System.out.println();
			cap1.print();

	}
}
