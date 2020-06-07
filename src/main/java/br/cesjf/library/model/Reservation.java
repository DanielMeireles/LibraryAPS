package br.cesjf.library.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Reservation")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Reservation.findAll", query = "SELECT r FROM Reservation r")
        , @NamedQuery(name = "Reservation.findById", query = "SELECT r FROM Reservation r WHERE r.id = :id")
        , @NamedQuery(name = "Reservation.findByReservationDate", query = "SELECT r FROM Reservation r WHERE r.reservationDate = :reservationDate")
        , @NamedQuery(name = "Reservation.findByExpectedReturnDate", query = "SELECT r FROM Reservation r WHERE r.expectedReturnDate = :expectedReturnDate")
        , @NamedQuery(name = "Reservation.findByCanceled", query = "SELECT r FROM Reservation r WHERE r.canceled = :canceled")
        , @NamedQuery(name = "Reservation.findByNoteCancellation", query = "SELECT r FROM Reservation r WHERE r.noteCancellation = :noteCancellation")})
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "reservationDate")
    @Temporal(TemporalType.DATE)
    private Date reservationDate;
    @Basic(optional = false)
    @Column(name = "expectedReturnDate")
    @Temporal(TemporalType.DATE)
    private Date expectedReturnDate;
    @Column(name = "canceled")
    private Boolean canceled;
    @Basic(optional = true)
    @Column(name = "noteCancellation")
    private String noteCancellation;
    @OneToOne(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinColumn(name = "idLoan", referencedColumnName = "id")
    private Loan idLoan;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idCopy", referencedColumnName = "id")
    private Copy idCopy;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idUser", referencedColumnName = "id")
    private User idUser;

    public Reservation() {
    }

    public Reservation(Builder builder) {
        this.id = builder.id;
        this.reservationDate = builder.reservationDate;
        this.canceled = builder.canceled;
        this.noteCancellation = builder.noteCancellation;
        this.idLoan = builder.idLoan;
        this.idCopy = builder.idCopy;
        this.idUser = builder.idUser;
        if(builder.idUser != null) {
            this.calculatesExpectedReturnDate();
        }
    }

    public static class Builder {

        private Long id;
        private Date reservationDate;
        private Boolean canceled;
        private String noteCancellation;
        private Loan idLoan;
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

        public Builder setReservationDate(Date reservationDate) {
            this.reservationDate = reservationDate;
            return this;
        }

        public Builder setCanceled(Boolean canceled) {
            this.canceled = canceled;
            return this;
        }

        public Builder setNoteCancellation(String noteCancellation) {
            this.noteCancellation = noteCancellation;
            return this;
        }

        public Builder setIdLoan(Loan idLoan) {
            this.idLoan = idLoan;
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

        public Reservation build() {
            return new Reservation(this);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
        this.calculatesExpectedReturnDate();
    }

    public Loan getIdLoan() {
        return idLoan;
    }

    public void setIdLoan(Loan idLoan) {
        this.idLoan = idLoan;
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

    public Boolean getCanceled() {
        return canceled;
    }

    public void setCanceled(Boolean canceled) {
        this.canceled = canceled;
    }

    public String getNoteCancellation() {
        return noteCancellation;
    }

    public void setNoteCancellation(String noteCancellation) {
        this.noteCancellation = noteCancellation;
    }

    public Date getExpectedReturnDate() {
        return expectedReturnDate;
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
        
        expectedReturnDate = strategy.calculatesExpectedReturnDate(idCopy, reservationDate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return Long.toString(id);
    }

}
