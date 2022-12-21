package models;

public class Venue {
    private int v_id;
    private String v_name;
    private int capacity;
    private float rating;
    private String price;
    public int getV_id() {
        return v_id;
    }
    public void setV_id(int v_id) {
        this.v_id = v_id;
    }
    public String getV_name() {
        return v_name;
    }
    public void setV_name(String v_name) {
        this.v_name = v_name;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public Venue(int v_id, String v_name, int capacity, float rating, String price) {
        this.v_id = v_id;
        this.v_name = v_name;
        this.capacity = capacity;
        this.rating = rating;
        this.price = price;
    }


}
