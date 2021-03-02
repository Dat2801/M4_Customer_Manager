package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.customer.CustomerService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    CustomerService customerService = new CustomerService();

    @GetMapping("")
    public ModelAndView showList() {
        List<Customer> list = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("customerList", list);
        return modelAndView;
    }

    @GetMapping("/search")
    public ModelAndView modelAndView(@RequestParam String name, String a) {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("search", name);
        modelAndView.addObject("a", a);
        return modelAndView;
    }

    @PostMapping("edit/{id}")
    public ModelAndView editCustomer(@RequestParam String name, String email, String address, @PathVariable int id) {
        Customer customer = new Customer(id, name, email, address);
        customerService.save(id, customer);
        return new ModelAndView("list", "customerList", customerService.findAll());
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView showFormEdit(@PathVariable int id) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
}
