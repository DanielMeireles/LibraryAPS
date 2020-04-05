package br.cesjf.library.controller;

import br.cesjf.library.dao.LoanDAO;
import br.cesjf.library.model.Loan;

import java.util.List;

public class LoanController {

    private Loan loan;
    private List<Loan> loans;

    private LoanController() {
        this.clear();
    }

    public void save(Loan loan) {
        LoanDAO.getInstance().persist(loan);
    }

    public void delete(Loan loan) {
        LoanDAO.getInstance().remove(loan.getId());
    }

    public void findById(Long id) {
        loans.add(LoanDAO.getInstance().find(id));
    }

    public void findAll() {
        loans = LoanDAO.getInstance().getList();
    }

    public void clear() {
        loan = Loan.Builder
                .newInstance()
                .build();
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public List getLoans() {
        return loans;
    }

    public void setLoans(List loans) {
        this.loans = loans;
    }

}