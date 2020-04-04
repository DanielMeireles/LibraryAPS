package br.cesjf.library.model;

public class BookFactory implements PublicationFactory {

    public Publication createPublication() {
        return new Book();
    }

}