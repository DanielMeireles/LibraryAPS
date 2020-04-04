package br.cesjf.library.dao;

import br.cesjf.library.model.Publisher;
import java.io.Serializable;

public class PublisherDAO extends GenericDAO<Publisher, Long> implements Serializable {

    public static PublisherDAO subjectDAO;

    public PublisherDAO() {
        super(Publisher.class);
    }

    public static PublisherDAO getInstance() {
        if (subjectDAO == null) {
            subjectDAO = new PublisherDAO();
        }
        return subjectDAO;
    }

}