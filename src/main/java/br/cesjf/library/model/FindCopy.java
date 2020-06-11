package br.cesjf.library.model;

import br.cesjf.library.controller.BookController;
import br.cesjf.library.controller.MagazineController;
import br.cesjf.library.dao.CopyDAO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCopy implements Find {
    
    private List list;
    private BookController bookController;
    private MagazineController magazineController;
    
    public FindCopy() {
        bookController = new BookController();
        magazineController = new MagazineController();
    }

    @Override
    public List find(String by, String parameter) {
        list = new ArrayList<>();
        switch(by) {
            case "Id":
                findById(Long.parseLong(parameter));
                break;
            case "Loanable":
                findByLoanable(Boolean.parseBoolean(parameter));
                break;
            case "All":
                findAll();
                break;
            case "Publications":
                findPublications();
                break;
        }
        return list;
    }
    
    private void findById(Long id) {
        list.add(CopyDAO.getInstance().find(id));
    }

    private void findByLoanable(Boolean loanable) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("loanable", loanable));
        list = CopyDAO.getInstance().findByNamedQuery("Copy.findByLoanable", parameters);
    }

    private void findAll() {
        list = CopyDAO.getInstance().getList();
    }
    
    private List findBooks() {
        bookController.findAll();
        return bookController.getBooks();
    }
    
    private List findMagazines() {
        magazineController.findAll();
        return magazineController.getMagazines();
    }
    
    private void findPublications() {
        List<Book> books = findBooks();
        for(Publication p: books) {
            list.add(p);
        }
        List<Magazine> magazines = findMagazines();
        for(Publication p: magazines) {
            list.add(p);
        }
    }
    
}
