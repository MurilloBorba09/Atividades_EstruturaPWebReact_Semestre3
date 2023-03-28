package school.sptech.praticaorm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    // Valores para validacão
    private static final int QUANTIDADE_MIN_CARACTERES = 2;
    private static final double PRECO_MINIMO = 0.01;
    private static final int ESTOQUE_MINIMO = 1;

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public ResponseEntity<Produto> cadastrar(@RequestBody Produto produto) {
        if (isProdutoValido(produto)) {
            Produto produtoRegistrado = produtoRepository.save(produto);
            return ResponseEntity.status(201).body(produtoRegistrado);
        }

        return ResponseEntity.status(400).build();
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listar() {
        List<Produto> todos = produtoRepository.findAll();

        if (todos.isEmpty()) {
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(todos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable int id) {
        return ResponseEntity.of(this.produtoRepository.findById(id));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Produto> remover(@PathVariable int id) {
        Optional<Produto> produtoOpt = this.produtoRepository.findById(id);

        if (produtoOpt.isPresent()) {
            this.produtoRepository.deleteById(id);
            return ResponseEntity.status(200).body(produtoOpt.get());
        }

        return ResponseEntity.status(404).build();
    }

    // Métodos auxiliares
    private boolean isProdutoValido(Produto produto) {

        String nome = produto.getNome();
        double precoUnitario = produto.getPrecoUnitario();
        int quantidadeEstoque = produto.getQuantidadeEstoque();

        return validarNome(nome) && validarPreco(precoUnitario) && validarEstoque(quantidadeEstoque);
    }

    private boolean validarNome(String nome) {
        return nome.length() >= QUANTIDADE_MIN_CARACTERES;
    }

    private boolean validarPreco(double preco) {
        return preco >= PRECO_MINIMO;
    }

    private boolean validarEstoque(int quantidadeEstoque) {
        return quantidadeEstoque >= ESTOQUE_MINIMO;
    }
}
