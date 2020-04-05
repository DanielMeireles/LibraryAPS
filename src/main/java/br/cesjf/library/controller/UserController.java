package br.cesjf.library.controller;

import br.cesjf.library.dao.UserDAO;
import br.cesjf.library.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserController {

    private User user;
    private List<User> users;

    public UserController() {
        this.clear();
    }

    public void save(User user) {
        UserDAO.getInstance().persist(user);
    }

    public void delete(User user) {
        UserDAO.getInstance().remove(user.getId());
    }

    public void findById(Long id) {
        users.add(UserDAO.getInstance().find(id));
    }

    public void findByName(String name) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("name", name));
        users = UserDAO.getInstance().findByNamedQuery("User.findByName", parameters);
    }

    public void findByType(String type) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("type", type));
        users = UserDAO.getInstance().findByNamedQuery("User.findByType", parameters);
    }

    public void findByEmail(String email) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("email", email));
        users = UserDAO.getInstance().findByNamedQuery("User.findByEmail", parameters);
    }

    public void findByUser(String user) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("user", user));
        users = UserDAO.getInstance().findByNamedQuery("User.findByUser", parameters);
    }

    public void findAll() {
        users = UserDAO.getInstance().getList();
    }

    public void clear() {
        user = User.Builder
                .newInstance()
                .build();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List users) {
        this.users = users;
    }

}