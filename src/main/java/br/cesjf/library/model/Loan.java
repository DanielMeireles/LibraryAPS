package br.cesjf.library.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Loan")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Loan.findAll", query = "SELECT l FROM Loan l")
        , @NamedQuery(name = "Loan.findById", query = "SELECT l FROM Loan l WHERE l.id = :id")
        , @NamedQuery(name = "Loan.findByLoanDate", query = "SELECT l FROM Loan l WHERE l.loanDate = :loanDate")
        , @NamedQuery(name = "Loan.findByExpectedReturnDate", query = "SELECT l FROM Loan l WHERE l.expectedReturnDate = :expectedReturnDate")
        , @NamedQuery(name = "Loan.findByReturnDate", query = "SELECT l FROM Loan l WHERE l.returnDate = :returnDate")})
public class Loan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "loanDate")
    @Temporal(TemporalType.DATE)
    private Date loanDate;
    @Basic(optional = false)
    @Column(name = "expectedReturnDate")
    @Temporal(TemporalType.DATE)
    private Date expectedReturnDate;
    @Column(name = "returnDate")
    @Temporal(TemporalType.DATE)
    private Date returnDate;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idCopy", referencedColumnName = "id")
    private Copy idCopy;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idUser", referencedColumnName = "id")
    private User idUser;
    
    public Loan() {
        
    }

    public Loan(Builder builder) {
        this.id = builder.id;
        this.loanDate = builder.loanDate;
        this.expectedReturnDate = builder.expectedReturnDate;
        this.returnDate = builder.returnDate;
        this.idCopy = builder.idCopy;
        this.idUser = builder.idUser;
        if(builder.idUser != null) {
            this.calculatesExpectedReturnDate();
        }
    }

    public static class Builder {

        private Long id;
        private Date loanDate;
        private Date expectedReturnDate;
        private Date returnDate;
        private Copy idCopy;
        private User idUser;

        public static Builder newInstance() {
            return new Builder();
        }

        private Builder() {

        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setLoanDate(Date loanDate) {
            this.loanDate = loanDate;
            return this;
        }

        public Builder setExpectedReturnDate(Date expectedReturnDate) {
            this.expectedReturnDate = expectedReturnDate;
            return this;
        }

        public Builder setReturnDate(Date returnDate) {
            this.returnDate = returnDate;
            return this;
        }

        public Builder setIdCopy(Copy idCopy) {
            this.idCopy = idCopy;
            return this;
        }

        public Builder setIdUser(User idUser) {
            this.idUser = idUser;
            return this;
        }

        public Loan build() {
            return new Loan(this);
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
        this.calculatesExpectedReturnDate();
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Copy getIdCopy() {
        return idCopy;
    }

    public void setIdCopy(Copy idCopy) {
        this.idCopy = idCopy;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public Date getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(Date expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }
    
    public void calculatesExpectedReturnDate() {
        
        IExpectedReturnDate strategy;
        
        switch(idUser.getType()) {
            case STUDENT:
                strategy = new ExpectedReturnDateStudent();
                break;
            case TEACHER:
                strategy = new ExpectedReturnDateTeacher();
                break;
            case EMPLOYEE:
                strategy = new ExpectedReturnDateEmployee();
                break;
            case LIBRARIAN:
                strategy = new ExpectedReturnDateLibrarian();
                break;
            case ADMINISTRATOR:
                strategy = new ExpectedReturnDateAdministrator();
                break;
            default:
                strategy = new ExpectedReturnDateStudent();
                break;
        }
        
        expectedReturnDate = strategy.calculatesExpectedReturnDate(idCopy, loanDate);
        
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Loan)) {
            return false;
        }
        Loan other = (Loan) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return Long.toString(id);
    }
}
