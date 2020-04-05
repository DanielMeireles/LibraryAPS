package br.cesjf.library.dao;

import br.cesjf.library.model.Copy;
import java.io.Serializable;

public class CopyDAO extends GenericDAO<Copy, Long> implements Serializable {

    public static CopyDAO subjectDAO;

    private CopyDAO() {
        super(Copy.class);
    }

    public static CopyDAO getInstance() {
        if (subjectDAO == null) {
            subjectDAO = new CopyDAO();
        }
        return subjectDAO;
    }

}