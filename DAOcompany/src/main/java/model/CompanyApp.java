package model;

import controller.controller_impl.ServiceImpl;
import dao.dao_implementation.CompanyDaoImpl;
import dao.dao_interface.CompanyDao;

import java.sql.SQLException;

public class CompanyApp {
    public static void main(String[] args) {

        ServiceImpl service = new ServiceImpl();
        Company company = new Company("*","BE987654321","straat","Antwerpen");

        try{
            service.create(company);
            service.create(new Company("Intec", "BE123456789", "Rouppeplein 16", "Brussel"));
            System.out.println(service.read(17));
            service.update(company.setId(18));
            System.out.println(service.read(18));
            service.delete(company);
            System.out.println(service.read(17));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
