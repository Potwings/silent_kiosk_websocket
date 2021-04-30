package org.judy.silent_kiosk.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/test")
public class TestController {
    @GetMapping("/chat")
    public void testChat(@ModelAttribute("sno") Long sno){
    }

    @GetMapping("/testFetch")
    public void testFetch(){

    }
}
