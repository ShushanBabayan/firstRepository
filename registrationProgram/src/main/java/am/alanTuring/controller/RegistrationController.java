package am.alanTuring.controller;

import am.alanTuring.dao.RegistrationDao;
import am.alanTuring.model.Registration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/registration")
public class RegistrationController extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        RegistrationDao registrationDao = new RegistrationDao();

        registrationDao.setName(req.getParameter("name"));
        registrationDao.setLastName(req.getParameter("lastName"));
        registrationDao.setEmail(req.getParameter("email"));
        registrationDao.setPassword(req.getParameter("password"));

        Registration registration = new Registration();
        registration.connect(registrationDao);
    }
}
