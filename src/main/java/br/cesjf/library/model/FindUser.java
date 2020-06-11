package br.cesjf.library.model;

import br.cesjf.library.dao.UserDAO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindUser implements Find {
    
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
            case "Type":
                findByType(parameter);
                break;
            case "Email":
                findByEmail(parameter);
                break;
            case "User":
                findByUser(parameter);
                break;
            case "All":
                findAll();
                break;
        }
        return list;
    }
    
    public void findById(Long id) {
        list.add(UserDAO.getInstance().find(id));
    }

    public void findByName(String name) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("name", name));
        list = UserDAO.getInstance().findByNamedQuery("User.findByName", parameters);
    }

    public void findByType(String type) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("type", type));
        list = UserDAO.getInstance().findByNamedQuery("User.findByType", parameters);
    }

    public void findByEmail(String email) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("email", email));
        list = UserDAO.getInstance().findByNamedQuery("User.findByEmail", parameters);
    }

    public void findByUser(String user) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("user", user));
        list = UserDAO.getInstance().findByNamedQuery("User.findByUser", parameters);
    }
    
    public void findAll() {
        list = UserDAO.getInstance().getList();
    }
    
}
