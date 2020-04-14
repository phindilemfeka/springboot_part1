package com.springapp;

public interface FakeRepoInterface {
    void insertUser(long Id, String name, String surname);
    User findUserById(long Id);
    void deleteUser(long Id);
}
