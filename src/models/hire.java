package models;

public class hire {
    private String hire_name;
    private String hire_phone;
    private String hire_experience;
    private String hire_role;
    private String hire_price;

    public String getHire_price() {
        return hire_price;
    }
    public void setHire_price(String hire_price) {
        this.hire_price = hire_price;
    }
    public String gethire_name(){
        return this.hire_name;
    }
    public void sethire_name(String hire_name){
        this.hire_name = hire_name;
    }
    public String gethire_phone(){
    return this.hire_phone;
    }
    public void sethire_phone(String hire_phone){
        this.hire_phone = hire_phone;
    }
    public String gethire_experience(){
        return this.hire_experience;
    }
    public void sethire_experience(String hire_experience){
        this.hire_experience = hire_experience;
    }
    public String gethire_role(){
        return this.hire_role;
    }
    public void sethire_role(String hire_role){
        this.hire_role = hire_role;
    }
    


    public hire(String hire_name,
    String hire_phone,
    String hire_experience,
    String hire_role,
    String hire_price){
        this.hire_name=hire_name;
        this.hire_phone=hire_phone;
        this.hire_experience = hire_experience;
        this.hire_role=hire_role;
        this.hire_price = hire_price;
    }
}
