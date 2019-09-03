package dao.dao_interface;

import model.Company;

import java.sql.SQLException;

public interface CompanyDao {

    //CRUD : CREATE READ UPDATE DELETE
    void create(Company company) throws SQLException;

    Company read(int companyId) throws SQLException;

    void update(Company company) throws SQLException;

    void delete(Company company) throws SQLException;
}
