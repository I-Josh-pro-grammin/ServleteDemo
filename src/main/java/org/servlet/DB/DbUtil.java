package org.servlet.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

  private static final String URL =
          "jdbc:postgresql://localhost:5432/rca";
  private static final String USER = "postgres";
  private static final String PASSWORD = "100aistuff";

  public DbUtil() throws SQLException {
    try {
      Class.forName("org.postgresql.Driver");
    } catch (ClassNotFoundException e) {
      throw new SQLException("PostgreSQL JDBC Driver not found");
    }
  }

  public Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
  }
}
