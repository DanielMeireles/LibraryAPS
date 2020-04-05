package br.cesjf.library.dao;

import br.cesjf.library.model.Loan;
import java.io.Serializable;

public class LoanDAO extends GenericDAO<Loan, Long> implements Serializable {

    private static LoanDAO subjectDAO;

    public LoanDAO() {
        super(Loan.class);
    }

    public static LoanDAO getInstance() {
        if (subjectDAO == null) {
            subjectDAO = new LoanDAO();
        }
        return subjectDAO;
    }

}