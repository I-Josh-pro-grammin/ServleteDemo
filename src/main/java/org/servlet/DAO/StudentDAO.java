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
        String sql="insert into students" + "(stud_id, stud_Firstname, stud_Lastname)" + " VALUES(?, ?, ?)";

        try(Connection con =  db.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, s.getStudentId());
            ps.setString(2, s.getStudentFirstname());
            ps.setString(3, s.getStudentLastname());

            int rowsInserted = ps.executeUpdate();
            return rowsInserted > 0;

            }catch(SQLException e) {

            e.printStackTrace();
            return false;
        }
    }
}
