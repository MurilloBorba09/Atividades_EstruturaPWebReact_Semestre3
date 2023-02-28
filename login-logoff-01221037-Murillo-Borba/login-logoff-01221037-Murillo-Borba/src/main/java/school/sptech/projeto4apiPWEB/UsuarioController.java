package school.sptech.projeto4apiPWEB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    private List<Usuario> usuarios;

    public UsuarioController() {
        this.usuarios = new ArrayList<>();
        this.usuarios.add(new Usuario("mborba@sptech.com", "12345", "Murillo"));
        this.usuarios.add(new Usuario("joaozin@sptech.com", "67890", "Jao"));
        this.usuarios.add(new Usuario("gabizin@sptech.com", "52257", "Gabi"));
    }

    /*
        localhost:8080/musicas
    */

    @PostMapping()
    public Usuario cadastrar(@RequestBody Usuario novoUsuario) {
        //Usuario novoUsuario = new Usuario(usuario, senha, nome);
        this.usuarios.add(novoUsuario);
        return novoUsuario;
    }


}
