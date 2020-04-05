package br.cesjf.library.controller;

import br.cesjf.library.dao.LoanDAO;
import br.cesjf.library.dao.ReservationDAO;
import br.cesjf.library.model.Reservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ReservationController {

    private Reservation reservation;
    private List<Reservation> reservations;

    public ReservationController() {
        this.clear();
    }

    public void save(Reservation reservation) {
        ReservationDAO.getInstance().persist(reservation);
    }

    public void delete(Reservation reservation) {
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

    public List getReservations() {
        return reservations;
    }

    public void setReservations(List reservations) {
        this.reservations = reservations;
    }

}