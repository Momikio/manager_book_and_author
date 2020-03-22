package learnoop2.bai2.manager_book.model_and_controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String nameBook;
    private int publicationDate;
    private String butDanhAuthor;
    private static ArrayList<Book> books = new ArrayList<>();

    public static void add(Book b) {
        books.add(b);
    }

    public static void showInfoBook() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    /**
     * @param nameBook
     * @param publicationDate
     * @param butDanhAuthor
     */
    public Book(String nameBook, int publicationDate, String butDanhAuthor) {
        this.nameBook = nameBook;
        this.publicationDate = publicationDate;
        this.butDanhAuthor = butDanhAuthor;
    }

    /**
     * 
     */
    public Book() {
    }

    /**
     * @return the nameBook
     */
    public String getNameBook() {
        return nameBook;
    }

    /**
     * @param nameBook the nameBook to set
     */
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    /**
     * @return the publicationDate
     */
    public int getPublicationDate() {
        return publicationDate;
    }

    /**
     * @param publicationDate the publicationDate to set
     */
    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * @return the butDanhAuthor
     */
    public String getButDanhAuthor() {
        return butDanhAuthor;
    }

    /**
     * @param butDanhAuthor the butDanhAuthor to set
     */
    public void setButDanhAuthor(String butDanhAuthor) {
        this.butDanhAuthor = butDanhAuthor;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Book [butDanhAuthor=" + butDanhAuthor + ", nameBook=" + nameBook + ", publicationDate="
                + publicationDate + "]";
    }
    public static boolean checkPen(String pen)
    {
        for(int i =0 ; i< books.size() ; i++)
        {
            if(books.get(i).getButDanhAuthor().compareToIgnoreCase(pen)==0){
                 return true;
            }
           
        }
        return false;
    }
    public static boolean checkListBook() {
        if (books.size() == 0)
            return false;
        return true;
    }

	public static void showInfoBook(String pen) {
        for(Book b : books)
        {
            if(b.getButDanhAuthor().compareToIgnoreCase(pen)==0)
            {
                System.out.println(b);
            }
        }
	}
}