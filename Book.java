package lesson2.book;

/**
 * Created by Hamster4n.
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfPages;
    private float price;
    private String bindingType;

    public Book(){

    }

    public int getId() {
        return id;
    }

    public Book setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public Book setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
        return this;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public Book setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
        return this;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Book setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public Book setPrice(float price) {
        this.price = price;
        return this;
    }

    public String getBindingType() {
        return bindingType;
    }

    public Book setBindingType(String bindingType) {
        this.bindingType = bindingType;
        return this;
    }

    @Override
    public String toString(){
        return "Book {" + "id= " + id +
                ", Название: " + title +
                ", Автор: " + author +
                ", Издательство: " + publishingHouse +
                ", Год выпуска: " + yearOfPublishing +
                ", Колличество страниц: " + numberOfPages +
                ", Цена: " + price +
                ", Переплёт: " + bindingType;
    }

}
