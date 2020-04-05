package br.cesjf.library.controller;

import br.cesjf.library.dao.BookDAO;
import br.cesjf.library.model.Book;
import br.cesjf.library.model.BookFactory;

import java.util.List;

public class BookController {

    private Book book;
    private List<Book> books;

    private BookController() {
        this.clear();
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

    public void findAll() {
        books = BookDAO.getInstance().getList();
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

    public List getBooks() {
        return books;
    }

    public void setBooks(List books) {
        this.books = books;
    }

}