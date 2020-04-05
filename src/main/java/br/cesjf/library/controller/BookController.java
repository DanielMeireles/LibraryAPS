package br.cesjf.library.controller;

import br.cesjf.library.dao.BookDAO;
import br.cesjf.library.model.Author;
import br.cesjf.library.model.Book;
import br.cesjf.library.model.BookFactory;
import br.cesjf.library.model.Publisher;
import br.cesjf.library.model.Subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookController {

    private Book book;
    private List<Book> books;
    private PublisherController publisherController;
    private AuthorController authorController;
    private SubjectController subjectController;

    public BookController() {
        this.clear();
        publisherController = new PublisherController();
        authorController = new AuthorController();
        subjectController = new SubjectController();
    }

    public void save(Book book) {
        BookDAO.getInstance().persist(book);
    }

    public void delete(Book book) {
        BookDAO.getInstance().remove(book.getId());
    }

    public void findById(Long id) {
        books.add(BookDAO.getInstance().find(id));
    }

    public void findByTitle(String title) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("title", title));
        books = BookDAO.getInstance().findByNamedQuery("Book.findByTitle", parameters);
    }

    public void findByIsbn(String isbn) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("isbn", isbn));
        books = BookDAO.getInstance().findByNamedQuery("Book.findByIsbn", parameters);
    }

    public void findByEdition(String edition) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("edition", edition));
        books = BookDAO.getInstance().findByNamedQuery("Book.findByEdition", parameters);
    }

    public void findByYear(Integer year) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("year", year));
        books = BookDAO.getInstance().findByNamedQuery("Book.findByYear", parameters);
    }

    public void findAll() {
        books = BookDAO.getInstance().getList();
    }
    
    public List<Publisher> findPublishers() {
        publisherController.findAll();
        return publisherController.getPublishers();
    }
    
    public List<Author> findAuthors() {
        authorController.findAll();
        return authorController.getAuthors();
    }
    
    public List<Subject> findSubjects() {
        subjectController.findAll();
        return subjectController.getSubjects();
    }

    public void clear() {
        book = (Book) BookFactory.getInstance().createPublication();
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List books) {
        this.books = books;
    }

}