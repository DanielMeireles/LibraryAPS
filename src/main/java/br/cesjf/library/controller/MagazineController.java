package br.cesjf.library.controller;

import br.cesjf.library.dao.MagazineDAO;
import br.cesjf.library.model.Magazine;
import br.cesjf.library.model.MagazineFactory;

import java.util.List;

public class MagazineController {

    private Magazine magazine;
    private List<Magazine> magazines;

    private MagazineController() {
        this.clear();
    }

    public void save(Magazine magazine) {
        MagazineDAO.getInstance().persist(magazine);
    }

    public void delete(Magazine magazine) {
        MagazineDAO.getInstance().remove(magazine.getId());
    }

    public void findById(Long id) {
        magazines.add(MagazineDAO.getInstance().find(id));
    }

    public void findAll() {
        magazines = MagazineDAO.getInstance().getList();
    }

    public void clear() {
        magazine = (Magazine) MagazineFactory.getInstance().createPublication();
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public List getMagazines() {
        return magazines;
    }

    public void setMagazines(List magazines) {
        this.magazines = magazines;
    }

}