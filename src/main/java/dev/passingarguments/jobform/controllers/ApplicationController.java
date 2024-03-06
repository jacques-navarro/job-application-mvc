package dev.passingarguments.jobform.controllers;

import dev.passingarguments.jobform.models.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApplicationController {

    @GetMapping("/")
    public String showApplicationForm(Model model) {
        model.addAttribute("application", new Application());
        return "application-form";
    }

    @PostMapping("/process-application")
    public String processApplication(@ModelAttribute("application") Application application) {
        return "application-confirmation";
    }
}