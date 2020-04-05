package br.cesjf.library.controller;

import br.cesjf.library.dao.UserDAO;
import br.cesjf.library.model.User;

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

    public List getUsers() {
        return users;
    }

    public void setUsers(List users) {
        this.users = users;
    }

}