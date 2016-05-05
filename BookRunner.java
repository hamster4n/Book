package lesson2.book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hamster4n.
 */
public class BookRunner {
    public static void main(String[] args) {

        List<Book> books = createBooks();

        List<Book> bookByAuthor = BookUtils.findBookByAuthor(books, "Ванчухов Богдан");
        System.out.println("Книги, написанные Ванчуховым Богадном: " + bookByAuthor);

        List<Book> bookByPublishingHouse = BookUtils.findBookByPublishingHouse(books,"Космос");
        System.out.println("Книги, выпущенные издательством Космос: " + bookByPublishingHouse);

        List<Book> bookByUnderYear = BookUtils.findBookByUnderYear(books, 2016);
        System.out.println("Книги, выпущенные с 2016 года: " + bookByUnderYear);


    }

    public static List<Book> createBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book()
                .setId(1)
                .setTitle("Как выковать программиста из гуманитария?")
                .setAuthor("Ванчухов Богдан")
                .setPublishingHouse("Космос")
                .setYearOfPublishing(2016)
                .setNumberOfPages(512)
                .setPrice(399.47F)
                .setBindingType("твёрдый")
        );
        books.add(new Book()
                .setId(2)
                .setTitle("Как стать Java junior за полгода?")
                .setAuthor("Скачков Алексей")
                .setPublishingHouse("Улыбка")
                .setYearOfPublishing(2017)
                .setNumberOfPages(313)
                .setPrice(199.99F)
                .setBindingType("твёрдый")
        );
        books.add(new Book()
                .setId(3)
                .setTitle("Полевые заметки девелопера")
                .setAuthor("Билл Гейтс")
                .setPublishingHouse("Микрософт")
                .setYearOfPublishing(2012)
                .setNumberOfPages(125)
                .setPrice(19.99F)
                .setBindingType("мягкий")
        );
        books.add(new Book()
                .setId(4)
                .setTitle("Как рыбачить не отвлекаясь от кодинга?")
                .setAuthor("Скачков Алексей")
                .setPublishingHouse("Космос")
                .setYearOfPublishing(2018)
                .setNumberOfPages(178)
                .setPrice(190.F)
                .setBindingType("мягкий")
        );
        books.add(new Book()
                .setId(5)
                .setTitle("Java или бухать? Выбор современного студента.")
                .setAuthor("Ванчухов Богдан")
                .setPublishingHouse("Микрософт")
                .setYearOfPublishing(2017)
                .setNumberOfPages(99)
                .setPrice(101.01F)
                .setBindingType("мягкий")
        );

        return books;
    }
}
