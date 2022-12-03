package database;

import java.sql.*;
import javax.swing.*;

public class DbConnection {

  public Connection connection;

  Statement statement;

  ResultSet resultSet;

  int value;

  public DbConnection() {
    try {
      String username = "sql6581197";

      String password = "qcxpHQp52A";

      Class.forName("com.mysql.cj.jdbc.Driver");

      connection =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/sql6581197",
          username,
          password
        );

<<<<<<< HEAD
            String username = "karyakram";

            String password = "karyakram";
=======
      if (connection != null) {
        System.out.println("Connected to database");
      } else {
        System.out.println("Error connecting to database");
      }

      statement = connection.createStatement();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
>>>>>>> 9dcacdbc44e895ac78d37929ee38eadf3998f507

  // Via the use of sql query

  // insert, update and delete

<<<<<<< HEAD
                    "jdbc:mysql://db4free.net:3306/karyakram",username,password);



                    if(connection!=null){

                        System.out.println("Connected to database");

                    }else{

                        System.out.println("Error connecting to database");

                    }

            statement = connection.createStatement();

        }catch (Exception e){

            e.printStackTrace();

        }
=======
  public int manipulate(String query) {
    try {
      Statement statement = connection.createStatement();
      value = statement.executeUpdate(query);
>>>>>>> 9dcacdbc44e895ac78d37929ee38eadf3998f507

      connection.close();
    } catch (SQLIntegrityConstraintViolationException ex) {
      JOptionPane.showMessageDialog(null, "These details already exist!");
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return value;
  }

  public ResultSet retrieve(String query) {
    try {
      resultSet = statement.executeQuery(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return resultSet;
  }

  public static void main(String[] args) {
    new DbConnection();
  }
}
