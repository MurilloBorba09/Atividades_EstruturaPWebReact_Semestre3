package school.sptech.projeto6ormPWEB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity // Agora reflete uma entidade do BD
public class Jogo {

    @Id // Aqui definimos a chave primária PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esse identificador é auto incremental
    private Long id;

    // VARCHAR => String
    private String nome;

    // DATE ano_lancamento no banco => LocalDatem, Date, OffDateTime, LocalDateTime, Calendar
    private LocalDate anoLancamento;

    public Jogo() {
    }

    public Jogo(Long id, String nome, LocalDate anoLancamento) {
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(LocalDate anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "\n Id = " + id +
                "\n Nome = " + nome +
                "\n Ano de lançamento = " + anoLancamento;
    }
}