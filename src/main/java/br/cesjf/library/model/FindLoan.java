package br.cesjf.library.model;

import br.cesjf.library.controller.CopyController;
import br.cesjf.library.controller.UserController;
import br.cesjf.library.dao.LoanDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FindLoan implements Find {
    
    private List list;
    private CopyController copyController;
    private UserController userController;
    
    public FindLoan() {
        copyController = new CopyController();
        userController = new UserController();
    }

    @Override
    public List find(String by, String parameter) {
        list = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        switch(by) {
            case "Id":
                findById(Long.parseLong(parameter));
                break;
            case "LoanDate":
                try {
                    Date date = format.parse(parameter);
                    findByLoanDate(date);
                } catch (Exception e) {}
                break;
            case "ExpectedReturnDate":
                try {
                    Date date = format.parse(parameter);
                    findByExpectedReturnDate(date);
                } catch (Exception e) {}
                break;
            case "ReturnDate":
                try {
                    Date date = format.parse(parameter);
                    findByReturnDate(date);
                } catch (Exception e) {}
                break;
            case "All":
                findAll();
                break;
            case "Copies":
                findCopies();
                break;
            case "Users":
                findUsers();
                break;
        }
        return list;
    }
    
    private void findById(Long id) {
        list.add(LoanDAO.getInstance().find(id));
    }

    private void findByLoanDate(Date loanDate) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("loanDate", loanDate));
        list = LoanDAO.getInstance().findByNamedQuery("Loan.findByLoanDate", parameters);
    }

    private void findByExpectedReturnDate(Date expectedReturnDate) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("expectedReturnDate", expectedReturnDate));
        list = LoanDAO.getInstance().findByNamedQuery("Loan.findByExpectedReturnDate", parameters);
    }

    private void findByReturnDate(Date returnDate) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("returnDate", returnDate));
        list = LoanDAO.getInstance().findByNamedQuery("Loan.findByReturnDate", parameters);
    }

    private void findAll() {
        list = LoanDAO.getInstance().getList();
    }
    
    private void findCopies() {
        copyController.findAll();
        list = copyController.getCopies();
    }
    
    private void findUsers() {
        userController.findAll();
        list = userController.getUsers();
    } 
    
}
