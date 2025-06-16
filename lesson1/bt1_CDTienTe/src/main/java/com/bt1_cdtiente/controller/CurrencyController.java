package com.bt1_cdtiente.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CurrencyController {

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam double rate,
                          @RequestParam double usd,
                          Model model) {
        double vnd = rate * usd;
        model.addAttribute("result", vnd);
        return "index";
    }
}
