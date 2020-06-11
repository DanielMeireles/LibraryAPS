package br.cesjf.library.model;

import br.cesjf.library.controller.AuthorController;
import br.cesjf.library.controller.PublisherController;
import br.cesjf.library.controller.SubjectController;
import br.cesjf.library.dao.BookDAO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindBook implements Find {
    
    private List list;
    private PublisherController publisherController;
    private AuthorController authorController;
    private SubjectController subjectController;
    
    public FindBook() {
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
            case "Isbn":
                findByIsbn(parameter);
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
        list.add(BookDAO.getInstance().find(id));
    }

    private void findByTitle(String title) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("title", title));
        list = BookDAO.getInstance().findByNamedQuery("Book.findByTitle", parameters);
    }

    private void findByIsbn(String isbn) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("isbn", isbn));
        list = BookDAO.getInstance().findByNamedQuery("Book.findByIsbn", parameters);
    }

    private void findByEdition(String edition) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("edition", edition));
        list = BookDAO.getInstance().findByNamedQuery("Book.findByEdition", parameters);
    }

    private void findByYear(Integer year) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("year", year));
        list = BookDAO.getInstance().findByNamedQuery("Book.findByYear", parameters);
    }

    private void findAll() {
        list = BookDAO.getInstance().getList();
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
