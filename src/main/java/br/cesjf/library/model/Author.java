package br.cesjf.library.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Author")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Author.findAll", query = "SELECT a FROM Author a")
        , @NamedQuery(name = "Author.findById", query = "SELECT a FROM Author a WHERE a.id = :id")
        , @NamedQuery(name = "Author.findByName", query = "SELECT a FROM Author a WHERE a.name = :name")})
public class Author implements Serializable, Comparable<Author> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @ManyToMany(mappedBy="authorList")
    private List<Book> bookList;
    @ManyToMany(mappedBy="authorList")
    private List<Magazine> magazineList;

    public Author() {
    }

    public Author(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.bookList = builder.bookList;
        this.magazineList = builder.magazineList;
    }

    public static class Builder {

        private Long id;
        private String name;
        private List<Book> bookList;
        private List<Magazine> magazineList;

        public static Builder newInstance() {
            return new Builder();
        }

        private Builder() {

        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBookList(List<Book> bookList) {
            this.bookList = bookList;
            return this;
        }
        
        public Builder setMagazineList(List<Magazine> magazineList) {
            this.magazineList = magazineList;
            return this;
        }

        public Author build() {
            return new Author(this);
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Magazine> getMagazineList() {
        return magazineList;
    }

    public void setMagazineList(List<Magazine> magazineList) {
        this.magazineList = magazineList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Author)) {
            return false;
        }
        Author other = (Author) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return name;
    }

    public int compareTo(Author author) {
        return this.name.toLowerCase().compareTo(author.getName().toLowerCase());
    }

}
