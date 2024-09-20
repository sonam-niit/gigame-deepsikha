package com.gigame.project;

import java.util.List;

//User Interface
public interface CustomerRepo {
    public Customer addCustomer(String name,String department,double salary);
    public boolean removeCustomer(int id);
    public List<Customer> getAllCustomers();
    public Customer getCustomerById(int id);
    public boolean updateCustomerById(int id, double salary);
}
