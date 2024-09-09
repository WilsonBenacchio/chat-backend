package com.site.chatteste.frontendcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {

	@GetMapping(value = { "/", "/{path:[^\\.]*}" })
    public String index() {
        
        return "forward:/index.html";
    }
}
