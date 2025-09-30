package Assignment4;
import java.util.Arrays;

public class Library {
	// Add the missing implementation to this class
	
	Book[] booklist;
	int bookCount;
	String Address;
	boolean isfind; // 判断是否找到书
	boolean isAllborrowed; //判断所有同名的书是否都借出（以防图书馆有多本同样的书）
	
	public Library(String libraryAddress) {
		Address = libraryAddress;
		booklist = new Book[100];
		bookCount = 0;
		
	}
	
	public void addBook(Book book) {
		if (bookCount >= booklist.length) {
			booklist = Arrays.copyOf(booklist, booklist.length * 2); // 双倍扩容
		}
		booklist[bookCount] = book;
		bookCount++;
	}
	
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}
	
	public void printAddress() {
		System.out.println(Address);
	}
	
	public void borrowBook(String bookTitle) {
		Book book = new Book(bookTitle);
		isfind = false;
		isAllborrowed = false;
		for (int i = 0; i< bookCount ; i++) {
			if (booklist[i].getTitle().equals(bookTitle) ) { // 不能用 ==
				isfind =true;
				if (! booklist[i].borrowed) {
				booklist[i].borrowed = true;
				isAllborrowed = false;
				break;
				}
				else {
					isAllborrowed = true;
					continue;
				}
			}
		}
		if (isfind && ! isAllborrowed) {
			System.out.println("you successfully borrowed "+ book.title );
		}
		else if (isfind && isAllborrowed) {
			System.out.println("Sorry, this book is already borrowed.");
		}
		else {
			System.out.println("Sorry, this book is not in our catalog.");
		}
	}
	
	public void printAvailableBooks() {
		if (bookCount >0) {
		for (int i=0;i<bookCount;i++) {
			if (! booklist[i].borrowed)
			System.out.println(booklist[i].title);
		}
		}
		else {
			System.out.println("No book in catalog");
		}
	}
	
	public void returnBook(String bookTitle) {
		for (int i=0;i<bookCount;i++) {
			if ((booklist[i].getTitle().equals(bookTitle)) && booklist[i].borrowed ) {
				booklist[i].borrowed = false;
				System.out.println("You successfully returned The Lord of the Rings");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");
		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
//		System.out.println(firstLibrary.bookCount);
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));
//		System.out.println(firstLibrary.bookCount);
		// Print opening hours and the addresses
		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();
		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();
		// Try to borrow The Lords of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();
		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();
		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();
		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
	}
}
