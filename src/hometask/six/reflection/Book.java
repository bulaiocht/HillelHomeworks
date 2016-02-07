package hometask.six.reflection;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Arrays;


/**
 * Created by horsey on 21.01.16.
 */
public class Book implements Serializable{
    private String author;
    private String title;
    private int copyNum;
    private int year;
    private int pageNum;
    private BookGenre genre;

    public Book () {
        this.author = "none";
        this.title = "none";
        this.copyNum = 0;
        this.year = 1000;
        this.pageNum = 0;
        this.genre = BookGenre.NONE;
    }

    public Book(String author, String title, int copyNum, int year, int pageNum, BookGenre genre) {
        this.author = author;
        this.title = title;
        this.copyNum = copyNum;
        this.year = year;
        this.pageNum = pageNum;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    @DummyAnnotation
    public void setAuthor(String author) {
        this.author = author;
        System.out.println("Author name is " + author);
    }

    public String getTitle() {
        return title;
    }

    @DummyAnnotation
    public void setTitle(String title) {
        this.title = title;
        System.out.println("Title is " + title);
    }

    public int getCopyNum() {
        return copyNum;
    }

    public void setCopyNum(int copyNum) {
        this.copyNum = copyNum;
        System.out.println("Number of copies " + copyNum);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public BookGenre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "\n" + "Book" + "\n" +
                "author: " + author + "\n" +
                "book title: " + title + "\n" +
                "number of copies: " + copyNum + "\n" +
                "year of production: " + year + "\n" +
                "number of pages: " + pageNum + "\n" +
                "book genre: " + genre.toString();
    }


}
