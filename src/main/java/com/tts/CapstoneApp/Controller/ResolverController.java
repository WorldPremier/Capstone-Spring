package com.tts.CapstoneApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResolverController {


    @GetMapping("/search")
    public String resolveSearchView(Model model){
        return "index.html";
    }

    @GetMapping("/favorites")
    public String resolveFavoritesView(Model model){
        return "index.html";
    }



}
