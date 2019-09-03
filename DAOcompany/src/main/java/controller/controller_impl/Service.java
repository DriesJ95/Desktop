package controller.controller_impl;

import model.Company;

import java.sql.SQLException;

public interface Service {

    void create(Company company) throws SQLException;

    Company read(int companyId) throws SQLException;

    void update(Company company) throws SQLException;

    void delete(Company company) throws SQLException;

}

