package br.cesjf.library.controller;

import br.cesjf.library.dao.MagazineDAO;
import br.cesjf.library.model.Author;
import br.cesjf.library.model.Find;
import br.cesjf.library.model.FindMagazine;
import br.cesjf.library.model.Magazine;
import br.cesjf.library.model.MagazineFactory;
import br.cesjf.library.model.Publisher;
import br.cesjf.library.model.Subject;

import java.util.List;

public class MagazineController {

    private Magazine magazine;
    private List<Magazine> magazines;
    private PublisherController publisherController;
    private AuthorController authorController;
    private SubjectController subjectController;

    public MagazineController() {
        this.clear();
        publisherController = new PublisherController();
        authorController = new AuthorController();
        subjectController = new SubjectController();
    }
    
    public MagazineController(Magazine magazine) {
        publisherController = new PublisherController();
        authorController = new AuthorController();
        subjectController = new SubjectController();
        this.magazine = magazine;
        setState();
    }

    public void save() {
        setState();
        MagazineDAO.getInstance().persist(magazine);
    }

    public void delete() {
        MagazineDAO.getInstance().remove(magazine.getId());
    }

    public void findById(Long id) {
        Find find = new FindMagazine();
        magazines = find.find("Id", Long.toString(id));
    }

    public void findByTitle(String title) {
        Find find = new FindMagazine();
        magazines = find.find("Title", title);
    }

    public void findByEdition(String edition) {
        Find find = new FindMagazine();
        magazines = find.find("Edition", edition);
    }

    public void findByYear(Integer year) {
        Find find = new FindMagazine();
        magazines = find.find("Year", Integer.toString(year));
    }

    public void findAll() {
        Find find = new FindMagazine();
        magazines = find.find("All", "");
    }
    
    public List<Publisher> findPublishers() {
        Find find = new FindMagazine();
        return find.find("Publishers", "");
    }
    
    public List<Author> findAuthors() {
        Find find = new FindMagazine();
        return find.find("Authors", "");
    }
    
    public List<Subject> findSubjects() {
        Find find = new FindMagazine();
        return find.find("Subjects", "");
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

    public List<Magazine> getMagazines() {
        return magazines;
    }

    public void setMagazines(List magazines) {
        this.magazines = magazines;
    }
    
    public void setState() {
        magazine.setState();
    }
    
    public void getState() {
        magazine = (Magazine) magazine.getState();
    }

}