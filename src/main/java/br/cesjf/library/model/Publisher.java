package br.cesjf.library.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Publisher")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Publisher.findAll", query = "SELECT p FROM Publisher p")
        , @NamedQuery(name = "Publisher.findById", query = "SELECT p FROM Publisher p WHERE p.id = :id")
        , @NamedQuery(name = "Publisher.findByName", query = "SELECT p FROM Publisher p WHERE p.name = :name")})
public class Publisher implements Serializable, Comparable<Publisher> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "idPublisher")
    private List<Book> bookList;

    public Publisher() {
    }

    public Publisher(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.bookList = builder.bookList;
    }

    public static class Builder {

        private Long id;
        private String name;
        private List<Book> bookList;

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

        public Publisher build() {
            return new Publisher(this);
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

    public void setLivroList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Publisher)) {
            return false;
        }
        Publisher other = (Publisher) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return name;
    }

    public int compareTo(Publisher publisher) {
        return this.name.toLowerCase().compareTo(publisher.getName().toLowerCase());
    }

}
