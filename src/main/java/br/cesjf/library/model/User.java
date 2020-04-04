package br.cesjf.library.model;

import br.cesjf.library.enums.UserType;
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
@Table(name = "User")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
        , @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id")
        , @NamedQuery(name = "User.findByName", query = "SELECT u FROM User u WHERE u.name = :name")
        , @NamedQuery(name = "User.findByType", query = "SELECT u FROM User u WHERE u.type = :type")
        , @NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email")
        , @NamedQuery(name = "User.findByUser", query = "SELECT u FROM User u WHERE u.user = :user")
        , @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password")
        , @NamedQuery(name = "User.login", query = "SELECT u FROM User u WHERE u.user = :user AND u.password = :password")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "user")
    private String user;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "idUser")
    private List<Loan> loanList;
    @OneToMany(mappedBy = "idUser")
    private List<Reservation> reservationList;

    public User() {
    }

    public User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.type = builder.type;
        this.email = builder.email;
        this.user = builder.user;
        this.password = builder.password;
        this.loanList = builder.loanList;
        this.reservationList = builder.reservationList;
    }

    public static class Builder {

        private Long id;
        private String name;
        private String type;
        private String email;
        private String user;
        private String password;
        private List<Loan> loanList;
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

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setUser(String user) {
            this.user = user;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setLoanList(List<Loan> loanList) {
            this.loanList = loanList;
            return this;
        }

        public Builder setReservationList(List<Reservation> reservationList) {
            this.reservationList = reservationList;
            return this;
        }

        public User build() {
            return new User(this);
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

    public void setType(UserType type) {
        this.type = type.name();
    }

    public UserType getType() {
        if(type == null) {
            return null;
        } else {
            return UserType.valueOf(type);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlTransient
    public List<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
        this.loanList = loanList;
    }

    @XmlTransient
    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservaList(List<Reservation> reservationList) {
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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return name;
    }

}
