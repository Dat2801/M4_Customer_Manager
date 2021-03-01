package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    public  static List<Customer> customers = new ArrayList<>();
    static {
        customers.add(new Customer(1,"Dat","Dattb28@gmail.com","Thai Binh"));
        customers.add(new Customer(2,"Tu","Tu2002@gmail.com","Nghe An"));
        customers.add(new Customer(3,"Trung","TrungHp@gmail.com","Hai Phong"));
    }
    public List<Customer> findAll(){
        return customers;
    }
    @GetMapping("")
    public ModelAndView showList() {
        List<Customer> list = findAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("customerList", list);
        return modelAndView;
    }
}
