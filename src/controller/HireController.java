package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.hire;

public class HireController {
    DbConnection dbConnection;

    public ResultSet  selectHire(){
        String query = "select * from hire";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(query);
        return result;
    }
    public ResultSet  selectHireName(hire hire){
        String query = "select * from hire where name='"+hire.gethire_name()+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(query);
        return result;
    }

    public ResultSet selectHiredetails(hire hire){
        String query = "select phone,price from hire where name='"+hire.gethire_name()+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(query);
        return result;
    }

    public int setStatus(hire hire){
        String query = "update hire set status='"+"active"+"' where name='"+hire.gethire_name()+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }

    public int resetStatus(){
        String query = "update hire set status='"+"inactive"+"' where status='"+"active"+"' ";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }

    public ResultSet selectHireStatus(){
        String query = "select name from hire where status='"+"active"+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(query);
        return result;
    }
}
