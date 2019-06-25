package com.eddie;

public class Main {

    public static void main(String[] args) {

//        BankAccount bankAccount = new BankAccount(4420,1000,"Eddie Hudson","eddie@flexrentalsolutions.com","+51 1 81 8022 1877");
//        BankAccount defaultAccount = new BankAccount();

//        bankAccount.setBalance(1000);
//        bankAccount.setAccountNumber(4420);
//        bankAccount.setCustomerName("Eddie Hudson");
//        bankAccount.setEmail("eddie@flexrentalsolutions.com");
//        bankAccount.setPhoneNumber("+52 1 8022 1877");
//        System.out.println("Account Number: " + bankAccount.getAccountNumber());
//        System.out.println("Customer: " + bankAccount.getCustomerName());
//        System.out.println("Email: " + bankAccount.getEmail());
//        System.out.println("Phone Number: " + bankAccount.getPhoneNumber());
//        System.out.println("Account Number: " + defaultAccount.getAccountNumber());
//        System.out.println("Customer: " + defaultAccount.getCustomerName());
//        System.out.println("Email: " + defaultAccount.getEmail());
//        System.out.println("Phone Number: " + defaultAccount.getPhoneNumber());
//
//        bankAccount.depositFunds(4420, 250);
//        bankAccount.withdrawFunds(4420,126);
//        bankAccount.withdrawFunds(4420,532);
//        bankAccount.withdrawFunds(4421,100);
//        bankAccount.withdrawFunds(4420,100);
//        bankAccount.withdrawFunds(4420,492.01);
//
//        BankAccount eddiesAccount = new BankAccount("Eddie", "eddie@eddie.com", "12345");
//        System.out.println(eddiesAccount.getAccountNumber() + " name:" + eddiesAccount.getCustomerName());


        VipCustomer eddie = new VipCustomer();
        System.out.println(eddie.getName());
        System.out.println(eddie.getEmailAddress());
        System.out.println(eddie.getCreditLimit());
        System.out.println();
        VipCustomer adriana = new VipCustomer("Adriana", "adriana@adriana.com");
        System.out.println(adriana.getName());
        System.out.println(adriana.getEmailAddress());
        System.out.println(adriana.getCreditLimit());
        System.out.println();
        VipCustomer erik = new VipCustomer(10000.00, "Erik", "erik@erik.com");
        System.out.println(erik.getName());
        System.out.println(erik.getEmailAddress());
        System.out.println(erik.getCreditLimit());

    }
}
