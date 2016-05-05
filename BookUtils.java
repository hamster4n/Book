package lesson2.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Hamster4n.
 */
public class BookUtils {

    public BookUtils() {

    }

    public static List<Book> findBookByAuthor(List<Book> books, String author) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (Objects.equals(book.getAuthor(), author)) {
                results.add(book);
            }
        }
        return results;
    }

    public static List<Book> findBookByPublishingHouse(List<Book> books, String publishingHouse) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (Objects.equals(book.getPublishingHouse(), publishingHouse)) {
                results.add(book);
            }
        }
        return results;
    }

    public static List<Book> findBookByUnderYear(List<Book> books, int yearOfPublishing) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfPublishing() >= yearOfPublishing) {
                results.add(book);
            }
        }
        return results;
    }
}
