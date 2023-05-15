package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {
        UserServiceImpl test = new UserServiceImpl();
        test.createUsersTable();
        test.saveUser("Alex", "Murphy", (byte) 34);
        test.saveUser("Pyotr", "Quill", (byte) 50);
        test.saveUser("Drax", "Destroyer", (byte) 9);
        test.saveUser("Bill", "Gates", (byte) 55);
        test.getAllUsers().forEach(System.out::println);
        test.cleanUsersTable();
        Util.sessionClose();


    }
}
