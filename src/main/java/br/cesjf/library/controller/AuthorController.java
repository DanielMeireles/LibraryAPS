package br.cesjf.library.controller;

import br.cesjf.library.dao.AuthorDAO;
import br.cesjf.library.model.Author;

import java.util.List;

public class AuthorController {

    private Author author;
    private List<Author> authors;

    private AuthorController() {
        this.clear();
    }

    public void save(Author author) {
        AuthorDAO.getInstance().persist(author);
    }

    public void delete(Author author) {
        AuthorDAO.getInstance().remove(author.getId());
    }

    public void findById(Long id) {
        authors.add(AuthorDAO.getInstance().find(id));
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

    public List getAuthors() {
        return authors;
    }

    public void setAuthors(List authors) {
        this.authors = authors;
    }

}