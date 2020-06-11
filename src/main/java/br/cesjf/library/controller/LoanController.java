package br.cesjf.library.controller;

import br.cesjf.library.dao.CopyDAO;
import br.cesjf.library.dao.LoanDAO;
import br.cesjf.library.model.Copy;
import br.cesjf.library.model.Find;
import br.cesjf.library.model.FindLoan;
import br.cesjf.library.model.Loan;
import br.cesjf.library.model.User;
import java.text.SimpleDateFormat;

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
    
    public LoanController(Loan loan) {
        this.loan = loan;
    }

    public void save() {
        LoanDAO.getInstance().persist(loan);
    }
    
    public void delete() {
        LoanDAO.getInstance().remove(loan.getId());
    }

    public void findById(Long id) {
        Find find = new FindLoan();
        loans = find.find("Id", Long.toString(id));
    }

    public void findByLoanDate(Date loanDate) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Find find = new FindLoan();
        loans = find.find("LoanDate", format.format(loanDate));
    }

    public void findByExpectedReturnDate(Date expectedReturnDate) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Find find = new FindLoan();
        loans = find.find("ExpectedReturnDate", format.format(expectedReturnDate));
    }

    public void findByReturnDate(Date returnDate) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Find find = new FindLoan();
        loans = find.find("ReturnDate", format.format(returnDate));
    }

    public void findAll() {
        Find find = new FindLoan();
        loans = find.find("All", "");
    }
    
    public List<Copy> findCopies() {
        Find find = new FindLoan();
        return find.find("Copies", "");
    } 
    
    public List<Copy> findCopiesAvailables(Date date) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("date", date));
        parameters.add(Arrays.asList("reservationId", null));
        parameters.add(Arrays.asList("loanId", loan.getId()));
        return CopyDAO.getInstance().findByNamedQuery("Copy.findByAvailableOnDate", parameters);
    }
    
    public List<User> findUsers() {
        Find find = new FindLoan();
        return find.find("Users", "");
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
        this.loan.setId(loan.getId());
        this.loan.setLoanDate(loan.getLoanDate());
        this.loan.setExpectedReturnDate(loan.getExpectedReturnDate());
        this.loan.setReturnDate(loan.getReturnDate());
        this.loan.setIdCopy(loan.getIdCopy());
        this.loan.setIdUser(loan.getIdUser());
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List loans) {
        this.loans = loans;
    }

}