package controller;
import java.sql.ResultSet;
import database.DbConnection;
import models.Bill;

public class BillController {
    DbConnection dbConnection;
    
    public int insertDetails(Bill bill){
        String email = bill.getEmail();
        int total = bill.getTotal();
        int paid = bill.getAdv_payment();
        int remaining = bill.getRemaining_payment();
        String Date = bill.getDate();
        String query = "insert into bill(email,total,adv_payment,remaining_payment,date)"+"values('"+email+"','"+total+"'"+",'"+paid+"'"+",'"+remaining+"'"+",'"+Date+"')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;


    }

    public ResultSet selectDetails(){
        String query = "select sum(bill.adv_payment) from bill join User on bill.email=User.email where User.status='"+ "active" +"' ";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(query);
        return result;
    }
}
