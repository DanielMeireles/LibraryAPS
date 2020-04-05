package br.cesjf.library.dao;

import br.cesjf.library.model.Reservation;
import java.io.Serializable;

public class ReservationDAO extends GenericDAO<Reservation, Long> implements Serializable {

    public static ReservationDAO subjectDAO;

    private ReservationDAO() {
        super(Reservation.class);
    }

    public static ReservationDAO getInstance() {
        if (subjectDAO == null) {
            subjectDAO = new ReservationDAO();
        }
        return subjectDAO;
    }

}