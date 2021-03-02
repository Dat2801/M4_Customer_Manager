package service.customer;

import model.Customer;
import service.customer.ICustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {
    public  static List<Customer> customers = new ArrayList<>();
    static {
        customers.add(new Customer(1,"Dat","Dattb28@gmail.com","Thai Binh"));
        customers.add(new Customer(2,"Tu","Tu2002@gmail.com","Nghe An"));
        customers.add(new Customer(3,"Trung","TrungHp@gmail.com","Hai Phong"));
    }
    public List<Customer> findAll(){
        return customers;
    }

    @Override
    public Customer save(int id, Customer customer) {
        customers.set(id, customer);
        return customer;
    }

    @Override
    public Customer edit(int id, Customer customer) {
        return null;
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void delete(int id) {

    }
}
