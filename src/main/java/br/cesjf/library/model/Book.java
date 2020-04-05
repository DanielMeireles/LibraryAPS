package br.cesjf.library.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Book")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b")
        , @NamedQuery(name = "Book.findById", query = "SELECT b FROM Book b WHERE b.id = :id")
        , @NamedQuery(name = "Book.findByTitle", query = "SELECT b FROM Book b WHERE b.title = :title")
        , @NamedQuery(name = "Book.findByIsbn", query = "SELECT b FROM Book b WHERE b.isbn = :isbn")
        , @NamedQuery(name = "Book.findByEdition", query = "SELECT b FROM Book b WHERE b.edition = :edition")
        , @NamedQuery(name = "Book.findByYear", query = "SELECT b FROM Book b WHERE b.year = :year")})
public class Book implements Publication, Serializable, Comparable<Book> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @Column(name = "isbn")
    private String isbn;
    @Basic(optional = false)
    @Column(name = "edition")
    private Integer edition;
    @Basic(optional = false)
    @Column(name = "year")
    private Integer year;
    @Column(name = "cover")
    private String cover;
    @Column(name = "file")
    private String file;
    @ManyToMany
    @JoinTable(name = "BookSubject",
            joinColumns = @JoinColumn(name = "idBook"),
            inverseJoinColumns = @JoinColumn(name = "idSubject")
    )
    private List<Subject> subjectList;
    @ManyToMany
    @JoinTable(name = "AuthorBook",
            joinColumns = @JoinColumn(name = "idBook"),
            inverseJoinColumns = @JoinColumn(name = "idBook")
    )
    private List<Author> authorList;
    @OneToMany(mappedBy = "idBook")
    private List<Copy> copyList;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idPublisher", referencedColumnName = "id")
    private Publisher idPublisher;

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getSubject() {
        String text = "";
        for(Subject s: subjectList){
            text = text + s.getSubject() + "; ";
        }
        return text;
    }

    public String getAuthors() {
        String text = "";
        for(Author a: authorList){
            text = text + a.getName() + "; ";
        }
        return text;
    }

    @XmlTransient
    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @XmlTransient
    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    @XmlTransient
    public List<Copy> getCopyList() {
        return copyList;
    }

    public void setCopyList(List<Copy> copyList) {
        this.copyList = copyList;
    }

    public Publisher getIdPublisher() {
        return idPublisher;
    }

    public void setIdPublisher(Publisher idPublisher) {
        this.idPublisher = idPublisher;
    }

    public int getAmountCopyLoanable() {
        int i = 0;
        for(Copy c: copyList) {
            if(c.getLoanable()) {
                i++;
            }
        }
        return i;
    }

    public int getAmountCopyNotLoanable() {
        int i = 0;
        for(Copy c: copyList) {
            if(!c.getLoanable()) {
                i++;
            }
        }
        return i;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return title;
    }

    public int compareTo(Book book) {
        return this.title.toLowerCase().compareTo(book.getTitle().toLowerCase());
    }

}