package br.cesjf.library.controller;

import br.cesjf.library.dao.CopyDAO;
import br.cesjf.library.dao.ReservationDAO;
import br.cesjf.library.model.Copy;
import br.cesjf.library.model.Find;
import br.cesjf.library.model.FindReservation;
import br.cesjf.library.model.Loan;
import br.cesjf.library.model.Reservation;
import br.cesjf.library.model.User;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ReservationController {

    private Reservation reservation;
    private List<Reservation> reservations;
    private CopyController copyController;
    private UserController userController;
    private LoanController loanController;

    public ReservationController() {
        this.clear();
        copyController = new CopyController();
        userController = new UserController();
        loanController = new LoanController();
    }
    
    public ReservationController(Reservation reservation) {
        copyController = new CopyController();
        userController = new UserController();
        loanController = new LoanController();
        this.reservation = reservation;
    }

    public void save() {
        ReservationDAO.getInstance().persist(reservation);
    }

    public void delete() {
        ReservationDAO.getInstance().remove(reservation.getId());
    }

    public void findById(Long id) {
        Find find = new FindReservation();
        reservations = find.find("Id", Long.toString(id));
    }

    public void findByReservationDate(Date reservationDate) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Find find = new FindReservation();
        reservations = find.find("ReservationDate", format.format(reservationDate));
    }

    public void findByExpectedReturnDate(Date expectedReturnDate) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Find find = new FindReservation();
        reservations = find.find("ExpectedReturnDate", format.format(expectedReturnDate));
    }

    public void findByCanceled(Boolean canceled) {
        Find find = new FindReservation();
        reservations = find.find("Canceled", Boolean.toString(canceled));
    }

    public void findByNoteCancellation(String noteCancellation) {
        Find find = new FindReservation();
        reservations = find.find("NoteCancellation", noteCancellation);
    }

    public void findAll() {
        Find find = new FindReservation();
        reservations = find.find("All", "");
    }
    
    public List<Copy> findCopies() {
        Find find = new FindReservation();
        return find.find("Copies", "");
    } 
    
    public List<Copy> findCopiesAvailables(Date date) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("date", date));
        parameters.add(Arrays.asList("loanId", null));
        parameters.add(Arrays.asList("reservationId", reservation.getId()));
        return CopyDAO.getInstance().findByNamedQuery("Copy.findByAvailableOnDate", parameters);
    }
    
    public List<User> findUsers() {
        Find find = new FindReservation();
        return find.find("Users", "");
    } 

    public void clear() {
        reservation = Reservation.Builder
                .newInstance()
                .build();
    }
    
    public void generateLoan (){
        if(!reservation.getId().equals(null)) {
            Loan loan = Loan.Builder
                            .newInstance()
                            .setLoanDate(reservation.getReservationDate())
                            .setIdCopy(reservation.getIdCopy())
                            .setIdUser(reservation.getIdUser())
                            .build();
            loanController.setLoan(loan);
            loanController.save();
            reservation.setIdLoan(loan);
            this.save();
        }
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List reservations) {
        this.reservations = reservations;
    }

}