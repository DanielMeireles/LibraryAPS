package br.cesjf.library.controller;

import br.cesjf.library.dao.UserDAO;
import br.cesjf.library.model.Find;
import br.cesjf.library.model.FindUser;
import br.cesjf.library.model.User;

import java.util.List;

public class UserController {

    private User user;
    private List<User> users;

    public UserController() {
        this.clear();
    }
    
    public UserController(User user) {
        this.user = user;
    }

    public void save() {
        UserDAO.getInstance().persist(user);
    }

    public void delete() {
        UserDAO.getInstance().remove(user.getId());
    }

    public void findById(Long id) {
        Find find = new FindUser();
        users = find.find("Id", Long.toString(id));
    }

    public void findByName(String name) {
        Find find = new FindUser();
        users = find.find("Name", name);
    }

    public void findByType(String type) {
        Find find = new FindUser();
        users = find.find("Type", type);
    }

    public void findByEmail(String email) {
        Find find = new FindUser();
        users = find.find("Email", email);
    }

    public void findByUser(String user) {
        Find find = new FindUser();
        users = find.find("User", user);
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