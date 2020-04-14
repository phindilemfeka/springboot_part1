package com.springapp;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    public FakeRepoInterface fr;
    @Override
    public String addUser(long Id, String name, String surname) {
        fr.insertUser(1, "shirley", "ndou");
        fr.insertUser(2, "shaz", "koko");
        fr.insertUser(3, "tshidiso", "khoza");
        fr.insertUser(4, "karabo", "hso");
        return name;
    }

    @Override
    public void removeUser(long Id) {
        fr.deleteUser(1);
    }

    @Override
    public long getUser(long Id) {
      fr.findUserById(1);
        return Id;
    }
}
