package com.hombrenieve.anuncios;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AnuncioController {

    @PostMapping("/newAd")
    public String newAd(Model model, Advertisement ad) {
        model.addAttribute("adv", ad);

        return "anuncio";

    }
}
