package com.hombrenieve.anuncios;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnuncioController {

    @RequestMapping("/newAd")
    public String newAd(Model model, @RequestParam String name, @RequestParam String subject, @RequestParam String comment) {
        model.addAttribute("name", name);
        model.addAttribute("subject", subject);
        model.addAttribute("comment", comment);

        return "anuncio";

    }
}
