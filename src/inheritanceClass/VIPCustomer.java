package inheritanceClass;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;
    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID, customerName);
        this.agentID = agentID;
        customerGrade = "VIP";
        bonusRatio=0.05;
        saleRatio=0.1;
    }
    public int getAgentID(){
        return agentID;
    }
    public String showVIPInfo(){
        return super.showCustomerInfo()+"| 담당 상담원 ID : "+ agentID;
    }
}
