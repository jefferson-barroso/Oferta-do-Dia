package com.ofertadodia.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScrapingService {

    public List<String> getTitulosPromocao() {
        List<String> titulos = new ArrayList<>();
        String url = "https://www.tecmundo.com.br/"; // URL de exemplo

        try {
            // Conecta e pega o documento HTML da página
            Document doc = Jsoup.connect(url).get();

            // Procura todos os elementos que contêm os títulos das notícias
            // Neste exemplo, os títulos estão dentro de um 'h3' com a classe 'tec--card__title'
            // Você precisará inspecionar o site do mercado para encontrar os seletores corretos
            for (Element element : doc.select("h3.tec--card__title")) {
                titulos.add(element.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Lidar com exceção, por exemplo, retornar uma lista vazia ou um erro
        }

        return titulos;
    }
}