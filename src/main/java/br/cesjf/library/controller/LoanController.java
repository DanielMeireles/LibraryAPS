package br.cesjf.library.controller;

import br.cesjf.library.dao.LoanDAO;
import br.cesjf.library.model.Loan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class LoanController {

    private Loan loan;
    private List<Loan> loans;

    public LoanController() {
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

    public void findByLoanDate(Date loanDate) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("loanDate", loanDate));
        loans = LoanDAO.getInstance().findByNamedQuery("Loan.findByLoanDate", parameters);
    }

    public void findByExpectedReturnDate(Date expectedReturnDate) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("expectedReturnDate", expectedReturnDate));
        loans = LoanDAO.getInstance().findByNamedQuery("Loan.findByExpectedReturnDate", parameters);
    }

    public void findByReturnDate(Date returnDate) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("returnDate", returnDate));
        loans = LoanDAO.getInstance().findByNamedQuery("Loan.findByReturnDate", parameters);
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