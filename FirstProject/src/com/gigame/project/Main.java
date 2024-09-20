package com.gigame.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerRepo repo= new CustomerImpl();
        Scanner scanner= new Scanner(System.in);
        while (true){
            System.out.println("Enter 1 to addCustomer, 2 to remove, 3 to get all, 4 to get byId 5 to update");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter Name");
                    String name= scanner.next();
                    System.out.println("Enter department");
                    String department= scanner.next();
                    System.out.println("Enter Salary");
                    double salary= scanner.nextDouble();
                    System.out.println(repo.addCustomer(name,department,salary));
                    break;
                case 2:
                    System.out.println("Enter id to remove");
                    int idRemove = scanner.nextInt();
                    if (repo.removeCustomer(idRemove))
                        System.out.println("Removed successfully");
                    else
                        System.out.println("No Id found to delete");
                    break;
                case 3:
                    System.out.println(repo.getAllCustomers()); break;
                case 4:
                    System.out.println("Enter id to find");
                    int idFind = scanner.nextInt();
                    Customer data= repo.getCustomerById(idFind);
                    if (data!=null)
                        System.out.println(data);
                    else
                        System.out.println("No Id found");
                    break;
                case 5:
                    break;
            }
            System.out.println("enter n to break");
            String op= scanner.next();
            if(op.equals("Y") || op.equals("y"))
                break;
        }
    }
}
