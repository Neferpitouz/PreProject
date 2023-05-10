package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl newEx = new UserDaoJDBCImpl();
    public void createUsersTable() {
        newEx.createUsersTable();
    }

    public void dropUsersTable() {
        newEx.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        newEx.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        newEx.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return newEx.getAllUsers();
    }

    public void cleanUsersTable() {
        newEx.cleanUsersTable();
    }
}
