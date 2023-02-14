package school.sptech.projeto2;

public class Heroi {

    private String nome;
    private String habilidade;
    private Integer idade;
    private Integer forca;
    private Boolean vivo;

    public Heroi(String nome, String habilidade, Integer idade, Integer forca, Boolean vivo) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
        this.forca = forca;
        this.vivo = vivo;
    }

    public String getNome() {
        return nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getForca() {
        return forca;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }
}
