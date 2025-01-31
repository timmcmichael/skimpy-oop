/*
 * MobileCustomerDemo
 * Tests and demonstrates functionality of the MobileCustomer class by instantiating objects and using instance methods.
 */

public class MobileCustomerDemo {
   
    public static void main(String[] args) {
        MobileCustomer customer1;
        customer1 = new MobileCustomer();
        MobileCustomer customer2 = new MobileCustomer();

        customer1.setName("Deadpool");
        customer1.setPhoneNumber("800-867-5309");
        customer1.setMonthlyData(20.0);
        customer2.setName("Ryan Reynolds");

        System.out.println(customer1.getName());
        System.out.println(customer1.getPhoneNumber());
        System.out.println(customer1.getRemainingData());
        System.out.println(customer1.getMonthlyData());

        customer1.useData(2.5);
        customer1.addData(1.25);
        System.out.println("Still remaining: " + customer1.getRemainingData());

        customer1.resetData();
        System.out.println("After reset: " + customer1.getRemainingData());

        System.out.println("---------- customer2");
        System.out.println(customer2.getName());

    }


}
