package br.cesjf.library.controller;

import br.cesjf.library.dao.BookDAO;
import br.cesjf.library.model.Author;
import br.cesjf.library.model.Book;
import br.cesjf.library.model.BookFactory;
import br.cesjf.library.model.Find;
import br.cesjf.library.model.FindBook;
import br.cesjf.library.model.Publisher;
import br.cesjf.library.model.Subject;

import java.util.List;

public class BookController {

    private Book book;
    private List<Book> books;
    

    public BookController() {
        this.clear();
    }
    
    public BookController(Book book) {
        this.book = book;
        setState();
    }

    public void save() {
        setState();
        BookDAO.getInstance().persist(book);
    }

    public void delete() {
        BookDAO.getInstance().remove(book.getId());
    }

    public void findById(Long id) {
        Find find = new FindBook();
        books = find.find("Id", Long.toString(id));
    }

    public void findByTitle(String title) {
        Find find = new FindBook();
        books = find.find("Title", title);
    }

    public void findByIsbn(String isbn) {
        Find find = new FindBook();
        books = find.find("Isbn", isbn);
    }

    public void findByEdition(String edition) {
        Find find = new FindBook();
        books = find.find("Edition", edition);
    }

    public void findByYear(Integer year) {
        Find find = new FindBook();
        books = find.find("Year", Integer.toString(year));
    }

    public void findAll() {
        Find find = new FindBook();
        books = find.find("All", "");
    }
    
    public List<Publisher> findPublishers() {
        Find find = new FindBook();
        return find.find("Publishers", "");
    }
    
    public List<Author> findAuthors() {
        Find find = new FindBook();
        return find.find("Authors", "");
    }
    
    public List<Subject> findSubjects() {
        Find find = new FindBook();
        return find.find("Subjects", "");
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
    
    public void setState() {
        book.setState();
    }
    
    public void getState() {
        book = (Book) book.getState();
    }

}