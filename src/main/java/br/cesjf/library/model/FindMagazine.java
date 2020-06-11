package br.cesjf.library.model;

import br.cesjf.library.controller.AuthorController;
import br.cesjf.library.controller.PublisherController;
import br.cesjf.library.controller.SubjectController;
import br.cesjf.library.dao.MagazineDAO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMagazine implements Find {
    
    private List list;
    private PublisherController publisherController;
    private AuthorController authorController;
    private SubjectController subjectController;
    
    public FindMagazine() {
        publisherController = new PublisherController();
        authorController = new AuthorController();
        subjectController = new SubjectController();
    }

    @Override
    public List find(String by, String parameter) {
        list = new ArrayList<>();
        switch(by) {
            case "Id":
                findById(Long.parseLong(parameter));
                break;
            case "Title":
                findByTitle(parameter);
                break;
            case "Edition":
                findByEdition(parameter);
                break;
            case "Year":
                findByYear(Integer.parseInt(parameter));
                break;
            case "All":
                findAll();
                break;
            case "Publishers":
                findPublishers();
                break;
            case "Authors":
                findAuthors();
                break;
            case "Subjects":
                findSubjects();
                break;
        }
        return list;
    }
    
    private void findById(Long id) {
        list.add(MagazineDAO.getInstance().find(id));
    }

    private void findByTitle(String title) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("title", title));
        list = MagazineDAO.getInstance().findByNamedQuery("Magazine.findByTitle", parameters);
    }

    private void findByEdition(String edition) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("edition", edition));
        list = MagazineDAO.getInstance().findByNamedQuery("Magazine.findByEdition", parameters);
    }

    private void findByYear(Integer year) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("year", year));
        list = MagazineDAO.getInstance().findByNamedQuery("Magazine.findByYear", parameters);
    }

    private void findAll() {
        list = MagazineDAO.getInstance().getList();
    }
    
    private void findPublishers() {
        publisherController.findAll();
        list = publisherController.getPublishers();
    }
    
    private void findAuthors() {
        authorController.findAll();
        list = authorController.getAuthors();
    }
    
    private void findSubjects() {
        subjectController.findAll();
        list = subjectController.getSubjects();
    }
    
}
