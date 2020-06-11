package br.cesjf.library.controller;

import br.cesjf.library.dao.CopyDAO;
import br.cesjf.library.model.Copy;
import br.cesjf.library.model.Find;
import br.cesjf.library.model.FindCopy;
import br.cesjf.library.model.Publication;

import java.util.List;

public class CopyController {

    private Copy copy;
    private List<Copy> copies;
    

    public CopyController() {
        this.clear();
    }
    
    public CopyController(Copy copy) {
        this.copy = copy;
    }

    public void save() {
        CopyDAO.getInstance().persist(copy);
    }

    public void delete() {
        CopyDAO.getInstance().remove(copy.getId());
    }

    public void findById(Long id) {
        Find find = new FindCopy();
        copies = find.find("Id", Long.toString(id));
    }

    public void findByLoanable(Boolean loanable) {
        Find find = new FindCopy();
        copies = find.find("Loanable", Boolean.toString(loanable));
    }

    public void findAll() {
        Find find = new FindCopy();
        copies = find.find("All", "");
    }
    
    public List<Publication> findPublications() {
        Find find = new FindCopy();
        return find.find("Publications", "");
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