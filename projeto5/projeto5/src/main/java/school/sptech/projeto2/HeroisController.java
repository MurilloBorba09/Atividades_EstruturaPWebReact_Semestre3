package school.sptech.projeto2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/herois")
public class HeroisController {

    /*
        http://localhost:8080/

        '/'
    */

    private List<Heroi> herois = new ArrayList<>();

    @RequestMapping("/cadastrar/{novoHeroi}")
    public String cadastrarHeroi(@PathVariable Heroi novoHeroi) {
        herois.add(novoHeroi);
        return "Herói cadatrado!";
    }

    @RequestMapping()
    public List mostrarHerois() {
        return herois;
    }


}
