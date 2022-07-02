public class Jogo extends Item{
    int numero_jogadores;
    String plataforma;

    Jogo(String titulo, int numero_jogadores, String plataforma){
        this.titulo = titulo;
        this.numero_jogadores = numero_jogadores;
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "numero_jogadores=" + numero_jogadores +
                ", plataforma='" + plataforma + '\'' +
                "} " + super.toString();
    }
}
