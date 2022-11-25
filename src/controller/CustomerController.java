package controller;

import database.DbConnection;
import java.sql.ResultSet;
import models.Customer;

public class CustomerController {

  DbConnection dbConnection;

  public int insertDetails(Customer customer) {
    String fname = customer.getCustomer_fname();
    String lname = customer.getCustomer_lname();
    String email = customer.getCustomer_email();
    String phone = customer.getCustomer_phone();
    String pass = customer.getCustomer_password();

    String insertQuery =
      "insert into Customer(fname,lname,email,phone,password) " +
      "values('" +
      fname +
      "','" +
      lname +
      "','" +
      email +
      "','" +
      phone +
      "','" +
      pass +
      "') ";
    dbConnection = new DbConnection();
    return dbConnection.manipulate(insertQuery);
  }

  public Boolean loginUser(String email, String password) {
    String selectQuery = String.format(
      "select * from User where email = '%s' and password = '%s' ",
      email,
      password
    );
      System.err.println(selectQuery);
    dbConnection = new DbConnection();
    ResultSet rs = dbConnection.retrieve(selectQuery);
    try {
      while (rs.next()) {
        String fetchedEmail = rs.getString("email");
        String fetchedPassword = rs.getString("password");
        System.out.println(fetchedEmail + fetchedPassword);
        if (email.equals(fetchedEmail) && password.equals(fetchedPassword)) {
          return true;
        }
      }
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Error");
      return false;
    }
    return false;
  }
}
