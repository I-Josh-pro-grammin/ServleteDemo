package org.servlet.Services;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.servlet.DAO.StudentDAO;
import org.servlet.Models.Student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

//@WebServlet("register")
public class StudentService extends HttpServlet {
    private StudentDAO stdDao;

    @Override
    public void init() {
        try {
            stdDao = new StudentDAO();
        } catch (SQLException e) {
            throw new RuntimeException("DB init failed", e);
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        int stdId = Integer.parseInt(req.getParameter("studentId"));
        String fName = req.getParameter("studentFirtname");
        String lName = req.getParameter("studentLastname");

        try {
            createStudent(stdId, fName, lName);
            out.println("User created successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void createStudent(int studentId, String studentFirstname, String studentLastname) throws SQLException {
        Student student = new Student(studentId, studentFirstname, studentLastname);
        try{
            stdDao.save(student);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
