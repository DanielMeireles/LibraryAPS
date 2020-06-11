package br.cesjf.library.model;

import br.cesjf.library.dao.AuthorDAO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAuthor implements Find {
    
    private List list;

    @Override
    public List find(String by, String parameter) {
        list = new ArrayList<>();
        switch(by) {
            case "Id":
                findById(Long.parseLong(parameter));
                break;
            case "Name":
                findByName(parameter);
                break;
            case "All":
                findAll();
                break;
        }
        return list;
    }
    
    private void findById(Long id) {
        list.add(AuthorDAO.getInstance().find(id));
    }

    private void findByName(String name) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("name", name));
        list = AuthorDAO.getInstance().findByNamedQuery("Author.findByName", parameters);
    }

    private void findAll() {
        list = AuthorDAO.getInstance().getList();
    }
    
}
