package controller;
import java.sql.ResultSet;
import database.DbConnection;
import models.Bill;

public class BillController {
    DbConnection dbConnection;
    
    public ResultSet display(){
        String query = "select";
        dbConnection = new DbConnection();
        ResultSet rs = dbConnection.retrieve(query);
        return rs;
    }
}
