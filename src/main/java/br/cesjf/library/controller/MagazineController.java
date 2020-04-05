package br.cesjf.library.controller;

import br.cesjf.library.dao.MagazineDAO;
import br.cesjf.library.model.Magazine;
import br.cesjf.library.model.MagazineFactory;
import br.cesjf.library.model.Publisher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagazineController {

    private Magazine magazine;
    private List<Magazine> magazines;
    private PublisherController publisherController;

    public MagazineController() {
        this.clear();
        publisherController = new PublisherController();
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

    public void findByTitle(String title) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("title", title));
        magazines = MagazineDAO.getInstance().findByNamedQuery("Magazine.findByTitle", parameters);
    }

    public void findByEdition(String edition) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("edition", edition));
        magazines = MagazineDAO.getInstance().findByNamedQuery("Magazine.findByEdition", parameters);
    }

    public void findByYear(Integer year) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("year", year));
        magazines = MagazineDAO.getInstance().findByNamedQuery("Magazine.findByYear", parameters);
    }

    public void findAll() {
        magazines = MagazineDAO.getInstance().getList();
    }
    
    public List<Publisher> findPublishers() {
        publisherController.findAll();
        return publisherController.getPublishers();
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