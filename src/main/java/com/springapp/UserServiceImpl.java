package com.springapp;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    FakeRepoInterface fakeRepo;
    @Autowired
    public UserServiceImpl(FakeRepoInterface fakeRepo){
        this.fakeRepo = fakeRepo;
    }
    @Override
    public String addUser(long Id, String name, String surname) {
        fakeRepo.insertUser(1, "shirley", "ndou");
        System.out.println(name + "entered");
        return name;
    }

    @Override
    public void removeUser(long Id) {
        fakeRepo.deleteUser(1);
        System.out.println(getUser(Id) + " removed");
    }

    @Override
    public long getUser(long Id) {
        System.out.println("hello " + fakeRepo.findUserById(1).getName());
        return Id;
    }
}
