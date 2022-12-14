package models;

public class User {
    private String user_fname;
    private String user_lname;
    private String user_email;
    private String user_phone;
    private String user_password;
    private String user_sq;
    private String user_feedback;
    private String user_notification;
    private String user_advancePayement;
    private String user_ramainingPayement;

    public String getUser_fname() {
        return this.user_fname;
    }

    public void setUser_fname(String user_fname) {
        this.user_fname = user_fname;
    }

    public String getUser_lname() {
        return this.user_lname;
    }

    public void setUser_lname(String user_lname) {
        this.user_lname = user_lname;
    }

    public String getUser_email() {
        return this.user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
    
    public String getUser_phone() {
    return this.user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_password() {
        return this.user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }


    public String getUser_sq(){
        return this.user_sq;
    }
    public void setUSer_sq(String user_sq){
        this.user_sq = user_sq;

    }
    public String getUser_feedback(){
        return this.user_feedback;
    }
    public void setUser_feedback(String user_feedback){
        this.user_feedback = user_feedback;
    }
    public String getUser_notification(){
        return this.user_notification;
    }
    public void setUser_notification(String user_notification){
        this.user_notification = user_notification;
    }
    public String getUser_advancePayement(){
        return this.user_advancePayement;
    }
    public void setUser_advancePayement(String user_advancePayement){
        this.user_advancePayement = user_advancePayement;
    }
    public String getUser_user_ramainingPayement(){
        return this.user_ramainingPayement;
    }
    public void setUser_user_ramainingPayement(String user_ramainingPayement){
        this.user_ramainingPayement = user_ramainingPayement;
    }
    
    


    public User(String user_fname,
    String user_lname,
    String user_email,
    String user_phone,
    String user_password,
    String user_sq,
    String user_feedback,
    String user_notification,
    String user_advancePayement,
    String user_ramainingPayement){
        this.user_fname=user_fname;
        this.user_lname=user_lname;
        this.user_email = user_email;
        this.user_phone = user_phone;
        this.user_password = user_password;
        this.user_sq =user_sq;
        this.user_feedback = user_feedback;
        this.user_notification = user_notification;
        this.user_advancePayement = user_advancePayement;
        this.user_ramainingPayement = user_ramainingPayement;

    }

    
}
