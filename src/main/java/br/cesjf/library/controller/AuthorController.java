package br.cesjf.library.controller;

import br.cesjf.library.dao.AuthorDAO;
import br.cesjf.library.model.Author;
import br.cesjf.library.model.Find;
import br.cesjf.library.model.FindAuthor;

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
        Find find = new FindAuthor();
        authors = find.find("Id", Long.toString(id));
    }

    public void findByName(String name) {
        Find find = new FindAuthor();
        authors = find.find("Name", name);
    }

    public void findAll() {
        Find find = new FindAuthor();
        authors = find.find("All", "");
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