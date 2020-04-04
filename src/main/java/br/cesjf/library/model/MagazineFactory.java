package br.cesjf.library.model;

public class MagazineFactory implements PublicationFactory {

    public Publication createPublication() {
        return new Magazine();
    }

}
