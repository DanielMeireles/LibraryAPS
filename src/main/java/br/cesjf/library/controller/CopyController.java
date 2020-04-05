package br.cesjf.library.controller;

import br.cesjf.library.dao.CopyDAO;
import br.cesjf.library.model.Copy;

import java.util.List;

public class CopyController {

    private Copy copy;
    private List<Copy> copies;

    private CopyController() {
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

    public void findAll() {
        copies = CopyDAO.getInstance().getList();
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