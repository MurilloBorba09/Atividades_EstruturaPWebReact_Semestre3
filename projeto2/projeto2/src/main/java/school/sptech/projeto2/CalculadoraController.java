package school.sptech.projeto2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadoras")
public class CalculadoraController {

    /*
        /subtrair/numero1/numero2

        Resultado: x

        localhost:8080/calculadoras/sub/5/10
    */

    @GetMapping("/sub/{numero1}/{numero2}")
    public String subtrair(@PathVariable int numero1,@PathVariable int numero2) {
        return String.format("Resultado: %d", (numero1 - numero2));
    }
}
