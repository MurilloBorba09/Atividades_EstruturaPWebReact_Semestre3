package school.sptech.projeto2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    /*
        http://localhost:8080/

        '/'
    */

    private List<String> pokemons = new ArrayList<>();

    @GetMapping("/quantidade") // Especificar uma URI
    public String getQuantidade() {
        return String.format("Total de pokemon cadastrados: %d", pokemons.size());
    }

    @GetMapping("/cadastrar/{novoPokemon}") // Especificar uma URI
    public String cadastrar(@PathVariable String novoPokemon) {
        pokemons.add(novoPokemon);
        return "Pokemon cadastrado";
    }

    @GetMapping("/recuperar/{indice}") // Especificar uma URI
    public String recuperar(@PathVariable int indice) {
        if(indice >= 0 && indice < pokemons.size()) {
            return pokemons.get(indice);
        }
        return "Pokemon não encontrado!";
    }

    @GetMapping("/excluir/{indice}") // Especificar uma URI
    public String excluir(@PathVariable int indice) {
        if(indice >= 0 && indice < pokemons.size()) {
            pokemons.remove(indice);
            return "Pokemon removido!";
        }
        return "Pokemon não encontrado!";
    }

    @GetMapping("/atualizar/{indice}/{novoNome}") // Especificar uma URI
    public String atualizar(@PathVariable int indice, @PathVariable String novoNome) {
        if(indice >= 0 && indice < pokemons.size()) {
            pokemons.get(indice);

            return "Pokemon atualizado!";
        }
        return "Pokemon não encontrado!";
    }
}
