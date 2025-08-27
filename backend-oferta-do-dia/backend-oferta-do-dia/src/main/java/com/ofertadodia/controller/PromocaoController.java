package com.ofertadodia.controller;

import com.ofertadodia.service.ScrapingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/promocoes")
public class PromocaoController {

    private final ScrapingService scrapingService;

    public PromocaoController(ScrapingService scrapingService) {
        this.scrapingService = scrapingService;
    }

    @GetMapping
    public List<String> getPromocoes() {
        return scrapingService.getTitulosPromocao();
    }
}