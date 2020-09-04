package am.alanThuring.model;

import am.alanThuring.controller.RegistrationController;
import am.alanThuring.dao.RegistrationDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Registration {
    final String name = "shushan";
    final String password = "123456";
    final String url = "jdbc:sqlserver://localhost:1433;database=LOGIN_REGISTOR";

    public void Connect(RegistrationDao registrationDao) {        
        String sql = "insert into Login_Registor values('" + registrationDao.getName() + "','" + registrationDao.getLastName()
                + "','" + registrationDao.getEmail() + "','" + registrationDao.getPassword() + "')";
        Connection connection = null;
        try{
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            connection = DriverManager.getConnection(url, name, password);
            Statement st = connection.createStatement();
            if(st.executeUpdate(sql) == 1) {
                System.out.println("Successfull" + sql);
            } else {
                System.out.println("insertion failed");
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
