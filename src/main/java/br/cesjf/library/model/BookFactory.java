package br.cesjf.library.model;

public class BookFactory implements PublicationFactory {

    private static BookFactory bookFactory;

    public Publication createPublication() {
        return new Book();
    }

    public static BookFactory getInstance() {
        if (bookFactory == null) {
            bookFactory = new BookFactory();
        }
        return bookFactory;
    }

}