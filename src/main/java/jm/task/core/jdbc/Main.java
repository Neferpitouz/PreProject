package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl test = new UserDaoJDBCImpl();
        try {
            test.createUsersTable();
//            test.saveUser("Alex", "Murphy", (byte) 34);
//            test.removeUserById(3);
//            test.getAllUsers().forEach(System.out::println);
            //test.dropUsersTable();
//            test.cleanUsersTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
