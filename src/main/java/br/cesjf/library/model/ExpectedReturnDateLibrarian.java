package br.cesjf.library.model;

import java.util.Calendar;
import java.util.Date;

public class ExpectedReturnDateLibrarian implements IExpectedReturnDate {

    @Override
    public Date calculatesExpectedReturnDate(Copy copy, Date date) {
        
        Calendar c = Calendar.getInstance();
        
        if(date != null){

            c.setTime(date);

            if(copy.getLoanable()){
                c.add(Calendar.DAY_OF_MONTH, 60);
            } else {
                c.add(Calendar.DAY_OF_MONTH, 1);
            }

            if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
                c.add(Calendar.DAY_OF_MONTH, 2);
            } else if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
                c.add(Calendar.DAY_OF_MONTH, 1);
            }
            
        }else {
            
            c.setTime(new Date());
            
        }
        
        return c.getTime();
    }
    
}
