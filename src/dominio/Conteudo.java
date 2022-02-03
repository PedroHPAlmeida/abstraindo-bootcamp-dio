package dominio;

public abstract class Conteudo {

    protected static double XP_PADRAO = 10d;

    // attributes
    private String titulo;
    private String descricao;

    // constructor
    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    // getters & setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // methods
    public abstract double calcularXp();
}
