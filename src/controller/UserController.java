package controller;

import java.sql.ResultSet;

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
    public int reset(User user){
        String sq = user.getUser_sq();
        String pass = user.getUser_password();

        String updateQuery = "update User set password='"+pass+"' where sq='"+sq+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public ResultSet selectDetails(){
        String query = "select fname,lname,password from User where status='"+"active"+"' ";
        dbConnection = new DbConnection();
        ResultSet rs = dbConnection.retrieve(query);
        return rs;
    }

    public ResultSet loginDetails(User user){
        String email = user.getUser_email();
        String pass = user.getUser_password();
        String query = "select * from User where email='"+email+"' and password='"+pass+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(query);
        return result;
    }

    public int changeStatus(User user){
        String query = "update User set status='"+"inactive"+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;



    }
    public int updateStatus(User user){
        String email = user.getUser_email();
        String query = "update User set status='"+"active"+"' where email='"+email+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;



    }

    
    

    public int updatedetails(User user) {
        String fname = user.getUser_fname();
        String lname = user.getUser_lname();
        String pass = user.getUser_password();
        

        String insertQuery = "update User set fname='" + fname + "',lname='" + lname
                + "',password='"+pass+"' where status='"+"active"+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }
    public int updateFeedback(User user){
        String email = user.getUser_email();
        String feedback = user.getUser_feedback();
        String updateFeedback = "update User set feedback='"+feedback+"'where email='"+email+"'";
        dbConnection =  new DbConnection();
        int result = dbConnection.manipulate(updateFeedback);
        return result;
    }
}
