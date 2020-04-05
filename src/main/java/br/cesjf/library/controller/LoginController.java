package br.cesjf.library.controller;

import br.cesjf.library.dao.UserDAO;
import br.cesjf.library.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginController {

    private List<User> users;

    public LoginController() {}

    public boolean login(String user, String password) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("user", user));
        parameters.add(Arrays.asList("password", password));
        List<User> users;
        users = UserDAO.getInstance().findByNamedQuery("User.login", parameters);
        if(users.isEmpty()) {
            return false;
        }else{
            return true;
        }
    }

}
