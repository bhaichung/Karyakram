package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.Venue;

public class venueController {
    DbConnection dbConnection;

    public ResultSet selectVenue(){
        String query = "select * from venue";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(query);
        return result;
    }
    public ResultSet selectVenueId(Venue venue){
        String query = "select * from venue where v_name='"+venue.getV_name()+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(query);
        return result;
    }
    public ResultSet selectVenueName(Venue venue){
        String query = "select v_id,price from venue where v_name='"+venue.getV_name()+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(query);
        return result;
    }

}
