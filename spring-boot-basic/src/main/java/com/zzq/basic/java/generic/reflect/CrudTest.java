package com.zzq.basic.java.generic.reflect;

public class CrudTest {

    public static void show() {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.show();
    }

    public static void crud() {
        UserDaoImpl userDao = new UserDaoImpl();
        User user1 = new User();
        userDao.save(user1);
        userDao.delete(1);
        userDao.update(user1);
        try {
            User user2 = userDao.get();
            System.out.println(user2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        show();
//        crud();
    }

}
