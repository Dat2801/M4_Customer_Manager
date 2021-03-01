package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public  static List<Customer> customers = new ArrayList<>();
    static {
        customers.add(new Customer(1,"Dat","Dattb28@gmail.com","Thai Binh"));
        customers.add(new Customer(2,"Tu","Tu2002@gmail.com","Nghe An"));
        customers.add(new Customer(3,"Trung","TrungHp@gmail.com","Hai Phong"));
    }
    public List<Customer> findAll(){
        return customers;
    }
}
