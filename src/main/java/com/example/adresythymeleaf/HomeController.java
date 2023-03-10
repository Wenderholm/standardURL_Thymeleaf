package com.example.adresythymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.Date;

@Controller
public class HomeController {
    private final PictureRepository pictureRepository;

    public HomeController(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }

//    działa pod adresem /gallery ponieważ takie zależności zostały dodane w application.yml
    @GetMapping("/")
    String home(Model model){
        Collection<Picture> pictures = pictureRepository.findAll();
        model.addAttribute("picture", pictures);
        return "index";
    }
}
