package models;

public class Bill {
    private int bill_id;
    private String email;
    private int total;
    private int adv_payment;
    private int remaining_payment;
    private String date;
    public int getBill_id() {
        return bill_id;
    }
    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public int getAdv_payment() {
        return adv_payment;
    }
    public void setAdv_payment(int adv_payment) {
        this.adv_payment = adv_payment;
    }
    public int getRemaining_payment() {
        return remaining_payment;
    }
    public void setRemaining_payment(int remaining_payment) {
        this.remaining_payment = remaining_payment;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Bill(int bill_id, String email, int total, int adv_payment, int remaining_payment, String date) {
        this.bill_id = bill_id;
        this.email = email;
        this.total = total;
        this.adv_payment = adv_payment;
        this.remaining_payment = remaining_payment;
        this.date = date;
    }

    
}
