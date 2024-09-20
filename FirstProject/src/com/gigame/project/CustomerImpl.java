package com.gigame.project;

import java.util.ArrayList;
import java.util.List;

public class CustomerImpl implements CustomerRepo{
    private List<Customer> list;
    public CustomerImpl(){
        list= new ArrayList<>();
    }
    @Override
    public Customer addCustomer(String name,String department,double salary) {
        Customer newCustomer= new Customer(name,department,salary);
        list.add(newCustomer);
        return  newCustomer;
    }

    @Override
    public boolean removeCustomer(int id) {
        boolean found=false;
        Customer data=null;
        for(Customer customer:list){
            if(customer.getId()==id){
                data=customer;
                found= true;
                break;
            }
        }
        if(data!=null){
            list.remove(data);
        }
        return found;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return list;
    }

    @Override
    public Customer getCustomerById(int id) {
        for(Customer customer:list){
            if(customer.getId()==id){
                return  customer;
            }
        }
        return null;
    }

    @Override
    public boolean updateCustomerById(int id, double salary) {
        boolean found=false;
        for(Customer customer:list){
            if(customer.getId()==id){
                found= true;
                customer.setSalary(salary);
                break;
            }
        }
        return found;
    }
}
