class Book{
	String title;
	String author;
	int numberOfPages;
	String ISBN;
	
	public Book(String input1, String input2, int input3) {
	title = input1;
	author = input2;
	numberOfPages = input3;
	}
	
	// compute initials of author's last name 
	public String getInitials() {
		String initials = "";
		for(int i = 0; i<author.length(); i++) {
			char currentChar = author.charAt(i);
			if (currentChar >= 'A' && currentChar <= 'Z')
				initials = initials + currentChar + '.';
		}
		return initials;
	}
	
}

public class ExampleBook4 {
	public static void main(String []args) {
		Book b;
		
		b = new Book("Thinking in Java", "Bruce Eckel", 1129);
		System.out.println("Initals: " + b.getInitials());
	}
}
