package com.hombrenieve.anuncios;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AnuncioController {

    private List<Advertisement> adverts = new ArrayList<Advertisement>();


    @PostConstruct
    public void init() {
        adverts.add(new Advertisement("Pablo", "Vendo moto", "Pocos kms"));
        adverts.add(new Advertisement("Paco", "Vendo mesa", "impecable"));
        adverts.add(new Advertisement("Juan", "Vendo casa", "bueno estado"));
    }


    @GetMapping("/newAd")
    public String newAd(Model model, Advertisement ad) {
        adverts.add(ad);
        return "/anuncioGuardado.html";

    }

    @GetMapping("/")
    public String ads(Model model) {
        model.addAttribute("adverts", adverts);
        return "listaAnuncios";
    }

    @GetMapping("/advs/{id}")
    public String ad(Model model, @PathVariable int id) {
        Advertisement adv = adverts.get(id-1);
        model.addAttribute("adv", adv);
        return "anuncio";
    }
}
