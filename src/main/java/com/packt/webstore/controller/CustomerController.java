package com.packt.webstore.controller;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customers")
    public String list(Model model) {
        model.addAttribute("customers", customerService.getAllCustomers());
        return "customers";
    }

    ///customers/add
    @RequestMapping(value = "customers/add", method = RequestMethod.GET)
    public String getAddNewCustomerForm(Model model) {
        Customer customer = new Customer();
        model.addAttribute("newCustomer", customer);
        return "addCustomer";
    }

    @RequestMapping(value = "customers/add", method = RequestMethod.POST)
    public String processAddCustomerForm(@ModelAttribute("newCustomer") Customer newCustomer) {
        customerService.addNewCustomer(newCustomer);
        return "redirect:/customers";
    }

}
