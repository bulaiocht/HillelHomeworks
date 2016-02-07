
package hometask.six.reflection;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by horsey on 23.01.16.
 */

public class BiblioItem extends Book implements Serializable {

    private int bookCode;
    private String bookTaker;
    private String author;
    private String title;
    private int copyNum;
    private int year;
    private int pageNum;
    private BookGenre genre;

    public BiblioItem (Book book, String bookTaker) {
        this.bookCode = book.getGenre().getCode();
        this.bookTaker = bookTaker;
        this.author = book.getAuthor();
        this.title = book.getTitle();
        this.year = book.getYear();
        this.copyNum = book.getCopyNum();
        this.pageNum = book.getPageNum();
        this.genre = book.getGenre();
    }

    public int getBookCode() {
        return bookCode;
    }

    public String getBookTaker() {
        return bookTaker;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getCopyNum() {
        return copyNum;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public int getPageNum() {
        return pageNum;
    }

    @Override
    public BookGenre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "\n" + "Book taken" + "\n" +
                "author: " + this.author +"\n" +
                "book title: " + this.title + "\n" +
                "book genre: " + genre.toString() + "\n" +
                "taker: " + this.bookTaker + "\n" +
                "book code: "  + this.bookCode;
    }
}