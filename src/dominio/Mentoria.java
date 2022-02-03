package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    // attributes
    private LocalDate data;

    // constructor
    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    // getters & setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // methods
    @Override
    public double calcularXp() {
        return XP_PADRAO += 20d;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Mentoria{");
        sb.append("titulo='").append(getTitulo()).append('\'');
        sb.append(", descricao='").append(getDescricao()).append('\'');
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
