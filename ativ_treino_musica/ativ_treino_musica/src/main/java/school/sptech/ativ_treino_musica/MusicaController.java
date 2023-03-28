package school.sptech.ativ_treino_musica;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    @Autowired
    private MusicaRepository musicaRepository;

    /*
        GET - localhost:8080/musicas
    */

    @GetMapping
    public ResponseEntity<List<Musica>> listar() {
        List<Musica> musicas= this.musicaRepository.findAll();

        if(musicas.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(musicas);
    }

    /*
        GET - localhost:8080/musicas/{id}
    */

    @GetMapping("/{id}")
    public ResponseEntity<Musica> buscarPorId(@PathVariable int id) {
        return ResponseEntity.of(this.musicaRepository.findById(id));
    }

    /*
        POST - localhost:8080/musicas
    */

    @PostMapping
    public ResponseEntity<Musica> cadastrar(@RequestBody @Valid Musica novaMusica) {
        Musica musicaCadastrada = this.musicaRepository.save(novaMusica);

        return ResponseEntity.status(201).body(musicaCadastrada);
    }

    /*
        PUT - localhost:8080/musicas/{id}
    */

    @PutMapping("/{id}")
    public ResponseEntity<Musica> atualizarPorId(@PathVariable int id, @RequestBody @Valid Musica musica) {
        if(this.musicaRepository.existsById(id)) {
            musica.setId(id);
            Musica musicaAtual = this.musicaRepository.save(musica);
            return ResponseEntity.status(200).body(musicaAtual);
        }
        return ResponseEntity.status(404).build();
    }

    /*
        PUT - localhost:8080/musicas/{id}
    */

    @DeleteMapping("/{id}")
    public ResponseEntity<Musica> deletarPorId(@PathVariable int id) {
        if(this.musicaRepository.existsById(id)) {
            this.musicaRepository.deleteById(id);
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }
}
