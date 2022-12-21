package models;

public class Booking {
    private int book_id;
    private String email;
    private String phone;
    private int v_id;
    private int noOfCustomers;
    private String date;
    private int total;
    
    public Booking(int book_id, String email, String phone, int v_id, int noOfCustomers, String date, int total) {
        this.book_id = book_id;
        this.email = email;
        this.phone = phone;
        this.v_id = v_id;
        this.noOfCustomers = noOfCustomers;
        this.date = date;
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getV_id() {
        return v_id;
    }

    public void setV_id(int v_id) {
        this.v_id = v_id;
    }

    public int getNoOfCustomers() {
        return noOfCustomers;
    }

    public void setNoOfCustomers(int noOfCustomers) {
        this.noOfCustomers = noOfCustomers;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
}
