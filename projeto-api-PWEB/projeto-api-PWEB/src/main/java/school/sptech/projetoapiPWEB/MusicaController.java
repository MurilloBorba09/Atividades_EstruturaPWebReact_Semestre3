package school.sptech.projetoapiPWEB;

import org.springframework.web.bind.annotation.*;
import school.sptech.projetoapiPWEB.Musica;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    /*
        CRUD:

        Create
        Read
        Update
        Delete
    */

    private List<Musica> musicas;

    public MusicaController() {
        this.musicas = new ArrayList<>();
        this.musicas.add(new Musica("Bota na pipokinha", 2022, true));
        this.musicas.add(new Musica("Smells like teen spirit", 1993, false));
        this.musicas.add(new Musica("Ela partiu", 1980, true));
    }

    /*
        Cabeçalho ou headers
        Verbo ou método
        URL

        localhost:8080/musicas
    */

    @GetMapping()
    public List<Musica> listar() {
        return musicas;
    }

    /*
        ERRADO (redundância)
        GET - localhost:8080/musicas/buscar-por-indice/{indice}

        CERTO (redundância)
        GET - localhost:8080/musicas/{indice}
    */

    @GetMapping("/{indice}")
    public Musica buscarPorIndice(@PathVariable int indice) {
        if(indice >= 0 && indice < musicas.size()) {
            return musicas.get(indice);
        }
        return null;
    }

    /*
        ERRADO
        localhost:8080/musicas/remover/{indice}

        CERTO
        localhost:8080/musicas/{indice}
    */

    @DeleteMapping("/{indice}")
    public String removerPorIndice(@PathVariable int indice) {
        if(indice >= 0 && indice < musicas.size()) {
            musicas.remove(indice);
            return "Removido com sucesso!";
        }
        return "Música não encontrada.";
    }

    /*
        ERRADO
        GET - localhost:8080/musicas/cadastrar/{nome}/{anoLancamento}/{nacional}

        CERTO
        POST - localhost:8080/musicas/

        JSON válido no corpo da requisição
    */

    @PostMapping
    public Musica cadastrar(@RequestBody Musica novaMusica){
        //Musica novaMusica = new Musica(nome, anoLancamento, nacional);
        this.musicas.add(novaMusica);
        return novaMusica;
    }

    /*
        GET - localhost:8080/musicas/atualizar/{indice}/{nome}/{anoLancamento}/{nacional}
    */

    @PatchMapping("/{indice}")
    public Musica atualizar(@PathVariable int indice, @RequestBody Musica musicaAtualizada) {
        if(indice >= 0 && indice < musicas.size()) {
            //Musica novaMusica = new Musica(nome, anoLancamento, nacional);
            this.musicas.set(indice, musicaAtualizada);
            return musicaAtualizada;
        }
        return null;
    }
}
