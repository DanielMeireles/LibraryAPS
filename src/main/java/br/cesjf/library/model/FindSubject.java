package br.cesjf.library.model;

import br.cesjf.library.dao.SubjectDAO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSubject implements Find {
    
    private List list;

    @Override
    public List find(String by, String parameter) {
        list = new ArrayList<>();
        switch(by) {
            case "Id":
                findById(Long.parseLong(parameter));
                break;
            case "Subject":
                findBySubject(parameter);
                break;
            case "All":
                findAll();
                break;
        }
        return list;
    }
    
    private void findById(Long id) {
        list.add(SubjectDAO.getInstance().find(id));
    }

    private void findBySubject(String subject) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("subject", subject));
        list = SubjectDAO.getInstance().findByNamedQuery("Subject.findBySubject", parameters);
    }

    private void findAll() {
        list = SubjectDAO.getInstance().getList();
    }
    
}
