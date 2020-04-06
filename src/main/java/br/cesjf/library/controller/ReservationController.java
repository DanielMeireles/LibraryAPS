package br.cesjf.library.controller;

import br.cesjf.library.dao.CopyDAO;
import br.cesjf.library.dao.ReservationDAO;
import br.cesjf.library.model.Copy;
import br.cesjf.library.model.Reservation;
import br.cesjf.library.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ReservationController {

    private Reservation reservation;
    private List<Reservation> reservations;
    private CopyController copyController;
    private UserController userController;

    public ReservationController() {
        this.clear();
        copyController = new CopyController();
        userController = new UserController();
    }
    
    public ReservationController(Reservation reservation) {
        copyController = new CopyController();
        userController = new UserController();
        this.reservation = reservation;
    }

    public void save() {
        ReservationDAO.getInstance().persist(reservation);
    }

    public void delete() {
        ReservationDAO.getInstance().remove(reservation.getId());
    }

    public void findById(Long id) {
        reservations.add(ReservationDAO.getInstance().find(id));
    }

    public void findByReservationDate(Date reservationDate) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("reservationDate", reservationDate));
        reservations = ReservationDAO.getInstance().findByNamedQuery("Reservation.findByReservationDate", parameters);
    }

    public void findByExpectedReturnDate(Date expectedReturnDate) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("expectedReturnDate", expectedReturnDate));
        reservations = ReservationDAO.getInstance().findByNamedQuery("Reservation.findByExpectedReturnDate", parameters);
    }

    public void findByCanceled(Boolean canceled) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("canceled", canceled));
        reservations = ReservationDAO.getInstance().findByNamedQuery("Reservation.findByCanceled", parameters);
    }

    public void findByNoteCancellation(String noteCancellation) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("noteCancellation", noteCancellation));
        reservations = ReservationDAO.getInstance().findByNamedQuery("Reservation.findByNoteCancellation", parameters);
    }

    public void findAll() {
        reservations = ReservationDAO.getInstance().getList();
    }
    
    public List<Copy> findCopies() {
        copyController.findAll();
        return copyController.getCopies();
    } 
    
    public List<Copy> findCopiesAvailables(Date date) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("date", date));
        parameters.add(Arrays.asList("loanId", null));
        parameters.add(Arrays.asList("reservationId", reservation.getId()));
        return CopyDAO.getInstance().findByNamedQuery("Copy.findByAvailableOnDate", parameters);
    }
    
    public List<User> findUsers() {
        userController.findAll();
        return userController.getUsers();
    } 

    public void clear() {
        reservation = Reservation.Builder
                .newInstance()
                .build();
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