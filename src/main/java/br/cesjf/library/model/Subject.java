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
@Table(name = "Subject")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Subject.findAll", query = "SELECT s FROM Subject s")
        , @NamedQuery(name = "Subject.findById", query = "SELECT s FROM Subject s WHERE s.id = :id")
        , @NamedQuery(name = "Subject.findBySubject", query = "SELECT s FROM Subject s WHERE s.subject = :subject")})
public class Subject implements Serializable, Comparable<Subject> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "subject")
    private String subject;
    @ManyToMany(mappedBy="subjectList")
    private List<Book> bookList;
    @ManyToMany(mappedBy="subjectList")
    private List<Magazine> magazineList;

    public Subject() {
    }

    public Subject(Builder builder) {
        this.id = builder.id;
        this.subject = builder.subject;
        this.bookList = builder.bookList;
        this.magazineList = builder.magazineList;
    }

    public static class Builder {

        private Long id;
        private String subject;
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

        public Builder setSubject(String subject) {
            this.subject = subject;
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

        public Subject build() {
            return new Subject(this);
        }

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
        if (!(object instanceof Subject)) {
            return false;
        }
        Subject other = (Subject) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return subject;
    }

    public int compareTo(Subject subject) {
        return this.subject.toLowerCase().compareTo(subject.getSubject().toLowerCase());
    }


}
