package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.Booking;

public class bookingController {
    DbConnection dbConnection;

    public int insertDetails(Booking booking) {
        int v_id = booking.getV_id();
        int noOfCustomers = booking.getNoOfCustomers();
        String email = booking.getEmail();
        String phone = booking.getPhone();
        String date = booking.getDate();

        String query = "insert into booking(v_id,no_of_people,email,phone,date,total)" + "values('" + v_id + "','"
                + noOfCustomers + "','" + email + "','" + phone + "','" + date + "','"+booking.getTotal()+"')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }

    public ResultSet selectDetails() {
        String query = "select concat(User.fname,'" + ""
                + "',User.lname) as name,User.phone,venue.v_name,hire.name,booking.date,booking.no_of_people,booking.total from booking join User on booking.email=User.email join venue on booking.v_id=venue.v_id join hire on booking.phone=hire.phone where User.status='"
                + "active" + "' ";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(query);
        return result;
    }
}
