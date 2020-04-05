package br.cesjf.library.model;

import br.cesjf.library.dao.PublisherDAO;

public class MagazineFactory implements PublicationFactory {

    private static MagazineFactory magazineFactory;

    public Publication createPublication() {
        return new Magazine();
    }

    public static MagazineFactory getInstance() {
        if (magazineFactory == null) {
            magazineFactory = new MagazineFactory();
        }
        return magazineFactory;
    }

}