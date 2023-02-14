package school.sptech.projeto2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contadores")
public class ContadorController {

    private int contador;

    @GetMapping("/atual")
    public int getAtual() {
        return contador;
    }

    @GetMapping("/somar")
    public String somar() {
        contador++;
        return "O contador aumentou em 1";
    }
}
