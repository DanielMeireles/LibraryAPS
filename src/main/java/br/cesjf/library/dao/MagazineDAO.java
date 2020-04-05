package br.cesjf.library.dao;

import br.cesjf.library.model.Magazine;
import java.io.Serializable;

public class MagazineDAO extends GenericDAO<Magazine, Long> implements Serializable {

    private static MagazineDAO subjectDAO;

    public MagazineDAO() {
        super(Magazine.class);
    }

    public static MagazineDAO getInstance() {
        if (subjectDAO == null) {
            subjectDAO = new MagazineDAO();
        }
        return subjectDAO;
    }

}