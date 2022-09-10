package com.javafee.java.lessons.lesson5;

public class Invoice {
    public int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer,double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId(){
        return customer.getId();
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public int getCustomerDiscount(){
        return customer.getDiscount();
    }

    // amount: 100
    // customer.getDiscount(): 20
    // 100 - (100 * (20 / 100))
    // 100 - 20 / 100
    public double getAmountAfterDiscount(){
        return (amount - (amount * (getCustomerDiscount()%100)));
    }

    @Override
    public String toString() {
        return "Invoice [ id=" + id + ", customer=" + customer.toString() + ",amount=" + amount + "]";
    }
}
