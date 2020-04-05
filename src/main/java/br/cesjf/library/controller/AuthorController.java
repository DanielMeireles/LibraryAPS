package br.cesjf.library.controller;

import br.cesjf.library.dao.AuthorDAO;
import br.cesjf.library.model.Author;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuthorController {

    private Author author;
    private List<Author> authors;

    public AuthorController() {
        this.clear();
    }
    
    public AuthorController(Author author) {
        this.author = author;
    }

    public void save() {
        AuthorDAO.getInstance().persist(author);
    }

    public void delete() {
        AuthorDAO.getInstance().remove(author.getId());
    }

    public void findById(Long id) {
        authors.add(AuthorDAO.getInstance().find(id));
    }

    public void findByName(String name) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("name", name));
        authors = AuthorDAO.getInstance().findByNamedQuery("Author.findByName", parameters);
    }

    public void findAll() {
        authors = AuthorDAO.getInstance().getList();
    }

    public void clear() {
        author = Author.Builder
                .newInstance()
                .build();
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List authors) {
        this.authors = authors;
    }

}