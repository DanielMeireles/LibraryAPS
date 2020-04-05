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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Copy")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Copy.findAll", query = "SELECT c FROM Copy c")
        , @NamedQuery(name = "Copy.findById", query = "SELECT c FROM Copy c WHERE c.id = :id")
        , @NamedQuery(name = "Copy.findByLoanable", query = "SELECT c FROM Copy c WHERE c.loanable = :loanable")})
public class Copy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "loanable")
    private Boolean loanable;
    @OneToMany(mappedBy = "idCopy")
    private List<Loan> loanList;
    @ManyToOne(optional = true)
    @JoinColumn(name = "idBook", referencedColumnName = "id")
    private Book idBook;
    @ManyToOne(optional = true)
    @JoinColumn(name = "idMagazine", referencedColumnName = "id")
    private Magazine idMagazine;
    @OneToMany(mappedBy = "idCopy")
    private List<Reservation> reservationList;

    public Copy() {
    }

    public Copy(Builder builder) {
        this.id = builder.id;
        this.loanable = builder.loanable;
        this.loanList = builder.loanList;
        this.idBook = builder.idBook;
        this.reservationList = builder.reservationList;
    }

    public static class Builder {

        private Long id;
        private Boolean loanable;
        private List<Loan> loanList;
        private Book idBook;
        private List<Reservation> reservationList;

        public static Builder newInstance() {
            return new Builder();
        }

        private Builder() {

        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setLoanable(Boolean loanable) {
            this.loanable = loanable;
            return this;
        }

        public Builder setLoanList(List<Loan> loanList) {
            this.loanList = loanList;
            return this;
        }

        public Builder setIdBook(Book idBook) {
            this.idBook = idBook;
            return this;
        }

        public Builder setReservationList(List<Reservation> reservationList) {
            this.reservationList = reservationList;
            return this;
        }

        public Copy build() {
            return new Copy(this);
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getLoanable() {
        return loanable;
    }

    public void setLoanable(Boolean loanable) {
        this.loanable = loanable;
    }

    public String getLoanableText() {
        if(loanable) {
            return "Yes";
        } else {
            return "No";
        }
    }

    @XmlTransient
    public List<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
        this.loanList = loanList;
    }

    public Book getIdBook() {
        return idBook;
    }

    public void setIdBook(Book idBook) {
        this.idBook = idBook;
    }

    public Magazine getIdMagazine() {
        return idMagazine;
    }

    public void setIdMagazine(Magazine idMagazine) {
        this.idMagazine = idMagazine;
    }

    @XmlTransient
    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Copy)) {
            return false;
        }
        Copy other = (Copy) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "Exemplar: " + id + " - Emprestável: " + getLoanableText();
    }
}
