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
@Table(name = "Magazine")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Magazine.findAll", query = "SELECT m FROM Magazine m")
        , @NamedQuery(name = "Magazine.findById", query = "SELECT m FROM Magazine m WHERE m.id = :id")
        , @NamedQuery(name = "Magazine.findByTitle", query = "SELECT m FROM Magazine m WHERE m.title = :title")
        , @NamedQuery(name = "Magazine.findByEdition", query = "SELECT m FROM Magazine m WHERE m.edition = :edition")
        , @NamedQuery(name = "Magazine.findByYear", query = "SELECT m FROM Magazine m WHERE m.year = :year")})
public class Magazine implements Publication, Serializable, Comparable<Magazine> {

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
    @JoinTable(name = "MagazineSubject",
            joinColumns = @JoinColumn(name = "idMagazine"),
            inverseJoinColumns = @JoinColumn(name = "idSubject")
    )
    private List<Subject> subjectList;
    @ManyToMany
    @JoinTable(name = "AuthorMagazine",
            joinColumns = @JoinColumn(name = "idMagazine"),
            inverseJoinColumns = @JoinColumn(name = "idAuthor")
    )
    private List<Author> authorList;
    @OneToMany(mappedBy = "idMagazine")
    private List<Copy> copyList;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idPublisher", referencedColumnName = "id")
    private Publisher idPublisher;

    public Magazine() {
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

    public String getSubjects() {
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
        if (!(object instanceof Magazine)) {
            return false;
        }
        Magazine other = (Magazine) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return title;
    }

    public int compareTo(Magazine book) {
        return this.title.toLowerCase().compareTo(book.getTitle().toLowerCase());
    }

}