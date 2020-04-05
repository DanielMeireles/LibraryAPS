package br.cesjf.library.dao;

import br.cesjf.library.model.User;
import java.io.Serializable;

public class UserDAO extends GenericDAO<User, Long> implements Serializable {

    public static UserDAO subjectDAO;

    private UserDAO() {
        super(User.class);
    }

    public static UserDAO getInstance() {
        if (subjectDAO == null) {
            subjectDAO = new UserDAO();
        }
        return subjectDAO;
    }

}