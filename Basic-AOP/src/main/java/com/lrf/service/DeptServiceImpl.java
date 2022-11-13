package com.lrf.service;

import com.lrf.dao.DeptDAO;

import java.util.Date;

public class DeptServiceImpl implements DeptService{
    //需要DAO组件
    //需要谁把谁声明为成员变量
    private DeptDAO deptDAO;

    public void setDeptDAO(DeptDAO deptDAO) {
        this.deptDAO = deptDAO;
    }

    @Override
    public void save(String name) throws InterruptedException {
        System.out.println("处理save业务逻辑");
        Thread.sleep(1000);
        deptDAO.save(name);
    }

    @Override
    public void update(String name) {
        System.out.println("处理update业务逻辑");
        deptDAO.update(name);
    }

    @Override
    public void delete(Integer id) {
        System.out.println("处理delete业务逻辑");
        deptDAO.delete(id);
    }

    @Override
    public String find(String name) throws InterruptedException {
        System.out.println("处理find业务逻辑");
        Thread.sleep(1000);
        String s = deptDAO.find(name);
        return s;
    }
}
