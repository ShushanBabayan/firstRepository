package am.alanTuring.model;


import am.alanTuring.dao.RegistrationDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Registration {
    final String name = "shushan";
    final String password = "123456";
    final String url = "jdbc:sqlserver://localhost:1433;database=LOGIN_REGISTOR";

    public void connect(RegistrationDao registrationDao) {
        //insert into LOGIN_REGISTOR values("name", "lastname", 'email', 'password')
        String sql = "insert into Login_Registor values('" + registrationDao.getName() + "','" + registrationDao.getLastName()
                + "','" + registrationDao.getEmail() + "','" + registrationDao.getPassword() + "')";
        Connection connection = null;
        try{
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            connection = DriverManager.getConnection(url, name, password);
            Statement st = connection.createStatement();
            if(st.executeUpdate(sql) == 1) {
                System.out.println("Successful" + sql);
            } else {
                System.out.println("insertion failed");
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
