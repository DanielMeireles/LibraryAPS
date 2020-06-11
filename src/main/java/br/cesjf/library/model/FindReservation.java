package br.cesjf.library.model;

import br.cesjf.library.controller.CopyController;
import br.cesjf.library.controller.UserController;
import br.cesjf.library.dao.ReservationDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FindReservation implements Find {
    
    private List list;
    private CopyController copyController;
    private UserController userController;
    
    public FindReservation() {
        copyController = new CopyController();
        userController = new UserController();
    }

    @Override
    public List find(String by, String parameter) {
        list = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        switch(by) {
            case "Id":
                findById(Long.parseLong(parameter));
                break;
            case "ReservationDate":
                try {
                    Date date = format.parse(parameter);
                    findByReservationDate(date);
                } catch (Exception e) {}
                break;
            case "ExpectedReturnDate":
                try {
                    Date date = format.parse(parameter);
                    findByExpectedReturnDate(date);
                } catch (Exception e) {}
                break;
            case "Canceled":
                findByCanceled(Boolean.parseBoolean(parameter));
                break;
            case "NoteCancellation":
                findByNoteCancellation(parameter);
                break;
            case "All":
                findAll();
                break;
            case "Copies":
                findCopies();
                break;
            case "Users":
                findUsers();
                break;
        }
        return list;
    }
    
    public void findById(Long id) {
        list.add(ReservationDAO.getInstance().find(id));
    }

    public void findByReservationDate(Date reservationDate) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("reservationDate", reservationDate));
        list = ReservationDAO.getInstance().findByNamedQuery("Reservation.findByReservationDate", parameters);
    }

    public void findByExpectedReturnDate(Date expectedReturnDate) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("expectedReturnDate", expectedReturnDate));
        list = ReservationDAO.getInstance().findByNamedQuery("Reservation.findByExpectedReturnDate", parameters);
    }

    public void findByCanceled(Boolean canceled) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("canceled", canceled));
        list = ReservationDAO.getInstance().findByNamedQuery("Reservation.findByCanceled", parameters);
    }

    public void findByNoteCancellation(String noteCancellation) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("noteCancellation", noteCancellation));
        list = ReservationDAO.getInstance().findByNamedQuery("Reservation.findByNoteCancellation", parameters);
    }

    public void findAll() {
        list = ReservationDAO.getInstance().getList();
    }
    
    public List<Copy> findCopies() {
        copyController.findAll();
        return copyController.getCopies();
    }
    
    public List<User> findUsers() {
        userController.findAll();
        return userController.getUsers();
    } 
    
}
