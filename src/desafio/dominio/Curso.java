package desafio.dominio;

public class Curso {
    private String titulo,descricao;
    private int cargoraria;

    public Curso() {
    }

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

    public int getCargoraria() {
        return cargoraria;
    }

    public void setCargoraria(int cargoraria) {
        this.cargoraria = cargoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargoraria=" + cargoraria +
                '}';
    }
}
