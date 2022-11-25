package models;

public class Customer {

  private String customer_fname;
  private String customer_lname;
  private String customer_email;
  private String customer_password;
  private String customer_phone;

  public String getCustomer_fname() {
    return this.customer_fname;
  }

  public void setCustomer_fname(String customer_fname) {
    this.customer_fname = customer_fname;
  }

  public String getCustomer_lname() {
    return this.customer_lname;
  }

  public void setCustomer_lname(String customer_lname) {
    this.customer_lname = customer_lname;
  }

  public String getCustomer_email() {
    return this.customer_email;
  }

  public void setCustomer_email(String customer_email) {
    this.customer_email = customer_email;
  }

  public String getCustomer_password() {
    return this.customer_password;
  }

  public void setCustomer_password(String customer_password) {
    this.customer_password = customer_password;
  }

  public String getCustomer_phone() {
    return this.customer_phone;
  }

  public void setCustomer_phone(String customer_phone) {
    this.customer_phone = customer_phone;
  }

  public Customer(
    String customer_fname,
    String customer_lname,
    String customer_email,
    String customer_password,
    String customer_phone
  ) {
    this.customer_fname = customer_fname;
    this.customer_lname = customer_lname;
    this.customer_email = customer_email;
    this.customer_password = customer_password;
    this.customer_phone = customer_phone;
  }
}
}
