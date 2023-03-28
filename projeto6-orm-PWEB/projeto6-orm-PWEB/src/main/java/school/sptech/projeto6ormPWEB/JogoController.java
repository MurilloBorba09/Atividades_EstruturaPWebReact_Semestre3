package java.school.sptech.projeto6ormPWEB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    /*
        GET /jogos -> todos os jogos;
        GET /jogos/{indice} -> jogo que ocupa a posição específicada;
        POST /jogos -> cadastrar um jogo;
        DELETE /jogos/{indice} -> remover um jogo;
    */

    // ERRADO -private List<Jogo> jogos = new ArrayList<>();

    @Autowired // Um ponto de injeção de dependência
    private JogoRepository jogoRepository;

    /*
        GET - localhost:8080/jogos
    */

    @GetMapping
    public ResponseEntity<List<Jogo>> listar() {
        List<Jogo> jogos = this.jogoRepository.findAll();

        if(jogos.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(jogos);
    }

    /*
        GET - localhost:8080/jogos/{indice}
    */

    @GetMapping("/{indice}")
    public ResponseEntity<Jogo> buscarPorIndice(@PathVariable Long indice) {

        return ResponseEntity.of(this.jogoRepository.findById(indice));

        /*
        TAMBÉM ESTÁ CORRETO:

        Optional<Jogo> jogoOpt = this.jogoRepository.findById(indice);

        if(jogoOpt.isPresent()) {
            Jogo jogoEncontrado = jogoOpt.get();
            return ResponseEntity.status(200).body(jogoOpt.get());
        }
        return ResponseEntity.status(404).build();
        */
    }

    /*
        POST - localhost:8080/jogos
    */

    @PostMapping
    public ResponseEntity<Jogo> cadastrar(@RequestBody Jogo novoJogo) {
        Jogo jogoRegistrado = this.jogoRepository.save(novoJogo);

        return ResponseEntity.status(201).body(jogoRegistrado);
    }

    /*
        PUT = localhost:8080/jogos/{indice}
    */

    @PutMapping("/{indice}")
    public ResponseEntity<Jogo> atualizar(@PathVariable Long indice, @RequestBody Jogo jogo) {
        if(this.jogoRepository.existsById(indice)) {
            jogo.setId(indice);
            Jogo jogoAtualizado = this.jogoRepository.save(jogo);
            return ResponseEntity.status(200).body(jogoAtualizado);
        }
        return ResponseEntity.status(404).build();
    }

    /*
        DELETE - localhost:8080/jogos/{indice}
    */

    @DeleteMapping("/{indice}")
    public ResponseEntity<Jogo> removerPorIndice(@PathVariable Long indice) {
//        if(indice >= 0 && indice < jogos.size()) {
//            this.jogos.remove(indice);
//            return ResponseEntity.status(200).build();
//        }

        if(this.jogoRepository.existsById(indice)) {

            this.jogoRepository.deleteById(indice);
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }
}
