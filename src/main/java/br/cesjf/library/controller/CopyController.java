package br.cesjf.library.controller;

import br.cesjf.library.dao.CopyDAO;
import br.cesjf.library.model.Book;
import br.cesjf.library.model.Copy;
import br.cesjf.library.model.Magazine;
import br.cesjf.library.model.Publication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyController {

    private Copy copy;
    private List<Copy> copies;
    private BookController bookController;
    private MagazineController magazineController;
    private List<Book> books;
    private List<Magazine> magazines;

    public CopyController() {
        bookController = new BookController();
        magazineController = new MagazineController();
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
    
    public void findBooks() {
        bookController.findAll();
        books = bookController.getBooks();
    }
    
    public void findMagazines() {
        magazineController.findAll();
        magazines = magazineController.getMagazines();
    }
    
    public List<Publication> findPublications() {
        List<Publication> publications = new ArrayList<Publication>();
        
        this.findBooks();
        for(Publication p: books) {
            publications.add(p);
        }
        
        this.findMagazines();
        for(Publication p: magazines) {
            publications.add(p);
        }
        
        return publications;
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

    public List<Copy> getCopies() {
        return copies;
    }

    public void setCopies(List copies) {
        this.copies = copies;
    }

}