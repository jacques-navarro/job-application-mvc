package dev.passingarguments.jobform.controllers;

import dev.passingarguments.jobform.models.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/")
    public String showApplicationForm(Model model) {
        model.addAttribute("application", new Application());
        return "application-form";
    }
}