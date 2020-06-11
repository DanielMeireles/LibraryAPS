package br.cesjf.library.controller;

import br.cesjf.library.dao.CopyDAO;
import br.cesjf.library.dao.LoanDAO;
import br.cesjf.library.model.CareTaker;
import br.cesjf.library.model.Copy;
import br.cesjf.library.model.Loan;
import br.cesjf.library.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class LoanController {

    private Loan loan;
    private List<Loan> loans;
    private CopyController copyController;
    private UserController userController;
    private CareTaker careTaker;

    public LoanController() {
        this.clear();
        copyController = new CopyController();
        userController = new UserController();
        careTaker = new CareTaker();
    }
    
    public LoanController(Loan loan) {
        copyController = new CopyController();
        userController = new UserController();
        this.loan = loan;
        careTaker = new CareTaker();
        careTaker.addMemento(loan);
    }

    public void save() {
        LoanDAO.getInstance().persist(loan);
        this.setState();
    }
    
    public void delete() {
        LoanDAO.getInstance().remove(loan.getId());
    }
    
    public void undo() {
        Loan state = (Loan) careTaker.getMemento();
        if(state != null) {
            this.loan = state;
        }
    }
    
    public void setState() {
        careTaker.addMemento(this.loan);
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
    
    public List<Copy> findCopies() {
        copyController.findAll();
        return copyController.getCopies();
    } 
    
    public List<Copy> findCopiesAvailables(Date date) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("date", date));
        parameters.add(Arrays.asList("reservationId", null));
        parameters.add(Arrays.asList("loanId", loan.getId()));
        return CopyDAO.getInstance().findByNamedQuery("Copy.findByAvailableOnDate", parameters);
    }
    
    public List<User> findUsers() {
        userController.findAll();
        return userController.getUsers();
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

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List loans) {
        this.loans = loans;
    }

}