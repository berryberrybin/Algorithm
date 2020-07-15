package inheritanceClass;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010,"AAA");
        //customerLee.setCustomerID(10010);
        //customerLee.setCustomerName("AAA");
        customerLee.bonusPoint=1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10020,"BBB",777);
        //customerKim.setCustomerID(10020);
        //customerKim.setCustomerName("BBB");
        customerKim.bonusPoint = 1000;
        System.out.println(customerKim.showVIPInfo());
    }
}
