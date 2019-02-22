package com.example.demo;

<<<<<<< HEAD
public class HomeController {
}
=======

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}

>>>>>>> 745af051baf4255d8db4839293b0541b17665ab1
