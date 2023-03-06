package school.sptech.atividade01_PWEB_0603;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/boletins")
public class BoletimController {

    private List<Boletim> boletins;

    public BoletimController() {
        this.boletins = new ArrayList<>();
        this.boletins.add(new Boletim("Murillo", 10.0, 8.5, 7.0));
        this.boletins.add(new Boletim("Marcia", 9.0, 9.5, 9.0));
    }

    /*
     localhost:8080/boletins
    */

    @GetMapping()
    public List<Boletim> listar() {
        return boletins;
    }

    /*
        localhost:8080/musicas/{indice}
    */

    @GetMapping("/{indice}")
    public Boletim listarPorID(@PathVariable int indice) {
        if(indice >= 0 && indice < boletins.size()) {
            return boletins.get(indice);
        }
        return null;
    }

    /*
        localhost:8080/musicas/{indice}
    */

    @DeleteMapping("/indice")
    public String deletarPorID(@PathVariable int indice) {
        if(indice >= 0 && indice < boletins.size()) {
            boletins.remove(indice);
            return "Excluído! ";
        }
        return "Deu ruim!";
    }
}
