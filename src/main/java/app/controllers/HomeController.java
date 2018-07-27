package app.controllers;

import app.entities.Strategy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    public String home() {
        return "index";
    }

    /*@RequestMapping(method = RequestMethod.GET)
    Iterable<Strategy> findAll(){
        return null;
    }*/
}
