package inheritanceClass;

import java.util.ArrayList;

public class CustomerTest1 {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerA = new Customer(10010,"AAA");
        Customer customerB = new Customer(10020,"BBB");
        Customer customerC = new GoldCustomer(10030,"CCC");
        Customer customerD = new GoldCustomer(10040,"DDD");
        Customer customerE = new VIPCustomer(10050,"DDD",1234);

        customerList.add(customerA);
        customerList.add(customerB);
        customerList.add(customerC);
        customerList.add(customerD);
        customerList.add(customerE);

        System.out.println("----------------");
        for(Customer c : customerList){
            System.out.println(c.showCustomerInfo());
        }
        System.out.println("----------------");
        int price = 10000;
        for(Customer c : customerList){
            int cost = c.calcPrice(price);
            System.out.println(c.getCustomerName()+"님이 지불할 금액 : "+ cost);
            System.out.println(c.getCustomerName()+"님의 현재 포인트 : "+ c.bonusPoint);

        }

/*
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
        System.out.println("============");
        int price = 10000;
        System.out.println(customerLee.getCustomerName()+"님이 지불해야 하는 금액 : "+ customerLee.calcPrice(price));
        System.out.println(customerKim.getCustomerName()+"님이 지불해야 하는 금액 : "+ customerKim.calcPrice(price));
        System.out.println("============");
        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showVIPInfo());

*/
    }
}
