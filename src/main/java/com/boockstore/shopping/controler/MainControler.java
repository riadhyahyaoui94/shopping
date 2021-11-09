package com.boockstore.shopping.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControler {
    @GetMapping("")
    public String showHomepage(){
        return "index";

    }

}
