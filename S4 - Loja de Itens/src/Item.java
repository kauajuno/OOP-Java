public abstract class Item {
    String titulo;
    int ano;
    String tempo_duracao;
    String comentarios;

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public void setTempo_duracao(String tempo_duracao) {
        this.tempo_duracao = tempo_duracao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Item{" +
                "titulo='" + titulo + '\'' +
                ", ano=" + ano +
                ", tempo_duracao='" + tempo_duracao + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
