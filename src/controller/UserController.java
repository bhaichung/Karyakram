package controller;

import database.DbConnection;
import models.User;

public class UserController {
    DbConnection dbConnection;

    public int insertDetails(User user){
        String fname = user.getUser_fname();
        String lname = user.getUser_lname();
        String email = user.getUser_email();
        String phone = user.getUser_phone();
        String pass = user.getUser_password();
        String sq =user.getUser_sq();
        String insertQuery= "insert into User(fname,lname,email,phone,password,sq) "+"values('"+fname+"','"+lname+"','"+email+"','"+phone+"','"+pass+""+sq+"') ";
        dbConnection = new DbConnection();
        return dbConnection.manipulate(insertQuery);
    }


}
