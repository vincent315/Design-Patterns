package com.xzy.proxy;

public class Test {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        Proxy proxy = new Proxy(userDao);
        proxy.add();
    }
}
