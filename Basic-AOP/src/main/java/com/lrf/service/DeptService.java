package com.lrf.service;

public interface DeptService {
    void save(String name) throws InterruptedException;

    void update(String name);

    void delete(Integer id);

    String find(String name) throws InterruptedException;
}
