package org.example.friend.controller;

import org.example.friend.models.User;
import org.example.friend.service.UserManagerImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "login", value = "/logins")
public class LoginServlet extends HttpServlet {

    UserManagerImpl userManager = new UserManagerImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            default:
                showList(req, resp);
        }
    }

    private void showList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("login/login.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "":
                try {
                    CheckLogin(req, resp);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
        }
    }

    private void CheckLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException, SQLException {
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        if (user != null && pass != null) {
            List<User> list = userManager.findAll();
            boolean check = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getUsername().equals(user) && list.get(i).getPassword().equals(pass)) {
                    check = true;
                }
            }
            if (check) {
                resp.sendRedirect("/logins");

            } else {
                resp.sendRedirect("/homes");

            }
        } else {
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            userManager.add(new User(username, password));
            resp.sendRedirect("/logins");
        }
    }
}