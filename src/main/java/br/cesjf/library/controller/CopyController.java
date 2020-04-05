package br.cesjf.library.controller;

import br.cesjf.library.dao.CopyDAO;
import br.cesjf.library.model.Book;
import br.cesjf.library.model.Copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyController {

    private Copy copy;
    private List<Copy> copies;
    private BookController bookController;

    public CopyController() {
        bookController = new BookController();
        this.clear();
    }

    public void save(Copy copy) {
        CopyDAO.getInstance().persist(copy);
    }

    public void delete(Copy copy) {
        CopyDAO.getInstance().remove(copy.getId());
    }

    public void findById(Long id) {
        copies.add(CopyDAO.getInstance().find(id));
    }

    public void findByLoanable(Boolean loanable) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("loanable", loanable));
        copies = CopyDAO.getInstance().findByNamedQuery("Copy.findByLoanable", parameters);
    }

    public void findAll() {
        copies = CopyDAO.getInstance().getList();
    }
    
    public List<Book> findBooks() {
        bookController.findAll();
        return bookController.getBooks();
    }

    public void clear() {
        copy = Copy.Builder
                .newInstance()
                .build();
    }

    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public List getCopys() {
        return copies;
    }

    public void setCopys(List copies) {
        this.copies = copies;
    }

}