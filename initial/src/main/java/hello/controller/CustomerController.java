package hello.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hello.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
    @RequestMapping("/customer/")
    public String index(HttpServletRequest request, Model model) {
    	HttpSession session = request.getSession();
    	session.setAttribute("name", "tiger");
    	model.addAttribute("customer", customerService.get(1L));
        return "customer/index";
    }
    
}
