package org.servlet.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

  private static final String URL =
          "jdbc:postgresql://localhost:5432/rca";
  private static final String USER = "postgres";
  private static final String PASSWORD = "100aistuff";

  public Connection getConnection() throws SQLException, SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
  }
}
