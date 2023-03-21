package school.sptech.apirestfilmes;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private List<Filme> filmes;

    public FilmeController() {
        this.filmes = new ArrayList<>();
        this.filmes.add(new Filme("Senhor dos Anéis", 2003, 11));
    }

    /*
        localhost:8080/filmes
    */

    @GetMapping
    public List<Filme> listar() {
        return filmes;
    }

    /*
        localhost:8080/filmes/{indice}
    */

    @GetMapping("/{indice}")
    public Filme buscarPorIndice(@PathVariable int indice) {
        if(indice >= 0 && indice < filmes.size()) {
            return filmes.get(indice);
        }
        return null;
    }

    /*
        localhost:8080/filmes
    */

    @PostMapping
    public Filme cadastrar(@RequestBody Filme novoFilme) {
        if(novoFilme.getNome().length() > 2 && novoFilme.getAnoLancamento() > 1895) {
            //Filme novoFilme = new Filme(nome, anoLancamento, qtdOscar);
            this.filmes.add(novoFilme);
            return novoFilme;
        }
        return null;
    }

    /*
        localhost:8080/filmes/{indice}
    */

    @PutMapping("/{indice}")
    public Filme atualizar(@PathVariable int indice, @RequestBody Filme filmeAtualizada) {
        if(indice >= 0 && indice < filmes.size()) {
            //Filme novoFilme = new Filme(nome, anoLancamento, qtdOscar);
            this.filmes.set(indice, filmeAtualizada);
            return filmeAtualizada;
        }
        return null;
    }

    /*
        localhost:8080/filmes/{indice}/novaQtdOscars
    */

    @PatchMapping
    public void atualizarOscars(@PathVariable int indice, @PathVariable int novaQtdOscars) {
        if(indice >= 0 && indice < filmes.size()) {
            filmes.get(indice).setQtdOscar(novaQtdOscars);
        }
    }
}
