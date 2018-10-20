package com.thirtylion.menspouch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 20/10/2018.
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
