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
}
