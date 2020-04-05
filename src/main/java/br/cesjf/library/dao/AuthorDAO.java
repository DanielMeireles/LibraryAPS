package br.cesjf.library.dao;

import br.cesjf.library.model.Author;
import java.io.Serializable;

public class AuthorDAO extends GenericDAO<Author, Long> implements Serializable {

    public static AuthorDAO subjectDAO;

    private AuthorDAO() {
        super(Author.class);
    }

    public static AuthorDAO getInstance() {
        if (subjectDAO == null) {
            subjectDAO = new AuthorDAO();
        }
        return subjectDAO;
    }

}