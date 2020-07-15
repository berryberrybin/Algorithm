package inheritanceClass;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    /*public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }
*/
    public Customer(){
        initCustomer();
    }
    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        initCustomer();
        //customerGrade = "SILVER";
        //bonusRatio = 0.01;
    }
    private void initCustomer(){
        customerGrade = "SILVER";
        bonusRatio=0.01;
    }
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }
    public String showCustomerInfo(){
        return customerName +"님 -> 등급 : " + customerGrade +" | 보너스 포인트 : "+bonusPoint;
    }

    public int getCustomerID(){
        return customerID;
    }
    public void setCustomerID(int customerID){
        this.customerID=customerID;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public String getCustomerGrade(){
        return customerGrade;
    }
    public void setCustomerGrade(String customerGrade){
        this.customerGrade=customerGrade;
    }
}
