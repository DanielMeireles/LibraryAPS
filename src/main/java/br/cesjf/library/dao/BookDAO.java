package br.cesjf.library.dao;

import br.cesjf.library.model.Book;
import java.io.Serializable;

public class BookDAO extends GenericDAO<Book, Long> implements Serializable {

    public static BookDAO subjectDAO;

    public BookDAO() {
        super(Book.class);
    }

    public static BookDAO getInstance() {
        if (subjectDAO == null) {
            subjectDAO = new BookDAO();
        }
        return subjectDAO;
    }

}