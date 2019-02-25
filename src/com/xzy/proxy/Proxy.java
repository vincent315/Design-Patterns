package com.xzy.proxy;

public class Proxy implements UserDao{
    private UserDao userDao;
    public Proxy(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void add() {
        userDao.add();
    }
}
