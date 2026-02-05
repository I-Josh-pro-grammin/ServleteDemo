package org.servlet.DAO;

import org.servlet.DB.DbUtil;
import org.servlet.Models.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
    DbUtil db = new DbUtil();

    public StudentDAO() throws SQLException {
    }

    public boolean save(Student s) {

        try(Connection con =  db.getConnection()) {

            PreparedStatement ps =
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
            String st="insert into students(stud_id, stud_Firstname, stud_Lastname) VALUES(?, ?, ?)";


        return true;
    }
}
