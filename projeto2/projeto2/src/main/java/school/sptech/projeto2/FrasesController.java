package school.sptech.projeto2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    @RestController --> anotação (annotation)
    dá poderes a classe.

    metaprogramação
*/

@RestController
@RequestMapping("/frases")
public class FrasesController {

    /*
        http://localhost:8080/

        '/'
    */

    @GetMapping("/bom-dia") // transformar o método em um endpoint do tipo GET (verbo)
    public String bomDia() {
        return "Bom dia!";
    }

    @GetMapping("/boa-tarde") // Especificar ema URI
    public String boaTarde() {
        return "Boa tarde!";
    }

    @GetMapping("/boa-noite") // Especificar ema URI
    public String boaNoite() {
        return "Boa noite!";
    }
}

