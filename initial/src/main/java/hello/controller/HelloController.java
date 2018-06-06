package hello.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    
    @RequestMapping("/hello/")
    public String index(HttpServletRequest request, Model model) {
    	HttpSession session = request.getSession();
    	System.out.println(session.getAttribute("name"));
    	session.setAttribute("name", "tiger");
        return "hello/index";
    }
    
}
