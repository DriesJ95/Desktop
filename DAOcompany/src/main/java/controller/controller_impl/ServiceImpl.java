package controller.controller_impl;


import dao.dao_implementation.CompanyDaoImpl;
import model.Company;

import java.sql.SQLException;

public class ServiceImpl implements Service {

    private CompanyDaoImpl companyDao = new CompanyDaoImpl();

    @Override
    public void create(Company company) throws SQLException {
        companyDao.create(company);
    }

    @Override
    public Company read(int companyId) throws SQLException {
        return companyDao.read(companyId);
    }

    @Override
    public void update(Company company) throws SQLException {
        companyDao.update(company);

    }

    @Override
    public void delete(Company company) throws SQLException {
        companyDao.delete(company);

    }
}
