package br.cesjf.library.dao;

import br.cesjf.library.model.Subject;
import java.io.Serializable;

public class SubjectDAO extends GenericDAO<Subject, Long> implements Serializable {

    public static SubjectDAO subjectDAO;

    public SubjectDAO() {
        super(Subject.class);
    }

    public static SubjectDAO getInstance() {
        if (subjectDAO == null) {
            subjectDAO = new SubjectDAO();
        }
        return subjectDAO;
    }

}