package br.cesjf.library.model;

import java.util.Date;

public interface IExpectedReturnDate {
    
    Date calculatesExpectedReturnDate(Copy copy, Date reservationDate);
    
}
