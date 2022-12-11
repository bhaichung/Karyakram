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
        String insertQuery= "insert into User(fname,lname,email,phone,password,sq) "+"values('"+fname+"','"+lname+"','"+email+"','"+phone+"','"+pass+"','"+sq+"') ";
        dbConnection = new DbConnection();
        return dbConnection.manipulate(insertQuery);
    }
<<<<<<< HEAD
    public int reset(User user){
        String sq = user.getUser_sq();
        String pass = user.getUser_password();

        String updateQuery = "update User set password='"+pass+"' where sq='"+sq+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }



=======
    public int updatedetails(User user) {
        String fname = user.getUser_fname();
        String lname = user.getUser_lname();
        String email = user.getUser_email();
        String phone = user.getUser_phone();
        String pass = user.getUser_password();
        String sq =user.getUser_sq();

        String insertQuery = "update User set user_fname='" + fname + "',user_lname='" + lname
                + "',user_contact='" + phone + "',user_userName='" + username + "',user_email='"+email+"',user_pass='"+pass+"',user_dob='"+dob+"',gender='"+gender+"' where user_status=1";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }
>>>>>>> 9348298c8f5aa38697e26fe0ff5be95d4cec49c6
}
